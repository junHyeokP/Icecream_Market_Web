<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href = "/Icecream_Market/css/common_CSS/button_Style.css" />
<link rel="stylesheet" href = "/Icecream_Market/css/member_CSS/loginPage_Style.css" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div id = "container">
 	<h2> 로그인 페이지 </h2>
	<form method = "post" action = "login.do">
		<div id = "log">
			<input type = "text" name = "id" placeholder = "아이디 입력" required>
			<input type = "password" name = "password" placeholder = "비밀번호 입력" required>
		</div>
		<div align = "center">
			<button>로그인</button>
		</div>
	</form>
	<div>혹은</div>
	<div>
		카카오 계정으로 로그인
	</div>
	<form action = "registPage.do">
		<button>회원가입</button>
	</form>
	<form action = "../index.jsp">
		<div id = "noBtn">
			<button>뒤로</button>
		</div>
	</form>
	</div>
</body>
</html>