<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="${pageContext.request.contextPath}/login.action" method="post" >
		用户名：<input type="text" value="please input username" name="username">  <br/>
		密 码：<input type="password" value="please input password" name="password"> <br/>
		<input type="submit" value="submit" /> <br/>
	</form>

</body>
</html>