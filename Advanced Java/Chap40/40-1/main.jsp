<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="rit.Factorial"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>40-1</title>
<style> 
   td, th { border: 1px solid #CCC; } 
   table { border: 1px solid black; } 
</style>
</head>
<body>
  <table>
    <thead>
    <tr>
      <th>Number</th>
      <th>Factorial</th>
    </tr>
    </thead>
    <tbody>
    <% for( int i=0; i<=10; i++)
          { %>
             <tr>
               <td><%=i%></td>
               <td><%=Factorial.factorial(i)%></td>
             </tr>      
       <% } %> 
    </tbody>
  </table>
</body>
</html>