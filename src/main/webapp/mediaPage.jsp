<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Videos</title>
</head>
<body>
<% if(session.getAttribute("uName") == null )
 {
 response.sendRedirect("loginPage.jsp");
 }
%>
<img alt="image not found" src="src/demo.img">
<br>
<audio src="src/source.mp3" controls></audio>
<br>
<video src="src/source.mp4" controls></video>
<br>
</body>
</html>
