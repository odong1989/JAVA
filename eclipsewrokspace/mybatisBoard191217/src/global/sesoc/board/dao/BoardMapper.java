package global.sesoc.board.dao;

import java.util.ArrayList;
import java.util.HashMap;

import global.sesoc.board.vo.BoardVO;


public interface BoardMapper {
	public int 					writeBoard(BoardVO vo);
	public ArrayList<BoardVO>	readBoard(int num);
	//전체글을 읽어오는 ListBoard는 삭제.
	//1개만 읽어와도 ArrayList에 담아오면 되는 일이니까요.
	public int 					deleteBoard(int deleteNum);
	public int 					updateBoard(BoardVO updateBoard);
	public ArrayList<BoardVO> 	searchBoard(HashMap<String, Object> map);
	
}
