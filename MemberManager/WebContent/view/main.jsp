<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<jsp:include page="topmenu.jsp"></jsp:include>
		</div>
		<div>
			<c:if test="${id == null}">
			<h1>메인페이지</h1>
			</c:if>
			
			<c:if test="${id != null}">
				<c:if test="${grant == 'S'}">
					<h1>[관리자] ${id}님 환영합니다!</h1>
				</c:if>
				<c:if test="${grant == 'U'}">
					<h1>[일반회원] ${id}님 환영합니다!</h1>
				</c:if>
			</c:if>
		</div>
	</div>
</body>
</html>