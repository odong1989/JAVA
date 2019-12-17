package global.sesoc.board.dao;

import java.util.ArrayList;
import java.util.HashMap;

import global.sesoc.board.vo.BoardVO;


public interface BoardMapper {
	public int 					writeBoard(BoardVO vo);
	public ArrayList<BoardVO>	readBoard(int num);
	//��ü���� �о���� ListBoard�� ����.
	//1���� �о�͵� ArrayList�� ��ƿ��� �Ǵ� ���̴ϱ��.
	public int 					deleteBoard(int deleteNum);
	public int 					updateBoard(BoardVO updateBoard);
	public ArrayList<BoardVO> 	searchBoard(HashMap<String, Object> map);
	
}
