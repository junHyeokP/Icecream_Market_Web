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
		 <form action = "Iceselect.jsp">
		  <h2>아이스크림 맛 선택</h2>
			<input type = "checkbox" name = "vanilla">바닐라 
			<input type = "checkbox" name = "choco">초코
			<input type = "checkbox" name = "mintchoco">민트초코
			<input type = "checkbox" name = "mint">민트
			<input type = "checkbox" name = "strawberry">딸기
			<input type = "checkbox" name = "cooandcr">쿠키앤크림
			<input type = "checkbox" name = "coffee">커피
			<button>주문</button>
			</form>
		</div>
	</div>
</body>
</html>