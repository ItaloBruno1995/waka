package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BeanEmpreendedor;
import model.BeanInvestidor;
import model.BeanUsuario;
import model.DaoAdministrador;
import model.DaoEmpreendedor;
import model.DaoInvestidor;

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
			System.out.println("servlet parametros");

			try {
				if (daoWaka.login(usuario)) {
					//COLOCAR O USUARIO NA SESSÃO:
					 HttpSession sessaoAdimin = request.getSession();
					 
					//pega a sessao da tag e passa o nome do usuario
				        sessaoAdimin.setAttribute("sessaoAdministrador",usuario.getEmail()); 
					
					// CONFIRMAR :CONCLUIDO COM SUCESSO!

					request.setAttribute("status", "Sucesso!");
				

					// REDIRECIONAR PARA PAGINA DE ACESSO:
					RequestDispatcher despatcher = request.getRequestDispatcher("/autenticacao/principalEmpreendedor.jsp");
					despatcher.forward(request, response);

				} else {
					request.setAttribute("status", "Login Invalido");// OPÇÃO
																		// NÃO
																		// ENCONTRADA

					// REDIRECIONAR PARA PAGINA DE ACESSO:
					RequestDispatcher despatcher = request.getRequestDispatcher("login.jsp");
					despatcher.forward(request, response);

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				request.setAttribute("status", "Login Invalido");
				// ERRO INTERNO DO SERVIDOR
				// REDIRECIONAR PARA PAGINA DE LOGIN:
				RequestDispatcher despatcher = request.getRequestDispatcher("login.jsp");
				despatcher.forward(request, response);

			}

		}else {
			if (tipoLogin.equalsIgnoreCase("empreendedor")) {
		
			BeanEmpreendedor usuario = new  BeanEmpreendedor();
			DaoEmpreendedor dao = new DaoEmpreendedor();
			// VALIDAR ACESSO:
			usuario.setEmail(request.getParameter("email"));
			usuario.setSenha(request.getParameter("senha"));

			try {
				if (dao.login(usuario)) {
					//COLOCAR O USUARIO NA SESSÃO:
					 HttpSession sessaoAdimin = request.getSession();
					 
					//pega a sessao da tag e passa o nome do usuario
				        sessaoAdimin.setAttribute("sessaoAdministrador",usuario.getEmail()); 
					
					// CONFIRMAR :CONCLUIDO COM SUCESSO!

					request.setAttribute("status", "Sucesso!");
				

					// REDIRECIONAR PARA PAGINA DE ACESSO:
					RequestDispatcher despatcher = request.getRequestDispatcher("/autenticacao/principalEmpreendedor.jsp");
					despatcher.forward(request, response);

				} else {
					request.setAttribute("status", "Login Invalido");// OPÇÃO
																		// NÃO
																		// ENCONTRADA

					// REDIRECIONAR PARA PAGINA DE ACESSO:
					RequestDispatcher despatcher = request.getRequestDispatcher("login.jsp");
					despatcher.forward(request, response);

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				request.setAttribute("status", "Login Invalido");
				// ERRO INTERNO DO SERVIDOR
				// REDIRECIONAR PARA PAGINA DE LOGIN:
				RequestDispatcher despatcher = request.getRequestDispatcher("login.jsp");
				despatcher.forward(request, response);

			}
			
		}

	}
		if (tipoLogin.equalsIgnoreCase("Investidor")) {
			BeanInvestidor usuario = new BeanInvestidor();
			DaoInvestidor dao = new DaoInvestidor();
			// VALIDAR ACESSO:
			usuario.setEmail(request.getParameter("email"));
			usuario.setSenha(request.getParameter("senha"));

			try {
				if (dao.login(usuario)) {
					//COLOCAR O USUARIO NA SESSÃO:
					 HttpSession sessaoAdimin = request.getSession();
					 
					//pega a sessao da tag e passa o nome do usuario
				        sessaoAdimin.setAttribute("sessaoAdministrador",usuario.getEmail()); 
					
					// CONFIRMAR :CONCLUIDO COM SUCESSO!

					request.setAttribute("status", "Sucesso!");
				

					// REDIRECIONAR PARA PAGINA DE ACESSO:
					RequestDispatcher despatcher = request.getRequestDispatcher("/autenticacao/principalEmpreendedor.jsp");
					despatcher.forward(request, response);

				} else {
					request.setAttribute("status", "Login Invalido");// OPÇÃO
																		// NÃO
									 									// ENCONTRADA

					// REDIRECIONAR PARA PAGINA DE ACESSO:
					RequestDispatcher despatcher = request.getRequestDispatcher("login.jsp");
					despatcher.forward(request, response);

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				request.setAttribute("status", "Login Invalido");
				// ERRO INTERNO DO SERVIDOR
				// REDIRECIONAR PARA PAGINA DE LOGIN:
				RequestDispatcher despatcher = request.getRequestDispatcher("login.jsp");
				despatcher.forward(request, response);

			}

		
			
		

	}
}

}
