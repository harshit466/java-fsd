
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Health Logger</title>
<style>
* {
	margin: 0;
	box-sizing: border-box;
}
body {
	height: 100vh;
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
	/* gap: 12px; */
}
p {
	color: #a0a0a0;
	margin: 4px 0 24px 0;
}
a {
	width: 200px;
	/* height: 50px; */
	border-radius: 12px;
	background: #eee;
	border: 1px solid #eee;
	margin: 8px 0;
	text-decoration: none;
	color: #000;
	padding: 20px 40px;
	text-align: center;
}
a:hover {
	box-shadow: 0 0 4px #a0a0a0;
	border: 1px solid #a0a0a0;
}
</style>
</head>
<body>
<h1>Health Logger</h1>


<a href="managePatients.jsp">Manage Patients</a>
<a href="manageVitals.jsp">Manage Vitals</a>
</body>
</html>