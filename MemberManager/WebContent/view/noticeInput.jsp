<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<form id="frm" name="frm" action="noticeInputOk.do" method="post">
			<table id="myTable" class="display">
			<caption align="bottom">
				<div style="margin: 5px">
					<span><input type="submit" value="확인"></span>
					<span><input type="reset" value="초기화"></span>
					<span><input type="button" onclick="location.href='index.do'" value="취소"></span>
				</div>
			</caption>
			<tr>
				<th>제목</th>
				<td><input type="text" id="title" name="title" required></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea id="content" name="content" col="70" row="5" required></textarea></td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>