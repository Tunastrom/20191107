<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
<script type="text/javascript" src="js/myJavaScript.js"></script>
</head>
<body>
<div id="memu" align="center">
	<nav id="topMenu">
		<ul>
			<li class="topMenuLi"><a class="menuLink" href="index.jsp"> 홈 </a></li>
			<li>|</li>
			<c:if test="${!empty id}">
				<li class="topMenuLi"><a class="menuLink" href="notice.do">공지사항</a>
					<c:if test="${ grant == 'S'}">
						<ul class="submenu">
							<li><a href="noticeInput.do" class="submenuLink">글 등록</a></li>
							<li><a href="#" class="submenuLink">글 수정</a></li>
							<li><a href="#" class="submenuLink">글 삭제</a></li>
						</ul></li>
					</c:if>
				<li>|</li>
			</c:if>
			<c:choose>
				<c:when test="${ grant == 'U'}">
					<li class="topMenuLi"><a class="menuLink" href="">마이페이지</a>
						<ul class="submenu">
							<li><a href="#" class="submenuLink">내 정보수정</a></li>
							<li><a href="#" class="submenuLink">회원탈퇴</a></li>
				</c:when>
				<c:when test="${ grant == 'S'}">
					<li class="topMenuLi"><a class="menuLink" href="">회원관리</a>
						<ul class="submenu">
							<li><a href="memberList.do" class="submenuLink">회원목록보기</a></li>
				</c:when>
				<c:otherwise>
					<li class="topMenuLi"><a class="menuLink" href="">회원가입</a>
						<ul class="submenu">
							<li><a href="newMember.do" class="submenuLink">회원등록</a></li>
				</c:otherwise>
			</c:choose>
				</ul></li>
				<ul class="submenu">
					<li><a href="newMember.do" class="submenuLink">회원등록</a></li>
					<li><a href="#" class="submenuLink">회원수정</a></li>
					<li><a href="#" class="submenuLink">회원 삭제</a></li>
				</ul></li>
			<li>|</li>
			<li class="topMenuLi"><a class="menuLink" href="boardList.do">자유게시판</a></li>
			<li>|</li>
			<c:choose>
			<c:when test="${id==null}">
				<li class="topMenuLi"><a class="menuLink" href="login.do">로그인</a>
				</li>
			</c:when>
			<c:otherwise>
				<li class="topMenuLi"><a class="menuLink" href="logout.do">로그아웃</a></li>
			</c:otherwise>
			</c:choose>
		</ul>
	</nav>
</div>
</body>
</html>