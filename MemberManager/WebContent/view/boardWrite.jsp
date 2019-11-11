<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

 function formCheck(){
	 if(frm.title.value == ""){
		 alert("제목을 입력하세요");
		 frm.title.focus();
		 return false;
	 }
	 if(frm.content.value == ""){
		 alert("제목을 입력하세요");
		 frm.content.focus();
		 return false;
	 }
	 return true;
 }
</script>
</head>
<body>
	<div align="center">
		<form id="frm" name="frm" action="boardWriteOk.do" method="post" onsubmit="return formCheck()">
		<input type="hidden" id="userid" name="userid" value="${id}">
		<input type="hidden" id="name" name="name" value="${name}">
		<table>
			<caption align="bottom">
				<div>
					<input type="submit" value="작성완료">
					<button type="button" onclick="location.href='boardList.do'">취소</button>
				</div>
			</caption>
			<tr>
				<th>제목</th><td><input type="text" id="title" name="title"></td>
			</tr>
			<tr>
				<th>내용</th><td><textarea id="content" name="content" col="71" row="10"></textarea></td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>