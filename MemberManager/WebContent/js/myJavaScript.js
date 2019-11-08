function loginFormCheck(){
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

function memberFormCheck(){
	if (frm.id.value==""){
		alert("아이디를 입력하세요");
		frm.id.focus();
		return false;
	}
	
	if (frm.idch.value == "unChecked"){
		alert("아이디 중복체크를 실행하세요");
		frm.idch.focus();
		return false;
	}
		
	if (frm.pw.value==""){
		alert("패스워드를 입력하세요");
		frm.pw.focus();
		return false;
	}
	
	if (frm.name.value==""){
		alert("이름을 입력하세요");
		frm.name.focus();
		return false;
	}
	if (frm.addr.value==""){
		alert("주소를 입력하세요");
		frm.addr.focus();
		return false;
	}
	if (frm.fTel.value=="" || frm.mTel.value=="" || frm.lTel.value==""){
		alert("전화번호를 입력하세요");
		if(frm.fTel.value=="")
			frm.fTel.focus();
		if(frm.mTel.value=="")
			frm.mTel.focus();
		if(frm.lTel.value=="")
			frm.lTel.focus();
		return false;
	}
	return true;
}

function idCheck(){ //dfafasdfasf
	var nid = frm.id.value;
	window.open("idCheck.do?nid="+nid,"","width=300, height=400, top=50, left=50");
}
