package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BeanGerenciamentoNivel;
import model.BeanUsuario;
import model.DaoGerenciamentoNivel;

/**
 * Servlet implementation class IdentificarNivelServlet
 */
@WebServlet("/IdentificarNivelServlet")
public class IdentificarNivelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public IdentificarNivelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String funcionario = request.getParameter("funcionario");
		System.out.println("Recebido:" + funcionario);
		String cliente = request.getParameter("cliente");
		String receitaB = request.getParameter("receitaBruta");
		String receitaL= request.getParameter("receitaLiquida");
		String portifolio = request.getParameter("portifolioProduto");
		String Lprodutos = request.getParameter("produtoNovo");
		String Vprodutos = request.getParameter("vendaProdutoNovo");
		String Pevento = request.getParameter("paticipouEvento");
		String Luprodutos= request.getParameter("lucroNovoProduto");
		String Csocial = request.getParameter("capitalSoacial");
		String valuention = request.getParameter("valuation");
		
		 //SETAR E VALIDAR ENTRADA DE DADOS:
		BeanGerenciamentoNivel nivel = new BeanGerenciamentoNivel();
		if(funcionario.equalsIgnoreCase("sim")){
			nivel.setFuncionario(2);
		}
		if(cliente.equalsIgnoreCase("sim")){
			nivel.setCliente(3);
			
		}
		if(receitaB.equalsIgnoreCase("sim")){
			nivel.setReceitaBruta(2);
		}
		if(receitaL.equalsIgnoreCase("sim")){
			nivel.setReceitaLiquida(3);
		}
		if(portifolio.equalsIgnoreCase("sim")){
			nivel.setPortifoleProdutos(1);
		}
		if(Lprodutos.equalsIgnoreCase("sim")){
			nivel.setlProdutosNovos(2);
		}
		if(Vprodutos.equalsIgnoreCase("sim")){
			nivel.setvProdutosNovos(2);
		}
		if(Luprodutos.equalsIgnoreCase("sim")){
			nivel.setLucosProdutos(2);
		}
		if(Pevento.equalsIgnoreCase("sim")){
			nivel.setEventos(1);
		}
		if(Csocial.equalsIgnoreCase("sim")){
			nivel.setCapitalSocial(1);
		}
		if(valuention.equalsIgnoreCase("sim")){
			nivel.setValuation(3);
		}
		
		
		//RECEBENDO ATRIBUTO DA SESSÃO(USUARIO QUE TA FAZENDO CADASTRO ):
		HttpSession session = request.getSession();
		String UsuarioLogado= (String) session.getAttribute("sessaoAdministrador");
		System.out.println("Uusario Fazendo Cadastro: "+UsuarioLogado);
		BeanUsuario usuario = new BeanUsuario();
		usuario.setEmail(UsuarioLogado);
		
		//TESTAR FORA DA CONDIÇÃO:
		System.out.println(nivel.getFuncionario());
		
		//CHAMADA DO METODO:
		DaoGerenciamentoNivel salvarNivel = new DaoGerenciamentoNivel();
		try {
			salvarNivel.salvarInicial(nivel, usuario);
			
		} catch (Exception e) {
			//ERRO
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
