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
	 <h2> 주문 내역 </h2>
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
			<th>
				주문날짜
			</th>
			<th>
				주문상태
			</th>
		</tr>
		
		<c:forEach var = "orderIce" items = "${ sessionScope.memberOrder }">
			
			<tr>
				<td>${ orderIce.order_ice_cup }</td>
				<td>${ orderIce.order_quantity }</td>
				<td>${ orderIce.order_cup_price}</td>
				<td>${ orderIce.order_date}</td>
				<td>
					<c:choose>
						<c:when test = "${ orderIce.order_statement eq 'accept' || sessionScope.rig eq true}">
							<h5>주문 승인, ${ sessionScope.member.im_basic_addr } ${ sessionScope.member.im_detail_addr } 주소로 배송됨</h5>
						</c:when>
						<c:when test = "${orderIce.order_statement eq 'reject' || sessionScope.rejected eq true}">
							<h5>관리자 주문 거부</h5>
						</c:when>
						<c:when test="${orderIce.order_statement eq 'ready' && empty sessionScope.rig}">
							<h5>관리자 주문 승인 대기중</h5>
						</c:when>
					</c:choose>
				</td>	
			</tr>		
			
		</c:forEach>
	</table>

</body>
</html>