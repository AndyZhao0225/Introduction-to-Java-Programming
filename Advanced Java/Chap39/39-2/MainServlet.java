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
	  int[][] mulTable = Calculator.multiplicationTable();
	  int[] columnHeader = {1,2,3,4,5,6,7,8,9};
	  PrintWriter out = response.getWriter();
	  out.print("<table  border=\"1\" style=\"width: 400px;\">");
	  out.print("<tr>");
	  out.print("<th colspan=\"10\">Multiplication Table</th>");
	  out.print("</tr>");
	  out.print("<tr>");
	  out.print("<td>  </td>");
	  for( int i=0; i<=columnHeader.length-1; i++) 
	      out.print("<th align=\"left\">" + (i+1) + "</th>");
	  out.print("</tr>");
	  for( int i=0; i<=9-1; i++) 
	     {
		    out.print("<tr>");
		    out.print("<th width=\"32px\" align=\"left\";>" + (i+1) + "</th>");
		    for( int j=0; j<=9-1; j++)
		        {
		    	   int n = mulTable[i][j];
		    	   if(n>=10)  out.print("<td>" + mulTable[i][j] + "</td>" );
		    	   if(n<10)  out.print("<td>" + mulTable[i][j] + "&nbsp;&nbsp;</td>" );
		        }
		    out.print("</tr>");
	     }
	  out.print("</table>");
	  out.close();
   }
}
