package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		 //INSTANCIA DE OBJETOS:
		BeanEmpreendedor empreendedor = new BeanEmpreendedor();
		DaoEmpreendedor daoempreendedor = new DaoEmpreendedor();
		BeanEmpresa empresa= new BeanEmpresa();
		DaoEmpresa daoEmpresa = new DaoEmpresa();
		
		 //RECEBENDO REQUISIÇÃO
		empresa.setCnpj(request.getParameter("cnpj"));
		empresa.setNome(request.getParameter("nomeEmpresa"));
		empresa.setRamoAtuacao(request.getParameter("ramoAtuacao"));
		empresa.setRazaoSocial(request.getParameter("razaoSocial"));
		
		//EXUCUTAR CADASTRO DE EMPREENDEDOR:
		//daoempreendedor.cadastroEmpreendedor(empreendedor);
		
		//SETAR CHAMVE PRIMARIA DE EMPREENDEDOR
	
		//EXUCUTAR CADASTRO DE EMPRESA
		daoEmpresa.cadastraEmpresa(empresa, empreendedor);
		
		//TESTE:
		System.out.println("Cadastro Realizado com Sucesso!");
		
	}

}