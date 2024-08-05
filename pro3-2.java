package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/TnRaoCollegeServlet")
public class TnRaoCollegeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public TnRaoCollegeServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<h1>T N RAO COLLEGE</h1>");
		out.println("<h2>T N RAO COLLEGE</h2>");
		out.println("<h3>T N RAO COLLEGE</h3>");
		out.println("<h4>T N RAO COLLEGE</h4>");
		out.println("<h5>T N RAO COLLEGE</h5>");
		out.println("<h6>T N RAO COLLEGE</h6>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
