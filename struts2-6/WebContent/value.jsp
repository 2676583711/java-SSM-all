<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


this is value.jsp

<s:property value="'abcdefg'"/>

<br/>

第一种获取list数据的方法
<s:property value="list[0].username"/>
<s:property value="list[0].password"/>
<s:property value="list[0].sex"/>
<s:property value="list[1].username"/>
<s:property value="list[1].password"/>
<s:property value="list[1].sex"/>


<br/>
第二种获取list数据的方法
<s:iterator value="list">

<s:property value="username"/>
<s:property value="password"/>

<s:property value="sex"/>




</s:iterator>
<br/>

第三种获取list数据的方法
<s:iterator value="list" var="list">
<s:property value="#list.username"/>
<s:property value="#list.password"/>
<s:property value="#list.sex" />

</s:iterator>


</body>
</html>