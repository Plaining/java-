package Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
		throws ServletException,IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("GBK");
		PrintWriter out = response.getWriter();
		out.print("<p>上下文路径："+request.getServletPath()+"</p>");
		out.print("<p>HTTP请求类型："+request.getMethod()+"</p>");
		out.print("<p>请求参数："+request.getQueryString()+"</p>");
		out.print("<p>请求URI："+request.getRequestURI()+"</p>");
		out.print("<p>请求URL："+request.getRequestURL()+"</p>");
		out.print("<p>请求Servlet路径："+request.getServletPath()+"</p>");
	}
}
