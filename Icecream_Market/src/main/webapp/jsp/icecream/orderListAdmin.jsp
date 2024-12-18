<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri = "jakarta.tags.core" %>    
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
	<h2>맴버 주문 목록</h2>
	<table border = "2">
	<tr>
		<th>번호</th>
		<th>아이디</th>
		<th>주문 아이스크림</th>
		<th>수량</th>
		<th>주문 날짜</th>
		<th>가격</th>
		<th>주문 상태</th>
	</tr>
	<c:forEach var = "order" items = "${ orderList }">
		<tr>
			<td>${ order.order_ice_no }</td>
			<td>${ order.im_id }</td>
			<td>${ order.order_ice_cup }</td>
			<td>${ order.order_quantity }</td>
			<td>${ order.order_date }</td>
			<td>${ order.order_cup_price }</td>
			
			<td>
					
			<c:choose>
				<c:when test="${ order.order_statement eq 'accept' || sessionScope.rig eq true}">
			 		<h4>승인됨</h4>
			 	</c:when>
			 	<c:when test="${ order.order_statement eq 'reject' || sessionScope.rejected eq true }">
			 		<h5>주문취소됨</h5>
			 	</c:when>
			 	<c:when test="${ order.order_statement eq 'ready' && empty sessionScope.rig}">
			 	<form action = "orderConfirm.do">
			 		<input type = "hidden" name = "accept" value = "${ order.order_ice_no }">
			 		<button>주문 승인</button>
			 	</form>	
			 	<form action = "orderConfirm.do">
			 		<input type = "hidden" name = "reject" value = "${ order.order_ice_no }">
			 		<button>주문 취소</button>
			 	</form>	
			 	</c:when>
			 </c:choose>
			</td>
		</tr>
	</c:forEach>
	</table>
	</div>
</body>
</html>