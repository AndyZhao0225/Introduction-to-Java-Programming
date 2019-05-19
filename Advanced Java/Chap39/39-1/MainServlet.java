package rit;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet 
{
   private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   {
	  response.setContentType("text/html");
	  PrintWriter out = response.getWriter();
	  out.print("<table border=\"1\">");
	  out.print("<tr>");
	  out.print("<th>Number</th>");
	  out.print("<th>Factorial</th>");
	  out.print("</tr>");
	  for( int i=0; i<=10; i++) 
	     {
		    out.print("<tr>");
			out.print("<td>" + i + "</td>");
			out.print("<td>" + Factorial.factorial(i) + "</td>");
			out.print("</tr>");
          } 
	  out.print("</table>");
	  out.close();
   }
}
