<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method = "post" action = "login.do">
		<div>
			<input type = "text" name = "id" placeholder = "아이디 입력"> <br>
			<input type = "password" name = "password" placeholder = "비밀번호 입력">
		</div>
		<div>
			<button>로그인</button>
		</div>
	</form>
	<div>혹은</div>
	<div>
		카카오페이지로 로그인
	</div>
	<form action = "registPage.do">
		<button>회원가입</button>
	</form>
	<form action = "../index.jsp">
		<button>뒤로</button>
	</form>
</body>
</html>