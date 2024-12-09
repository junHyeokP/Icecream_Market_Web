<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file = "/jsp/common/header.jsp" %>
	<div>
		<div>
		 <form action = "iceSelect.do">
		  <h2>아이스크림 맛 선택</h2>
			<input type = "checkbox" name = "ice" value = "vanilla">바닐라 
			<input type = "checkbox" name = "ice" value = "choco">초코
			<input type = "checkbox" name = "ice" value = "mintchoco">민트초코
			<input type = "checkbox" name = "ice" value = "mint">민트
			<input type = "checkbox" name = "ice" value = "strawberry">딸기
			<input type = "checkbox" name = "ice" value = "cooandcr">쿠키앤크림
			<input type = "checkbox" name = "ice" value = "coffee">커피
			<br>
			<button>장바구니에 담기</button>
			</form>
		</div>
	</div>
</body>
</html>