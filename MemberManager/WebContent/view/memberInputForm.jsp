<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#fTel, #mTel, #lTel{
		margin: 5px 5px 5px 5px;
	}
</style>
</head>
<body>
	<div align="center">
		<div><jsp:include page="topmenu.jsp"></jsp:include></div>
		<div><h1>회 원 가 입</h1></div>
		<div>
			<br />
			<c:choose>
				<c:when test="${!empty id}">
					<h1>${id}님은 이미 등록된 회원입니다.</h1>
					<a href="index.do">메인으로</a>
				</c:when>
				<c:otherwise>
				 <form id="frm" name="frm" action="newMemberOk.do" method="post" onsubmit="return memberFormCheck()"> 
						<table>
							<caption align="bottom">
								<div align="right" style="margin:5px">
									<span><input type="submit" value="확인"></span>
									<span><input type="reset" value="초기화"></span>
									<span><input type="button" value="취소" onclick="location.href='index.do'"></span>
								</div>
							</caption>
								<tr>
									<th>아이디</th>
									<td>
										<input type="text" id="id" name="id" size="10"><button type="button" onclick="idCheck()" id="idch" name="idch" value="unChecked">중복확인</button>
									</td>
								</tr>
								<tr>
									<th>패스워드</th>
									<td><input type="password" id="pw" name="pw" size="10"></td>
								</tr>
								<tr>
									<th>이름</th>
									<td><input type="text" id="name" name="name" size="10"></td>
								</tr>
								<tr>
									<th>주소</th>
									<td><input type="text" id="addr" name="addr" size="20"></td>
								</tr>
								<tr>
									<th>전화번호</th>
									<td><select id="fTel" name="fTel">
											<option>선택&nbsp;&nbsp;&nbsp;&nbsp;</option>
											<option>010</option>
											<option>011</option>
											<option>012</option>
										</select>
										-<input type="text" id="mTel" name="mTel" size="5">-<input type="text" id="lTel" name="lTel" size="5"></td>
								</tr>
						</table>
					 </form> 
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</body>
</html>