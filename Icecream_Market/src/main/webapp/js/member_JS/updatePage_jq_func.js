/**
 *  Button functions 
 */

$(document).ready(() => { 
	
	$('.updateBtn').click(() => {	
		location.href = "/Icecream_Market/member/updatePage.do"
	})
	
	$('.deleteBtn').click(() => {
			location.href = "/Icecream_Market/member/deletePage.do"
	})
	
	$('.favBtn').click(() => {
			location.href = "/Icecream_Market/member/favoritePage.do"
	})
	
	$('.backBtn').click(() => {
			location.href = "/Icecream_Market/index.jsp"
	})

})


