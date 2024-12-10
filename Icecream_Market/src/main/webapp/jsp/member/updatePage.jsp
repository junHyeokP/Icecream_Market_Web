<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href = "/Icecream_Market/css/common_CSS/button_Style.css"/>
<script src = "/Icecream_Market/lib/jquery-3.7.1.min.js"></script>
<script src = "/Icecream_Market/js/member_JS/member_Btn_func.js"></script>
</head>
<body>
 <div>
 <h1>회원정보 수정</h1>
	<form action = "update.do" method = "post">
	<input type = "text" name = "name" placeholder = "이름 변경" value = "${sessionScope.member.im_name}"> 
		<div>
			<input type = "text" name = "id" placeholder = "ID 변경" value = "${sessionScope.member.im_id}">
			<input type = "password" name = "password" placeholder = "비밀번호 변경" value = "${sessionScope.member.im_password}">		
		</div>
		<div> 
			<input type = "text" name = "email_id" placeholder = "이메일ID 변경" value = "${sessionScope.member.im_email_id}"> 
			<input type = "text" name = "email_domain" placeholder = "이메일Domain 변경" value = "${sessionScope.member.im_email_domain}"> 
		</div>	
		<div>
			<input type = "text" name = "basic_addr" placeholder = "기본 주소 변경" value = "${sessionScope.member.im_basic_addr}"> 
			<input type = "text" name = "detail_addr" placeholder = "상세 주소 변경" value = "${sessionScope.member.im_detail_addr}">
		</div>
		<button>수정</button>
	</form>
	</div>	
	<span class = "redBtn">
		<button class = "to_MyPageBtn">뒤로</button>
	</span>
</body>
</html>