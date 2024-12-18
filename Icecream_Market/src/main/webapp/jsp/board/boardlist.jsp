<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file = "/jsp/common/header.jsp" %>
	<h2>자유게시판 페이지</h2>
	<table border = "2">
	 <tr>
	 	<th>번호</th>
	 	<th>제목</th>
	 	<th>작성자</th>
	 	<th>작성일자</th>
	 <tr>
	 <c:forEach items = "${ boardList }" var = "board">
	 	<tr>
	 		<td> ${board.no} </td>
	 		<td> ${board.title} </td>
	 		<td> ${board.writer} </td>
	 		<td> ${board.regdate} </td>
	 	</tr>
	 </c:forEach>
	</table>
</body>
</html>