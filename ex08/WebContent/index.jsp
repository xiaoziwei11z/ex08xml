<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="<c:url value='/UserServlet'/>" method="post">
			姓名:<input type="text" name="name"/><br/>
			性别:<input type="text" name="gender"/><br/>
			年龄:<input type="text" name="age"/><br/>
			<input type="submit" value="提交"/>
		</form>
	</div>
</body>
</html>