<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css">
<script>
	$(document).ready( function () {
	    $('#myTable').DataTable();
	} );
</script>
</head>
<body>
	<div align="center">
		<c:choose>
			<c:when test="${list[0] != null}">
				<div><h1>공지사항목록</h1></div>
				<table id="myTable" class="display">
					<thead>
						<th>글번호</th>
						<th>제목</th>
						<th>작성일</th>
						<th>조회수</th>
					</thead>
					<tbody>
						<c:forEach var="dto" items="${list}">
							<tr>
								<td>${dto.nId}</td>
								<td>${dto.nTitle}</td>
								<td>${dto.nDate}</td>
								<td>${dto.nHit}</td>
							</tr>
					</c:forEach>
					</tbody>
					<tfoot>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
					</tfoot>
				</table>	
			</c:when>
			<c:otherwise>
				<h1>공지사항이 없습니다</h1>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>