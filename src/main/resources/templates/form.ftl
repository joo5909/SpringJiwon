
<html>
	<head>	
	<title>Insert title here</title>	
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	</head>
	<body>
		<p>1. GET 방식 전송 </p>
		<form name = "frm1" method = "GET" action = "./get">
			ID : <input type ="text" maxlength = "10" name = "gID">
			PW : <input type ="password" maxlength = "10" name = "gPW">
			<input type ="submit" value = "GET 전송">
		</form>
		<p>2. POST 방식 전송 </p>
		<form name = "frm2" method = "POST" action = "./post">
			ID : <input type ="text" maxlength = "10" name = "pID">
			PW : <input type ="password" maxlength = "10" name = "pPW">
			<input type ="submit" value = "POST 전송">
		</form>		
		<a href = "./">첫화면으로 돌아가기 </a>
	</body>
</html>