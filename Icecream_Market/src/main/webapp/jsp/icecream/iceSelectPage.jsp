<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri = "jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href = "/Icecream_Market/css/common_CSS/button_Style.css" />
<link rel="stylesheet" href = "/Icecream_Market/css/icecream_CSS/iceSelectPage_Style.css"/>
<script src = "/Icecream_Market/lib/jquery-3.7.1.min.js"></script>
<script>
function isIceSelected(event) {
	
	const quantity = $("#quantity").val()
	const checked = $(".box").is(":checked")
	
	if(!checked || !quantity) {
		
		alert('아이스크림과 갯수를 선택해주세요.')
		event.preventDefault();
		return false
		
	} 
	return true
}
</script>
</head>
<body>
<%@include file = "/jsp/common/header.jsp" %>
	<div>
		<div>${ icecream.ice_price }
		 <form action = "iceSelect.do" onsubmit = "return isIceSelected(event)">
		  <h2>아이스크림 맛 선택</h2>
		   <c:forEach var = "icecream" items="${ice_Stock}">
		   	<c:choose>
		   		<c:when test = "${icecream.ice_quantity eq 0}">
		   			<span id = "sold">${icecream.ice_flavors} 품절</span>
		   		</c:when>
		   		<c:otherwise>
		   			<input type = "checkbox" class = "box" name = "ice" value = "${icecream.ice_flavors}">${icecream.ice_flavors}
		   			<input type = "hidden" name = "${icecream.ice_flavors}" value = "${icecream.ice_price}">
		   		</c:otherwise>
		   	</c:choose>   	 		
			</c:forEach>
			  <select name = "quantity" id = "quantity">
				<option value = "">컵 갯수</option>
				<option value = "1">1</option>
				<option value = "2">2</option>
				<option value = "3">3</option>
				<option value = "4">4</option>
				<option value = "5">5</option>
			  </select>
			<br>
			<button type = "submit">주문확인</button>
			</form>
		</div>
	</div>
</body>
</html>