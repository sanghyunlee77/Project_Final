<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 isELIgnored="false" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>

<h1>Add New Post</h1>
<%--@elvariable id="boardVO" type="com.example"--%>
<form:form commandName="boardVO" method="POST" action="../editok">
	<form:hidden path="seq"/>
	<table id="edit">
		<tr><td>Title</td><td><form:input path="title"/></td></tr>
		<tr><td>Writer</td><td><form:input path="writer"/></td></tr>
		<tr><td>Content</td><td><form:input path="content"/></td></tr>
	</table>
	<input type="submit" value="수정하기"/>
	<input type="button" value="취소하기" onclick="history.back()">
</form:form>

</body>
</html>