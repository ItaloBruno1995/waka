package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.ant.SessionsTask;

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
		// RECEBER A REQUIS√ÉO:
		empreendedor.setNome(request.getParameter("nome"));
		empreendedor.setDataNascimento(request.getParameter("dataNascimento"));
		empreendedor.setTelefone(request.getParameter("telefone"));
		empreendedor.setEndereco(request.getParameter("endereco"));
		empreendedor.setSexo(request.getParameter("sexo"));
		empreendedor.setEmail(request.getParameter("email"));
		empreendedor.setSenha(request.getParameter("senha"));
		
		//COLOCAR O USUARIO NA SESS√ÉO:
		 HttpSession sessaoId = request.getSession();
		 
		//COLOCAR EMPREENDEDOR NA SESS√O
	        sessaoId.setAttribute("sessaoAdministrador",empreendedor.getEmail()); 
	        System.out.println(empreendedor.getDataNascimento());
		System.out.println("Usario na sess„o : " +sessaoId.getAttribute("sessaoAdministrador"));
		
	
		
		//EXECUTAR CADASTRO DE EMPREENDEDOR:
		dao.cadastroEmpreendedor(empreendedor);
	

		// REDIRECIONAR PARA PAGINA DE 2 ETAPA DO CADASTRO:
		RequestDispatcher despatcher = request.getRequestDispatcher("cadastroEmpresa.jsp" );
		despatcher.forward(request, response);
	}

}
