<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>welcome to struts2-5.jsp</h1>

	<form action="${pageContext.request.contextPath}/map.action"
		method="post">
		
		username:<input type="text" name="map['one'].username"> <br /> 
		password:<input
			type="password" name="map['one'].password"> <br /> <input type="submit"
			value="submit"> <br />
	</form>

</body>
</html>