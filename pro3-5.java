

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lab5
 */
@WebServlet("/Lab5")
public class Lab5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter pw = response.getWriter();
//		pw.println(request.getHeaderNames());
//		pw.println("<br>");
//		pw.println(request.getRequestURL());
//		pw.println(request.getHeader(getServletInfo()));
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Enumeration<String> paraname = request.getParameterNames();
		while(paraname.hasMoreElements()) {
			String pname = (String)paraname.nextElement();
			pw.println(pname+"<br>");
			String[] pvalue = request.getParameterValues(pname);
			if(pvalue.length>0) {
				for(int i = 0; i<pvalue.length; i++) {
					pw.println(pvalue[i]+"<br>");
				}
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
