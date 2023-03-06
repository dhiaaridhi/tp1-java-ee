package isetj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class coffeeservlet
 */
@WebServlet("/coffeeservlet")
public class coffeeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public coffeeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String typeremarque = request.getParameter("option1");
		String typertest = request.getParameter("option1");
		String typealt = request.getParameter("option1");
		PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<title>Starbucks coffee</title></head>");
		out.println("<body> <img src 'coffee.jpg' border='0' height='200' width='200'>");
		out.println("<p>Merci de nous avoir faite parvenire la remarque suivante concernant");
		out.println("<b>"+typeremarque+"</b>");
		out.println("<p>"+typeremarque);
		out.println("</html></head>");


		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
