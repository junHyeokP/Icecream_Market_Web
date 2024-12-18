<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href = "/Icecream_Market/css/common_CSS/button_Style.css" />
<link rel="stylesheet" href = "/Icecream_Market/css/icecream_CSS/iceSelectPage_Style.css"/>
<script src = "/Icecream_Market/lib/jquery-3.7.1.min.js"></script>
</head>
<body>
<%@include file = "/jsp/common/header.jsp" %>
<div align = "center">
<h2>관리자 페이지</h2>
	<form action = "/Icecream_Market/icecream/orderListAdmin.do">
		<button>맴버 주문내역</button>
	</form>
</div>
</body>
</html>