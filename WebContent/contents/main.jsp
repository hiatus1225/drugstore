<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>

<head>
	<meta charset=UTF-8>
	<link href="css/mymain.css" rel="stylesheet">
	<title>initial view</title>
<script src="js/mymain.js"></script>
		<script>
		
		
		
		</script>
</head>
<body style="margin: 0;padding: 0;outline: 0 none;border: 0 none;box-sizing: border-box">

<header><jsp:include page="header.jsp"></jsp:include></header>


	<div class="contents">
		<ol>
			<li><h2><a href="sell.jsp" id="intosell" target="_blank" >판매등록</a></h2></li>
			<li><h2><a href="setm.jsp" id="gotosetm" target="_blank">시재관리</a></h2></li>
			<li><h2><a href="setadmin.jsp" id="setadmin" target="_blank">관리</a></h2></li>
			<li><h2><a href="" id="close" onclick='WinClose()'>종료</a></h2></li>
		</ol>
		
	</div>

<footer>
<jsp:include page="footer.jsp"></jsp:include>
</footer>

</body>
</html>