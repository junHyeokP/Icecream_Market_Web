/**
 * 
 */

function logoutConfirm() {
	if (confirm('정말로 로그아웃 하시겠습니까?')) {
		location.href = "/Icecream_Market/member/logout.do"
	} else {
		location.href = "index.jsp"
	}

		
}
