package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BeanUsuario;
import model.DaoAdministrador;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// METODO DE LOGIN:
		// INDENTIFICAR QUEM TA FAZENDO O LOGIN:
		String tipoLogin = request.getParameter("tipoLogin");
		if (tipoLogin.equalsIgnoreCase("waka")) {
			BeanUsuario usuario = new BeanUsuario();
			DaoAdministrador daoWaka = new DaoAdministrador();
			// VALIDAR ACESSO:
			usuario.setEmail(request.getParameter("email"));
			usuario.setSenha(request.getParameter("senha"));

			try {
				if (daoWaka.login(usuario)) {
					// REDIRECIONAR PARA PAGINA DE ACESSO:
					RequestDispatcher despatcher = request.getRequestDispatcher("index.jsp");
					despatcher.forward(request, response);

				} else {

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
