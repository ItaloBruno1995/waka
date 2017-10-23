package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BeanEmpreendedor;
import model.BeanEmpresa;
import model.DaoEmpreendedor;
import model.DaoEmpresa;

/**
 * Servlet implementation class CadastroEmpresaServlet
 */
@WebServlet("/CadastroEmpresaServlet")
public class CadastroEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroEmpresaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("chegou aqui"); 
		
		//INSTANCIA DE OBJETOS:
		BeanEmpreendedor empreendedor = new BeanEmpreendedor();
		DaoEmpreendedor daoempreendedor = new DaoEmpreendedor();
		BeanEmpresa empresa= new BeanEmpresa();
		DaoEmpresa daoEmpresa = new DaoEmpresa();
		HttpSession session = request.getSession();
		
		//RECEBENDO ATRIBUTO DA SESS�O(USUARIO QUE ACABOU DE FAZER CADASTRO):
		String UsuarioLogado= (String) session.getAttribute("sessaoAdministrador");
		
	 //RECEBENDO REQUISIÇÃO
		empresa.setCnpj(request.getParameter("cnpj"));
		empresa.setNome(request.getParameter("nomeEmpresa"));
		empresa.setRamoAtuacao(request.getParameter("ramoAtuacao"));
		empresa.setRazaoSocial(request.getParameter("razaoSocial"));
		empresa.setIdEmpreendedor(UsuarioLogado);
		
		
		
		System.out.println("Usuario Logado no SISTEMA RECEBEMOS NA SERVLET2: "+UsuarioLogado);
		
		//EXUCUTAR CADASTRO DE EMPREENDEDOR:
		//daoempreendedor.cadastroEmpreendedor(empreendedor);
		
		//SETAR CHAMVE PRIMARIA DE EMPREENDEDOR
	
		//EXUCUTAR CADASTRO DE EMPRESA
		System.out.println("ATRIBUTO NO EMPRESSA IDEMPRENDEDOR!"+empresa.getIdEmpreendedor());
		daoEmpresa.cadastraEmpresa(empresa);
		
		//TESTE:
		System.out.println("Cadastro Realizado com Sucesso!");
		
		
		// REDIRECIONAR PARA PAGINA DE 3 ETAPA DO CADASTRO(NIVEL):
				RequestDispatcher despatcher = request.getRequestDispatcher("IdentificacaoNivel.jsp" );
				despatcher.forward(request, response);
		
	}

}
