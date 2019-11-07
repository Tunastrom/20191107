function loginFormCheck(){
	console.log(frm.id.value);
	console.log(frm.pw.value);
	if (frm.id.value==""){
		alert("아이디를 입력하세요");
		frm.id.focus();
		return false;
	}
	if (frm.pw.value==""){
		alert("패스워드를 입력하세요");
		frm.pw.focus();
		return false;
	}
	return true;
}
