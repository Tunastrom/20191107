<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function newMemberEnd(n){
		if(n==1){
			document.location="login.do";
		} else {
			document.location="newMember.do";
		}	
	}
</script>
</head>
<body>
	<div align="center">
		<c:choose>
			<c:when test="${result != 0}">
				<h1>회원가입이 완료되었습니다</h1>
				<button id ="button" type="button" onclick="newMemberEnd(1)">확인</button>
			</c:when>
			<c:otherwise>
				<h1>회원가입에 실패했습니다.</h1>
				<button id ="button" type="button" onclick="newMemberEnd(0)">확인</button>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>