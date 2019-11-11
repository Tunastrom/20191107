<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	border-collapse: collapse;
	border: 1px solid gray;
}

.button {
	align: right;
	margin: 5px;
}

#name, #wDate, #title, #contents {
	border: 0px;
}
</style>
<script>
	function formCheck() {
		if (frm.name.value == "") {
			alert("작성자를 입력하세요.");
			frm.name.focus();
			return false;
			s
		}

		if (frm.title.value == "") {
			alert("제목을 입력하세요.");
			frm.title.focus();
			return false;
		}

		if (frm.contents.value == "") {
			alert("내용을 입력하세요.");
			frm.contents.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<div align="center">
		<form id="frm" name="frm" action="boardWriteOk.do" method="post"onsubmit="return formCheck()">
			<table border="1">
				<caption align="bottom" style="margin: 5px;">
					<span class="button"><input type ="submit" value="등록"></button></span> 
					<span class="button"><button type="button" onclick="frm.reset()">취소</button></span> 
					<span class="button"><button type="button"onclick="location.href='boardList.do'">목록보기</button></span>
				</caption>
				<tr>
					<th width="70">작성자</th>
					<td><input type="text" id="name" name="name" size="38px"></td>
					<th width="70">작성일자</th>
					<td><input type="date" id="wDate" name="wDate" size="20"></td>
				</tr>
				<tr>
					<th>제목</th>
					<td colspan="3"><input type="text" id="title" name="title"
						size></td>
				</tr>
				<tr>
					<th>내용</th>
					<td colspan="3"><textarea rows="10" cols="72" id="contents"
							name="contents"></textarea></td>
				</tr>
			</table>
		</form>
		<script type="text/javascript">
			document.getElementById('wDate').value = new Date().toISOString()
					.substring(0, 10);
		</script>
	</div>
</body>
</html>