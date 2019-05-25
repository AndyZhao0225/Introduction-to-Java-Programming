//Junan Zhao
//May 25, 2019
//Rochester, NY, USA


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
	   PrintWriter output = response.getWriter();
	   double loanAmount = Double.parseDouble(request.getParameter("loanAmount"));
	   double annualInterestRate = Double.parseDouble(request.getParameter("annualInterestRate"));
	   int years = Integer.parseInt(request.getParameter("years"));
	   Loan loan = new Loan(annualInterestRate,years,loanAmount);
	   double monthlyPayment = loan.getMonthlyPayment()*1/1.00;
	   double totalPayment = loan.getTotalPayment();
	   output.write("Loan Amount: " + loanAmount + " <br>");
	   output.write("Annual Interest Rate: " + annualInterestRate + "<br>");
	   output.write("Number of Years: " + years + " <br>");
	   output.write("Monthly Payment: " + String.format("%.2f",monthlyPayment) + "<br>");
	   output.write("Total Payment: " + String.format("%.2f",totalPayment));
	   output.close();
	}
}
