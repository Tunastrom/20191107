<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<div><h1>회 원 목 록</h1></div>
		<div>
			<table id="myTable" class="display">
				<thead>
					<tr>
						<th>아이디</th>
						<th>비밀번호</th>
						<th>이름</th>
						<th>권한</th>
						<th>가입일</th>
						<th>주소</th>
						<th>전화번호</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="dto" items="${list}">
						<tr>
							<td>${dto.id}</td>
							<td>${dto.password}</td>
							<td>${dto.name}</td>
							<td>${dto.grant}</td>
							<td>${dto.eDate}</td>
							<td>${dto.addr}</td>
							<td>${dto.tel}</td>
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
						<th></th>
						<th></th>
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
</body>
</html>