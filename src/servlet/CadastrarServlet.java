package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CadastrarServlet
 */
@WebServlet("/Cadastrar")
public class CadastrarServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Obt�m referencia a session
		HttpSession session = request.getSession();
		
		//obt�m a p�gina atual. Este par�metro � passado atrav�s de um campo hidden no formul�rio
		Integer pagina = Integer.parseInt(request.getParameter("pagina"));
		String proximaPagina = null;
		
		if(pagina == 1) {
			String email = request.getParameter("email");
			session.setAttribute("email", email);
			proximaPagina="/telaNomeUsuario.jsp";
		}else if(pagina == 2 ) {
			String nome = request.getParameter("nome");
			session.setAttribute("nome", nome);
			proximaPagina="/telaTelefone.jsp";
		}else if(pagina == 3) {
			String telefone = request.getParameter("telefone");
			session.setAttribute("telefone", telefone);
			proximaPagina="/telaGeral.jsp";
		}
		//direciona para a proxima tela
		
		request.getRequestDispatcher(proximaPagina).forward(request, response);
		
	}

}
