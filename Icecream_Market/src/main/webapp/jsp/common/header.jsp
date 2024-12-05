<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href = "/Icecream_Market/css/common_CSS/header_Style.css"/>
<script src = "/Icecream_Market/lib/jquery-3.7.1.min.js"></script>
<script src = "/Icecream_Market/js/member_JS/member_Btn_func.js"></script>
</head>
<body>
	<div id = "h_container">
	<h1> 
		<a id = "title" href = "/Icecream_Market/index.jsp"> 아이스크림 마켓 </a>
	</h1>
		<a class = "anchor" href = "/Icecream_Market/board/list.do">자유게시판</a>
		
			<c:if test="${ empty sessionScope.member }" >
				<a class = "anchor" href = "/Icecream_Market/member/loginPage.do">로그인</a>	
			</c:if>
		
		<c:if test="${ not empty sessionScope.member }">
			<button id = "logoutBtn">로그아웃</button>
			<a class = "anchor" href = "/Icecream_Market/member/myPage.do">마이페이지</a>
			<a class = "anchor" href = "/Icecream_Market/icecream/cartPage.do">장바구니</a>
		</c:if>
	 
	</div>
</body>
</html>