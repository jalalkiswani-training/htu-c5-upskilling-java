<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello from uncle Jalal</h1>
	<%
		//scriptlet
	System.out.println("Hello form server side...");

	String n1 = request.getParameter("num1");
	String n2 = request.getParameter("num2");
	int x1 = 0;
	if (n1 != null) {
		x1 = Integer.parseInt(n1);
	}
	int x2 = 0;
	if (n2 != null) {
		x2 = Integer.parseInt(n2);
	}
	out.println("Sum =" + (x1 + x2));
	%>
</body>
</html>