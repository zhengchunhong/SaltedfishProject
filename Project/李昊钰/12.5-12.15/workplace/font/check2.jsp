<%@ page language="java" import="java.sql.*"
	contentType="text/html;charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>检验注册页面</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<br>
	<%
		request.setCharacterEncoding("utf-8");
		String users = request.getParameter("username");
		String pass = request.getParameter("pwd");
	%>
	<%
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/saltedfish";
		String use = "root";
		String password = "root";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, use, password);
		PreparedStatement sql = conn.prepareStatement("insert into salt_users(username,userpassword) values(?,?)");
		sql.setString(1, users);
		sql.setString(2, pass);
		int rtn = sql.executeUpdate();
		sql.close();
		conn.close();
	%>

	<p>注册成功!</p>

</body>
</html>