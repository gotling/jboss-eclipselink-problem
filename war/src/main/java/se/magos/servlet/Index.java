package se.magos.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.getWriter()
				.write("<html><body><h1>JBoss AS7 - EclipseLink</h1><h2>Test Cases</h2>"
						+ "<a href=\"injection\">Injection Case</a><br />"
						+ "<a href=\"transaction\">Transaction Case</a></body></html>");
	}
}