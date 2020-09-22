<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="/resources/static/js/jquery-3.5.1.js"></script>
<script type="text/javascript">

	$(function(){
		alert("테스트");
		$("#btnSvcChange").on("click", function(e) {
			var $target = $(this);
			$target.text("취소");
		});
	});
</script>
<link rel="icon" type="image/x-icon" href="/resources/static/images/favicon.ico">
<title>데모</title>
</head>
<body>
데모 버전 입니다.<br/>

<table>
<tr>
	<td>버튼 클릭 테스트:</td>
	<td>
		<button id="btnSvcChange">서비스전환</button>
	</td>
</tr>

</table>
</body>
</html>