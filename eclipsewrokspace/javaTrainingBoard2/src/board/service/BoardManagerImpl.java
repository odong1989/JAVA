package board.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import board.vo.Board;

public class BoardManagerImpl implements BoardManager {
	ArrayList<Board>		 list;
	ObjectInputStream		 fileIn;
	ObjectOutputStream 		 fileOut;
	final String fileName = "board.dat";
	
	
	//객체를 저장하기 위해서는 fileoutput
	public BoardManagerImpl(){
		//step1 try설정
		try {
			//step2.파일을 엽니다.
			fileIn = new ObjectInputStream(new FileInputStream(fileName));
			
			//step3.파일에서 ArrayList객체를 읽습니다.
			list = (ArrayList<Board>) fileIn.readObject();

			//step4.원본파일을 닫습니다.(#얻을건 얻었으니)
			fileIn.close();
		}//try END
		//step5. 기타예외발생(파일은 있는데 데이터가 없는 경우)등 빈 ArrayList를 생성한다.
		//전에 만들어 놓은 파일이 없을경우 생성합니다.
		catch(IOException error) {
	//		error.printStackTrace();
			list = new ArrayList<Board>();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
		}
	}
	
	@Override
	public boolean add(Board board) {
		// step1. 저장하기 전에 같은 번호가 있는지 확인한다.
		if(getBoard(board.getNum()) != null ) {
		// step2. 동일번호 있을시 false리턴으로 안된다고 한다.
			System.out.println("동일 번호가 있음이 확인됨");
			return false;//saveCheck에서 저장여부 확인조건문에 값이된다.
		}
		// step3. 동일번호 없을시 저장을 진행한다.
		list.add(board);
		return true;//saveCheck에서 저장여부 확인조건문에 값이된다.
	}

	@Override
	public ArrayList<Board> listAll() {
		
		return list;
	}

	@Override
	public Board getBoard(int num) {
		Board board = null;
		for(int i =0; i< list.size() ; i++) {
			board = list.get(i);
			if(num == board.getNum()){
				return board;
				}
			}
		return null;
	}

	@Override
	public boolean remove(int num) {
		Board board = null;
		for(int i=0; i<list.size();i++){
			board = list.get(i);
			if(num == board.getNum()){
				list.remove(i);
				saveFile();
				return true;
			}
		}
		return false;
	}

	@Override
	public void saveFile() {
		try {
		fileOut = new ObjectOutputStream(new FileOutputStream(fileName));
		fileOut.writeObject(list);
		fileOut.close();
		 System.out.println("board.dat으로 저장을 완료합니다.");	
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	

}
