<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <!-- 위의 jquery 라이브러리가 있어야 구동되는 자바스크립트 라이브러리 -->
    <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
    <!-- css 라이브러리 -->
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css">
    <script>
        $(document).ready(function() {
            $("#example").dataTable();
        });
        function transData(n){
        	frm.id. value = n;
        	frm.submit();
        }
    </script>
</head>
<body>
	<div align = "center">
		<div><h1>게시판 목록</h1></div>
		<div>
			<form id="frm" name ="frm" action="boardView.do" method="post">
			<input type="hidden" id="id" name="id">
			<table id ="example" class="display">
				<thead>
					<tr>
						<th width="20">순번</th>
						<th width="70">작성자</th>
						<th width="200">제목</th>
						<th width="100">작성일자</th>
						<th width="50">조회수</th>	
						<th width="50">댓글</th>			
					</tr>
				</thead>
				<tbody>
					<c:forEach var= "dto" items="${list}">
					<!-- jstl -->                <!-- el표현식-->
					<!-- java의 확장for문을 떠올려라!, list는 command인터페이스의 구현객체가 작성한 리퀘스트객체가 갖고 있는 것이다. -->
						<tr onmouseover="this.style.backgroundColor='#FFFF99'"
							onmouseout="this.style.backgroundColor=''"
							onclick="transData(${dto.id})">
							<td>${dto.id}</td>
							<td>${dto.name}</td>
							<td>${dto.title}</td>
							<td>${dto.wDate}</td>
							<td>${dto.hit}</td>
							<td>0</td>
						</tr>
					</c:forEach>
				</tbody>
					<tfoot>
						<tr>
							<th width="20"></th>
							<th width="70"></th>
							<th width="200"></th>
							<th width="100"></th>
							<th width="50"></th>
							<th width="50"></th>					
						</tr>
					</tfoot>
			</table>
			</form>
			<div>
				<br />
				<button type ="button" onclick="location.href='boardWrite.do'">글쓰기</button>&nbsp;&nbsp;
				<button type ="button" onclick="location.href='index.do'">홈으로</button>
			</div>
		</div>
	</div>
</body>
</html>