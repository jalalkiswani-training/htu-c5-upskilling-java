<%
	String name = request.getParameter("username");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% if (name != null && !name.equals("")) {%>
		<h1> Hello <%=name%></h1>
	<% } else { %>
	<form method="get" action="page3.jsp">
		<label>Username</label> <input type="text" name="username" /> 
		<input type="submit" value="Say Hello" />
	</form>
	<% } %>
</body>
</html>