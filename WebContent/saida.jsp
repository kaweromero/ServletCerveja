<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.temp.model.Cervejas" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Olha a cervejaaa!</title>
</head>
<body>

       <h1>Cervejas sugeridas especialmente para você! Ou não...:</h1>
       <hr/>
       <hr/>
        
<%
             Cervejas cervejas=(Cervejas)request.getAttribute("cervejas");
%>        
<table border='1px'>

	<tr>
		<td>
			<%=cervejas.getVinho1() %> 
		</td>
	</tr>
	
	<tr>
		<td>	
			<%=cervejas.getVinho2() %>
		</td>
	</tr>	
	
	<tr>
		<td>	
			<%=cervejas.getVinho3()%>
		</td>
	</tr>
</table>

</body>
</html>