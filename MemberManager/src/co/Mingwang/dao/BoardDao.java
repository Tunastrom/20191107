package co.Mingwang.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import co.Mingwang.dto.BoardDto;

public class BoardDao extends DAO {
	private BoardDto dto;
	private ArrayList<BoardDto> list;
	
	public BoardDao() {
		super();
	}
	
	public ArrayList<BoardDto> select(int id){ //전체리스트 또는 한 개 리스트 가져오기
		System.out.println(id);
	
		list = new ArrayList<>(); //id = 0: 전체 or 그룹전체
		BoardDto dto = null;
		String sql = "select * from mvc_board";
		if(id != 0) {
			sql += " where bgroup=? order by bstep";
		} else {
			sql += " where bstep = 0";
		}
		try {
			psmt=conn.prepareStatement(sql);
			if(id != 0) {
				psmt.setInt(1, id);
			}
			rs = psmt.executeQuery();
			while(rs.next()) {
				dto = new BoardDto();
				dto.setBid(rs.getInt("bid"));
				dto.setWriter(rs.getString("bname"));
				dto.setTitle(rs.getString("btitle"));
				dto.setContents(rs.getString("bcontent"));
				dto.setwDate(rs.getString("bdate"));
				dto.setHit(rs.getInt("bhit"));
				dto.setUserId("userid");
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	
		return list; 
	}
	
	public int insert(BoardDto dto) {
		int n=0;
		String sql ="insert into mvc_board (bid, bname, btitle, bcontent, bgroup, bstep, bident, userid) "
				   +"values(b_num.nextval, ?, ?, ?, b_num.currval, 0, 0, ?)";
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, dto.getWriter());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getContents());
			psmt.setString(4, dto.getUserId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}
	
	public int update(BoardDto dto) {
		int n=0;
		
		return n;
	}
	
}
