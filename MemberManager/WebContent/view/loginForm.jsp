<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div><jsp:include page="topmenu.jsp"></jsp:include></div>
			<div><h1>로 그 인</h1></div>
				<div>
					<form id="frm" name="frm" action="loginOk.do" method="post" onsubmit="return loginFormCheck()">
				<div>
					<table>
						<caption align="bottom">
							<div align="right" style="margin: 5px;">
								<span><input type="submit" value="로그인"></span>
								<span><input type="reset" value="초기화"></span>
								<span><input type="button" onclick="location.href='index.do'" value="취소"></input></span>
							</div>
						</caption>
						<tr>
							<th width="100">아이디</th>
							<td><input type="text" id="id" name="id" size="20"></td>
						</tr>
						<tr>
							<th>비밀번호</th>
							<td><input type="password" id="pw" name="pw" size="20"></td>
						</tr>
					</table>
				</div>
			</form>	
		</div>
	</div>
</body>
</html>