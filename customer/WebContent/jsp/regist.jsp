<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1>欢迎注册：</h1>
	<form action="${pageContext.request.contextPath}/login.action">
		用户名:<input type="text" name="username" /> <br /> 密 码：<input
			type="password" name="password" /> <br /> 性 别：<input
			type="password" name="password" /> <br /> 年 龄：<input
			type="password" name="password" /> <br /> 电 话：<input
			type="password" name="password" /> <br /> <input type="submit"
			value="提交" /> <br />
	</form>

</body>
</html>