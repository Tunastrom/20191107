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
		<div>
			<jsp:include page="topmenu.jsp"></jsp:include>
		</div>
		<div>
			<h1>자유게시판</h1>
		</div>
		<div>
			<table>
				<caption align="bottom">
					<div>
						<c:if test="${list.size() > 0}">
							<table>
								<tr>
									<th colspan="3" align="center">댓글 ${list.size()-1}개</th>
								</tr>
								<c:forEach var="i" begin="1" end="${list.size()-1}">
									<tr>
										<th>${i}</th>
										<th>${list[i].writer}</th>
										<td>${list[i].contents}</td>
									</tr>
								</c:forEach>
							</table>
						</c:if>
					</div>
					<div align="center">
						<c:if test="${id == list[0].userid}">
							<br />
							<button type="button" onclick="location.href='boardEdit.do'">글수정</button>
							<button type="button" onclick="location.href='boardelete.do'">글삭제</button>
						</c:if>
						<button type="button" onclick="location.href='boardList.do'">목록으로</button>
					</div>
				</caption>
				<tr>
					<th>글번호</th>
					<td>${list[0].bid}</td>
					<th>작성자</th>
					<td>${list[0].writer}</td>

					<th>게시일</th>
					<td>${list[0].wDate}</td>
					<th>조회수</th>
					<td>${list[0].hit}</td>
				</tr>
				<tr>
					<th>제목</th>
					<td colspan="7">${list[0].title}</td>
				</tr>
				<tr>
					<th>내용</th>
					<td colspan="7">${list[0].contents}</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>