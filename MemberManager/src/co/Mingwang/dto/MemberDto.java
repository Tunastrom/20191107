package co.Mingwang.dto;

import java.sql.Date;

public class MemberDto {
	private String id; 
	private String name;
	private String password;
	private char grant;
	private String addr;
	private Date eDate;
	private String tel;
	
	public MemberDto() {

	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getGrant() {
		return grant;
	}
	public void setGrant(char grant) {
		this.grant = grant;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Date geteDate() {
		return eDate;
	}
	public void seteDate(Date eDate) {
		this.eDate = eDate;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
