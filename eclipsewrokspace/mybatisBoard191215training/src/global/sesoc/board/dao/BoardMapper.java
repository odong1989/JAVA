package global.sesoc.board.dao;

import java.util.ArrayList;

import global.sesoc.board.vo.BoardVO;


public interface BoardMapper {
	public int 					writeBoard(BoardVO vo);
	public BoardVO 				readBoard(int num);
	public ArrayList<BoardVO>	listBoard();
	public int 					deleteBoard(int deleteNum);
	public int 					updateBoard(BoardVO updateBoard);
	public BoardVO				nullCheck(int numCheckBoard);	
}
