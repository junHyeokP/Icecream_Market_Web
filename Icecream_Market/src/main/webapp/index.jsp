<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src = "/Icecream_Market/js/member_JS/index_logoutBtn.js"></script>

</head>
<body>
	<a href = "/Icecream_Market/board/list.do">자유게시판</a>
	
	<a href = "/Icecream_Market/member/loginPage.do">
		<c:if test="${ empty sessionScope.member }" >로그인</c:if>
	</a>
	
	<c:if test="${ not empty sessionScope.member }">
		<a onclick = "return logoutConfirm()">로그아웃</a>
		<a href = "/Icecream_Market/member/myPage.do">마이페이지</a>
	</c:if>
</body>
</html>