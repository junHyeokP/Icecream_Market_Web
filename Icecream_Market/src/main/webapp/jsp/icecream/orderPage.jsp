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
	<div align = "center">
	 <h2> 주문목록 </h2>
	<table border = "2">
		<tr>
			<th>
				컵에 담은 아이스크림들
			</th>
			<th>
				수량
			</th>
			<th>
				수정/삭제
			</th>
		</tr>
		<c:forEach var = "orderIce" items = "${ sessionScope.cartList }">
			<tr>
				<td>${ cartIce.cart_ice_cup }</td>
				<td>${ cartIce.cart_quantity }</td>
				<td>
					<button>수정</button>
					<button>삭제</button>
				</td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>