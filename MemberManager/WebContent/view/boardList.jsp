<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판</title>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css">
<script>
	$(document).ready(function() {
		$('#myTable').DataTable();
	});
	function tranceData(n){
		frm.id.value = n
		frm.submit();
	}
	
</script>
</head>
<body>
	<div align="center">
		<div><jsp:include page="topmenu.jsp"></jsp:include></div>
		<c:choose>
			<c:when test="${list[0] != null}">
			<div>
				<h1>자유게시판</h1>
			</div>
			<div>
			<form id="frm" name="frm" action="boardRead.do" method="post">
			<input type="hidden" id="id" name="id">
				<table id="myTable" class="display">
					<c:if test="${!empty id}">
					<caption align="bottom">
						<div align="center">
							<br />
							<button type="button" onclick="location.href='boardWrite.do?id='">글쓰기</button>
						</div>
					</caption>
					</c:if>
					<thead>
						<tr>
							<th>글번호</th>
							<th>작성자</th>
							<th>제목</th>
							<th>작성일</th>
							<th>조회수</th>
						</tr>	
					</thead>
					<tbody>
						<c:forEach var="dto" items="${list}">
							<tr onclick="tranceData(${dto.bid})">
								<td>${dto.bid}</td>
								<td>${dto.writer}</td>
								<td>${dto.title}</td>
								<td>${dto.wDate}</td>
								<td>${dto.hit}</td>
							</tr>
						</c:forEach>
					</tbody>
					<tfoot>
						<tr>
							<th></th>
							<th></th>
							<th></th>
							<th></th>
							<th></th>
						</tr>
					</tfoot>
				</table>
			</form>
			</div>
			</c:when>
			<c:otherwise>
				<h1>게시글이 없습니다</h1>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>