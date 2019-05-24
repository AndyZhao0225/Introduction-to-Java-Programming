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

   protected void doGet( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   {
      response.setContentType("text/html");
      PrintWriter output = response.getWriter();
      double income = Double.parseDouble(request.getParameter("income"));
      int status = Integer.parseInt(request.getParameter("status"));
      double tax = ComputeTax.computeTax(status,income);
      output.write("<p> Taxable Income: " + income + " </p>");
      output.write("<p> Filing Status: " + status + "</p>");
      output.write("<p> Tax: " + tax + "</p>");
      output.close();
   }
}
