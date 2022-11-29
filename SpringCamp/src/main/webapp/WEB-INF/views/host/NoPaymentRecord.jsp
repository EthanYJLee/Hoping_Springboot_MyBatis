<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>캠핑장 삭제 확인창</title>
</head>
<body>

<script>
window.onload = function test() {
	var result = confirm("결제 기록이 없습니다. 삭제하시겠습니까?");
	
	if (result == true) {
		window.location.href="camp_is_deleted";
	} else {
		alert("메인화면으로 돌아갑니다.");
		window.location.href="host_main";
	}
}
</script>

</body>
</html>