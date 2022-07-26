<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList" %>
    <%@page import="java.util.List" %>
    <%@page import="monservlet.utilisateur" %>
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<center><h1 > Bienvenue ${ nom } </h1></center>
	
	<center> 
	 <table>
	 <h1>La liste des inscripts</h1>
	 <thead>
			 <tr>
					 <th>Nom</th>
					 <th colspan="2">Prenom</th>
					 <th >Pseudo</th>
					 <th>Email</th>
			 </tr>
	 </thead>
	 <tbody>
	  <% 
	  List<utilisateur> users = (ArrayList <utilisateur>)session.getAttribute("liste");
	 
	 for(utilisateur user : users){
	 %>
		  <tr>
				  <td class="t"><% out.print(user.getNom()); %></td>
				  <td class="t"><% out.print(user.getPrenom()); %><td>
				  <td class="t"><% out.print(user.getPseudo()); %></td>
				   <td class="t"><% out.print(user.getEmail()); %></td>
		  </tr>
		  <%} %>
	 </tbody>
	 </table>
	
	</center>
	<form action="login" method="post" >
	 <input type="submit" value="Deconnexion">
	</form>
	
</body>
</html>

<style>
body{

}
th {
  background-color:#5cb85c;
  
}

th,.t{
border:1px solid black;
border-collapse:collapse;
padding-left:120px;
padding-top:7px;
}
table{

border-collapse: collapse;
}

</style>