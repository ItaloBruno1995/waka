package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DaoEmpreendedor;


/**
 * Servlet implementation class CadastroNovaSenhaServlet
 */
@WebServlet("/CadastroNovaSenhaServlet")
public class CadastroNovaSenhaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroNovaSenhaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // VERIFICAR TIPO DE USUARIO:
		HttpSession sessaoUsuario = request.getSession();
		String tipoUsuario = (String) sessaoUsuario.getAttribute("tipoUsuario");
		System.out.println("Tipo de Usuario para nova Senha "+tipoUsuario);
		int  codigoInformado = Integer.parseInt(request.getParameter("codigo"));


	if(tipoUsuario.equalsIgnoreCase("Empreendedor")){
			DaoEmpreendedor daoEmpreendedor = new DaoEmpreendedor();
			//VALIDAR CODIGO:
			try {
				if(daoEmpreendedor.validarCodigo(codigoInformado)){
					// REDIRECIONAR PARA PAGINA DE CADASTRO DE SENHA
					RequestDispatcher visualizar = request.getRequestDispatcher("novasenha.jsp");
						System.out.println("mandou para cadastra nova senha");
					visualizar.forward(request, response);
					System.out.println("passou aqui REDIRECIONAMENTO REDIRECIONAMENTO");
				}else{
					// REDIRECIONAR PARA MESMA PAGINA
					RequestDispatcher visualizar = request.getRequestDispatcher("inserircodigo.jsp");
						System.out.println("mandoupara mesma pagina inserir codigo");
						request.setAttribute("validarCodigo", "Codigo Invalido");
					visualizar.forward(request, response);
				
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//OUTRO IF
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//RECEBENDO PARAMENTROS:
		String novaSenha=	request.getParameter("novasenha");
		
		
		
		//RECEBENDO USUARIO DA SESSÃO:
		HttpSession sessaoUsuario = request.getSession();
		String usuarioLogado = (String) sessaoUsuario.getAttribute("usuarioSessao");
		System.out.println("Usuario Logado para Cadastra nova senha: "+usuarioLogado);
		
		//TIPO DE USUARIO LOGADO PARA CADASTRA NOVA SENHA 

		HttpSession sessaoTipo = request.getSession();
		String tipoUsuario = (String) sessaoTipo.getAttribute("tipoUsuario");
		System.out.println("!!!! TIPO USUARIO!!! : "+tipoUsuario);//FUNCIONANDO

		//CADASTRA NOVA SENHA
			DaoEmpreendedor daoempreendedor = new DaoEmpreendedor();
		
			try {
				
				daoempreendedor.salvarNovaSenha(usuarioLogado, novaSenha);
				
				
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
