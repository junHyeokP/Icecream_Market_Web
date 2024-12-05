/**
 *  Button functions 
 */ 	

$(document).on("click", "#updateBtn", () => {	
	location.href = "/Icecream_Market/member/updatePage.do"
})

$(document).on("click", "#deleteBtn", () => {
	
	if(confirm('정말 이 계정을 삭제하시겠습니까?')) {
			location.href = "/Icecream_Market/member/delete.do"
	}
		
})

$(document).on("click", "#favBtn", () => {
	location.href = "/Icecream_Market/member/favoritePage.do"
})

$(document).on("click", ".backBtn", () => {
	location.href = "/Icecream_Market/index.jsp"
})	

$(document).on("click", ".to_MyPageBtn", () => {
		location.href = "/Icecream_Market/member/myPage.do"
})	

$(document).on("click", ".to_registPageBtn", () => {
		location.href = "/Icecream_Market/member/registPage.do"
})			

$(document).on("click", ".to_registBtn", () => {
		location.href = "/Icecream_Market/member/regist.do"
})			

$(document).on("click", "#logoutBtn", () => {
	
	if (confirm('정말로 로그아웃 하시겠습니까?')) {
		location.href = "/Icecream_Market/member/logout.do"
	}
})



