<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
input[type=text],input[type=password] {
	display: block;
	margin-bottom: 5px;
	width:95% ; 
	border-radius: 2px;
	height:25px;
	
}
form{
width:300px;
margin:auto;
border: 1px solid #ccc;
padding: 5px;

}
</style>
<body>
<h1><%=request.getAttribute("msg") %></h1>
	<form action="hello" method="post">
		<label>Username</label>
		<input type="text" name="username" />
		<label>Password</label>
		<input type="password" name="password" />
		<input type="submit" value="Login" />
	</form>
</body>
</html>
