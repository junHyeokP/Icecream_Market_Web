<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href = "/Icecream_Market/css/common_CSS/button_Style.css" />
<link rel="stylesheet" href = "/Icecream_Market/css/icecream_CSS/iceSelectPage_Style.css"/>
<script src = "/Icecream_Market/lib/jquery-3.7.1.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file = "/jsp/common/header.jsp" %>
	<div align = "center">
	 <h2> 주문 페이지 </h2>
	 <table border = "2">
		<tr>
			<th>
				컵에 담은 아이스크림들
			</th>
			<th>
				수량
			</th>
			<th>
				가격
			</th>
			
		</tr>
		
		<tr>
			<td>${ sessionScope.icecreamOrder.order_ice_cup }</td>
			<td>${ sessionScope.icecreamOrder.order_quantity }</td>
			<td>${ sessionScope.icecreamOrder.order_cup_price}</td>		
		</tr>		
		
	</table>
	<table border="2">
		<tr>
			<th>총가격</th>
		</tr>
		<tr>
			<td>
				${ sessionScope.totalPrice }
			</td>
		</tr>
	</table>
	<form action = "orderList.do" method = "post">
		<input type = "hidden" name = "orders" value = "${ member.im_id }">
		<button>결재</button>
	</form>
	<form action = "orderPage.do" method = "post">
	<input type = "hidden" name = "rejectAll" value = "${ member.im_id }">
		<button>주문 취소</button>
	</form>	

</body>
</html>