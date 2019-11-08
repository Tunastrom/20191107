<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function idCheckResult(){
		if (${distinct} == true){
			window.opener.document.frm.idch.value = "Checked";
			window.opener.document.frm.pw.focus();
		} else{
			window.opener.document.frm.idChk.value = "";
			window.opener.document.frm.id.focus();
		}
		window.close();
	}
</script>
</head>
<body>
	<div align="center">
		<c:choose>
			<c:when test="${distinct == true}">
				<h3>${nid}는 사용가능합니다.</h3>
			</c:when>
			<c:otherwise>
				<h3>${nid}는 이미 가입되어있습니다.</h3>
			</c:otherwise>
		</c:choose>
		<button type="button" onclick="idCheckResult()">확인</button>
	</div>
</body>
</html>