package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BeanEmpreendedor;
import model.BeanEmpresa;
import model.BeanUsuario;
import model.DaoAdministrador;
import model.DaoEmpreendedor;
import model.DaoEmpresa;

/**
 * Servlet implementation class CadastroUsuarioServlet
 */
@WebServlet("/CadastroUsuarioServlet")
public class CadastroUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CadastroUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BeanEmpreendedor empreendedor = new BeanEmpreendedor();
		DaoEmpreendedor dao = new DaoEmpreendedor();
		BeanEmpresa empresa = new BeanEmpresa();
		// RECEBER A REQUISÃO:
		empreendedor.setNome(request.getParameter("nome"));
		empreendedor.setDataNascimento(request.getParameter("dataNascimento"));
		empreendedor.setTelefone(request.getParameter("telefone"));
		empreendedor.setEndereco(request.getParameter("endereco"));
		empreendedor.setSexo(request.getParameter("sexo"));
		empreendedor.setEmail(request.getParameter("email"));
		empreendedor.setSenha(request.getParameter("senha"));
		
		empresa.setIdEmpreendedor(request.getParameter("email"));
		
		System.out.println(empreendedor.getDataNascimento());
		
		//EXECUTAR CADASTRO DE EMPREENDEDOR:
		dao.cadastroEmpreendedor(empreendedor);
	
		//COLOCANDO DADOS NA RIQUESTE:
		
		
		// REDIRECIONAR PARA PAGINA DE 2 ETAPA DO CADASTRO:
		RequestDispatcher despatcher = request.getRequestDispatcher("cadastroEmpresa.jsp");
		despatcher.forward(request, response);
	}

}
