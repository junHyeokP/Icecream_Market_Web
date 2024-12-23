<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@taglib prefix ="c" uri = "jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href = "/Icecream_Market/css/member_CSS/loginPage_Style.css" />
<link rel="stylesheet" href = "/Icecream_Market/css/common_CSS/button_Style.css" />
<script src = "/Icecream_Market/lib/jquery-3.7.1.min.js"></script>
<script src = "/Icecream_Market/js/member_JS/member_Btn_func.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div id = "container">
 	<h2> 로그인 페이지 </h2>
	<form method = "post" action = "loginPage.do">
		<div id = "log">
			<input type = "text" name = "id" placeholder = "아이디 입력" required>
			<input type = "password" name = "password" placeholder = "비밀번호 입력" required>
			<c:if test = "${loginFailed eq true}">
				<h6>잘못된 ID 혹은 비밀번호를 입력하셨습니다.</h6>
			</c:if>
			<c:if test = "${not empty sessionScope.member}">
				<c:redirect url = "login.do"/>
			</c:if>
		</div>
		<div align = "center">
			<button onclick = "logbtn">로그인</button>
		</div>
	</form>
	<div>혹은</div>
	<div>
		카카오 계정으로 로그인
	</div>
	<div>
		<button class = "to_registPageBtn">회원가입</button>
	</div>
	<div class = "redBtn">
		<button class = "backBtn">뒤로</button>
	</div>
 </div>
</body>
</html>