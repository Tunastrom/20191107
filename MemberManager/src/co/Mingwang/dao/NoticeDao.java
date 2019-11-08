package co.Mingwang.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import co.Mingwang.dto.NoticeDto;

public class NoticeDao extends DAO {
	ArrayList<NoticeDto> list;
	NoticeDto dto;
	
	public NoticeDao() {
		super();
	}
	
	public ArrayList<NoticeDto> select(){ //전체리스트 또는 한 개 리스트 가져오기
		list = new ArrayList<>(); 
		NoticeDto dto = null;
		String sql = "select * from notice";
		try {
			psmt=conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				dto = new NoticeDto();
				dto.setnId(rs.getInt("nid"));
				dto.setnTitle(rs.getString("ntitle"));
				dto.setnContent(rs.getString("ncontent"));
				dto.setnDate(rs.getString("ndate"));
				dto.setnHit(rs.getInt("nhit"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		//code 추가
		return list; 
	}
	
	public NoticeDto select(int id) {
		NoticeDto dto = new NoticeDto();
		int n=0;
		return dto;
	}
	
	public int insert(NoticeDto dto) {
		int n=0;
		String sql="insert into notice (nid, ntitle, ncontent) "
				  +"values(notice_seq.nextval,?,?)";
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, dto.getnTitle());
			psmt.setString(2, dto.getnContent());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}
	
	public int update(NoticeDto dto) {
		int n=0;
		
		return n;
	}
	
}
