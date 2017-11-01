package controle;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

import model.DaoEmpreendedor;
import model.DaoEmpresa;


/**
 * Servlet implementation class RecuperarSenhaServlet
 */
@WebServlet("/RecuperarSenhaServlet")
public class RecuperarSenhaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public RecuperarSenhaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//VALIDAR EMAIL: VERIFICAR USUARIO QUE FEZ A SOLICITAÇÃO:
		//EMPREENDEDOR
		String email = request.getParameter("email");
		if( request.getParameter("tipoLogin").equalsIgnoreCase("Empreendedor")){
			DaoEmpreendedor daoEmpreendedor = new DaoEmpreendedor();
			 try {
				
				 if(daoEmpreendedor.validarEmail(email)){
					 //EMAIL VALIDO: REDIRECIONAR PARA PROXIMA TELA
					 
						//COLOCAR USUARIO NA SESSAO:
					HttpSession sessaoUsuario = request.getSession();
					 sessaoUsuario.setAttribute("usuarioSessao", email);
					 //COLOCAR TIPO DE CADASTRO NA SESÃO:
					 HttpSession sessaoTipo = request.getSession();
					 sessaoTipo.setAttribute("tipoUsuario", "Empreendedor");
					 
						//GERAR CODIGO E MANDAR VIA EMAIL:
						
						daoEmpreendedor.gravarCodigo(email);
									
						RequestDispatcher visualizar = request.getRequestDispatcher("inserircodigo.jsp");
						request.setAttribute("usuarioLogado", email);
						
						
						visualizar.forward(request, response);
						System.out.println("passou aqui REDIRECIONAMENTO REDIRECIONAMENTO");
					 
					 
					 
					 
				 }else{
					 // EMAIL INVALIDO
					 
					//REDIRECIONAR PARA MESMA PAGINA:
						
						request.setAttribute("validarEmail", "Email Invalido!");
						
						RequestDispatcher visualizar = request.getRequestDispatcher("recuperacaoSenha.jsp");
						request.setAttribute("usuarioLogado", email);
						
						
						visualizar.forward(request, response);
						System.out.println("passou aqui REDIRECIONAMENTO REDIRECIONAMENTO");
						
					 
				 }
				 
			} catch (Exception e) {
				// TELA DE ERRO DO SISTEMA:
				e.printStackTrace();
			}
			
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//RECEBENDO PARAMENTROS:
		String novaSenha=	request.getParameter("novasenha");
		
		
		//RECEBENDO USUARIO DA SESSÃO:
		HttpSession sessaoUsuario = request.getSession();
		String usuarioLogado = (String) sessaoUsuario.getAttribute("usuarioSessao");
		System.out.println("Usuario Logado para Cadastra nova senha: "+usuarioLogado);
		
		HttpSession tipoUsuario = request.getSession();
		String  tipo = (String) tipoUsuario.getAttribute("tipoUsuario");
		//CADASTRA NOVA SENHA
		
		if(tipo.equalsIgnoreCase("Empreendedor")){
			DaoEmpreendedor daoEmpreendedor = new DaoEmpreendedor();
		
			try {
				
				daoEmpreendedor.salvarNovaSenha(usuarioLogado, novaSenha);
				
				
				RequestDispatcher visualizar = request.getRequestDispatcher("login.jsp");
				//*******DESTRUIR  A SESSÃO:
				sessaoUsuario.invalidate();
				
				visualizar.forward(request, response);
				
				//*****REDIRECIONAR PARA PAGINA DE SUCESSO:
				
			} catch (Exception e) {
				// PAGINA DE ERRO:
			}
			
			
			
			
		}
		
	}
		
		
		
	}


