<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	if(${not empty sessionScope.cart}) {
		alert('선택한 아이스크림 조합이 장바구니에 추가되었습니다.')
		location.href = "/Icecream_Market/index.jsp"
	} else {
		alert('오류가 발생했습니다, 메인화면으로 돌아갑니다.')
		location.href = "/Icecream_Market/index.jsp"
	}
</script>
