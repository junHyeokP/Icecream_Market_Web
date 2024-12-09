<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href = "/Icecream_Market/css/common_CSS/button_Style.css" />
<meta charset="UTF-8">
<title>Insert title here</title>
<script src = "/Icecream_Market/lib/jquery-3.7.1.min.js"></script>
<script src = "/Icecream_Market/js/member_JS/member_Btn_func.js"></script>
</head>
<body>
 <h2>내 정보</h2>
   <table border = "2">
   <tr> 
	   	<th>이름</th>
	   	<th>ID</th>
	   	<th>이메일</th>
	   	<th>주소/상세주소</th>
	   	<th>가입날짜</th>
   	</tr>
   	<tr>
	   	<td>${ sessionScope.member.im_name }</td>
	   	<td>${ sessionScope.member.im_id }</td>
	   	<td>${ sessionScope.member.im_email_id }${ sessionScope.member.im_email_domain }</td>
	   	<td>${ sessionScope.member.im_basic_addr },${ sessionScope.member.im_detail_addr }</td>
	   	<td>${ sessionScope.member.im_reg_date}</td>
   	</tr>
	</table>
	<span>
		<button id = "updateBtn">수정</button>
	</span>
	<span class = "redBtn">
		<button id = "deleteBtn">계정 삭제</button>
	</span>
	<div class = "yellowBtn">
		<button id = "favBtn">즐겨찾기</button>
	</div>
	<div class = "redBtn">
		<button class = "backBtn">뒤로</button>
	</div>
</body>
</html>