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
		list = new ArrayList<>(); //id = 0: 전체 or 그룹전체
		String sql = "select * from mvc_board";
			if(id != 0) {
				sql+= "where group=?";
			}
		try {
			conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//code 추가
		return list; 
	}
	
	public int insert(BoardDto dto) {
		int n=0;
		
		return n;
	}
	
	public int update(BoardDto dto) {
		int n=0;
		
		return n;
	}
	
}
