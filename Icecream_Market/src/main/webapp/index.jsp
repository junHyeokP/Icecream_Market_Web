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
	<a href = "/Icecream_Market/board/list.do">자유게시판</a>
	
	<a href = "/Icecream_Market/member/loginPage.do">
		로그인
	</a>
	
	<c:if test="${ sessionScope.login eq true }">
		로그아웃
	</c:if>
	
</body>
</html>