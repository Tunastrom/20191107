/**
 * 
 */
package co.Mingwang.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import co.Mingwang.dto.MemberDto;

/**
 * @author User
 *	 상위 DAO 클래스를 상속받아서 memberDao를 생성
 */
public class MemberDao extends DAO {
	
	private MemberDto dto;
	private ArrayList<MemberDto> list;
	
	public MemberDao() {
		super();
	}
	
	public ArrayList<MemberDto> select(){ //전체 회원정보 가져오기
		list = new ArrayList<MemberDto>();
		MemberDto result=null;
		String sql ="select * from member";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				result = new MemberDto();
				result.setId(rs.getString("member_id"));
				result.setPassword(rs.getString("member_pass"));
				result.setName(rs.getString("member_name"));
				result.setGrant(rs.getString("member_grant"));
				result.seteDate(rs.getString("member_enterdate"));
				result.setAddr(rs.getString("member_addr"));
				result.setTel(rs.getString("member_tel"));
				list.add(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	public MemberDto select(String id) { //1명의 회원정보 가져오기
		dto = new MemberDto();
		//code 추가
		close();
		return dto;
	}
	
	public int insert(MemberDto dto) {
		int n=0;
		String sql = "insert into member value(member_id, member_pass, member_name, member_addr, member_tel) "
				   + "values (?, ?, ?, ?, ?)";
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPassword());
			psmt.setString(3, dto.getName());
			psmt.setString(4, dto.getAddr());
			psmt.setString(5, dto.getTel());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}
	
	public int update(MemberDto dto) {
		int n=0;
		//code 추가
		close();
		return n;
	}
	public int delete(MemberDto dto) {
		int n=0;
		//code 추가
		close();
		return n;
	}
	
	public String loginCheck(String id, String pw) {
		String grant=null;
		String sql ="select member_grant from member where member_id =? and member_pass=?";
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				grant=rs.getString("member_grant");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return grant;
	}
	
}
