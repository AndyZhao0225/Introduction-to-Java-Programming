<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="rit.Calculator" %>
<!DOCTYPE html>
<!-- 
Author:   Junan Zhao
Location: Rochester,NY, USA
Date:     Jun 5, 2019 
-->
<html>
<head>
<meta charset="ISO-8859-1">
<title>40-2</title>
<%! int[][] mulTable = Calculator.multiplicationTable(); %>
</head>
<body>
   <table border="1" style="width: 400px;">
     <tr>
       <th colspan="10">Multiplication Table</th>
     </tr>
     <tr>
       <th></th>
       <% for( int i=0; i<=mulTable.length-1; i++) 
             {%>
	            <th align="left"><%=(i+1)%></th>
	       <%}%>
	  </tr>
     <% for( int i=0; i<=mulTable.length-1; i++) 
           {%>
     <tr>
	   <th width="32px" align="left";><%=(i+1)%></th>
              <% for( int j=0; j<=mulTable[i].length-1; j++)
		            {
    	               int n = mulTable[i][j];
    	               if(n>=10) 
    	                 {%><td><%=n%></td><%}
    	               else 
    	                 {%><td><%=n%>&nbsp;&nbsp;</td><%}%>
    	           <%}%>
		 <%}%>
     </tr>
   </table>
</body>
</html>