<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href = "/Icecream_Market/css/button_CSS.css"/>
<link rel="stylesheet" href = "/Icecream_Market/css/member_CSS/registPage_Style.css"/>
</head>
<body>
	<div id = "container">
	
	<h1> 회원가입 </h1>
	
		<form action = "regist.do" method = "post">
			
				<input type = "text" name = "id" placeholder = "ID">
				<input type = "text" name = "name" placeholder = "이름"> 
				<input type = "password" name = "password" placeholder = "비밀번호"> 
				<input type = "text" name = "email_id" placeholder = "이메일ID"> 
				<input type = "text" name = "email_domain" placeholder = "이메일Domain"> 
				<input type = "text" name = "basic_addr" placeholder = "기본 주소"> 
				<input type = "text" name = "detail_addr" placeholder = "상세 주소">
			
		<div class = "button" id = "registBtn">
			<button>회원가입</button>	
		</div>
		</form>
		<form action = "loginPage.do">
			<div id = "backBtn">
				<button id = "goPrevPage">뒤로</button>
			</div>
		</form>	
	</div>
</body>
</html>