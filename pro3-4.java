

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lab4
 */
@WebServlet("/Lab4")
public class Lab4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String empid = request.getParameter("ei");
		String empname = request.getParameter("en");
		String empdesig = request.getParameter("ed");
		String empqualy = request.getParameter("eq");
		pw.println("Employee Id Is "+ empid);
		pw.println("<br>Employee Name Is "+ empname);
		pw.println("<br>Employee Designation Is "+ empdesig);
		pw.println("<br>Employee Qualification Is "+ empqualy);
		
	}

}
