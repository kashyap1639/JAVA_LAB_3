

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lab6
 */
@WebServlet("/Lab6")
public class Lab6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab6() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println(request.getHeaderNames()+"<br>");
		pw.println(request.getRequestURL()+"<br>");
		pw.println(request.getMethod()+"<br>");
		pw.println(request.getProtocol()+"<br>");
		pw.println(request.getServerName()+"<br>");
		pw.println(request.getServerPort()+"<br>");
		pw.println(request.getScheme()+"<br>");
		pw.println(request.getQueryString()+"<br>");
		pw.println(request.getContextPath()+"<br>");
		pw.println(request.getPathInfo()+"<br>");
		pw.println(request.getServletPath()+"<br>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
