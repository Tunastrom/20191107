<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<c:choose>
			<c:when test="${result != 0}">
				<h1>공지사항 작성이 완료되었습니다.</h1>
				<button type ="button" onclick="location.href='index.do'">확인</button>
			</c:when>
			<c:otherwise>
				<h1>공지사항 작성에 실패했습니다.</h1>
				<button type ="button" onclick="location.href='noticeInput.do'">확인</button>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>