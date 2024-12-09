<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href = "/Icecream_Market/css/common_CSS/button_Style.css" />
<script src = "/Icecream_Market/lib/jquery-3.7.1.min.js"></script>
<script src = "/Icecream_Market/js/icecream_JS/icecream_Btn_func.js"></script>
<script>
$(document).on("click", "#getIceBtn", () => {
	
	if(${not empty sessionScope.member}) {
		location.href = "/Icecream_Market/icecream/iceSelectPage.do"
	} else {
			alert('로그인 되어있지 않습니다, 로그인 후 이용해주세요.')
			location.href = "/Icecream_Market/member/loginPage.do"
	}
})
</script>
</head>
<body>
<div align = "center">
	<h2>
		<button id = "getIceBtn">
			지금 바로 주문하러 가기
		</button>
	</h2>
</div>
</body>
</html>