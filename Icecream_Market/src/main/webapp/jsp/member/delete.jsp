<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>	
	if(${empty sessionScope.member}) {
		alert('계정삭제가 완료되었습니다.')
		location.href = "/Icecream_Market/index.jsp"
	}
	else {
		alert('계정삭제에 실패했습니다.')
		location.href = "/Icecream_Market/index.jsp"
	}
</script>