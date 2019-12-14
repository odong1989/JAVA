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
	
	
	//��ü�� �����ϱ� ���ؼ��� fileoutput
	public BoardManagerImpl(){
		//step1 try����
		try {
			//step2.������ ���ϴ�.
			fileIn = new ObjectInputStream(new FileInputStream(fileName));
			
			//step3.���Ͽ��� ArrayList��ü�� �н��ϴ�.
			list = (ArrayList<Board>) fileIn.readObject();

			//step4.���������� �ݽ��ϴ�.(#������ �������)
			fileIn.close();
		}//try END
		//step5. ��Ÿ���ܹ߻�(������ �ִµ� �����Ͱ� ���� ���)�� �� ArrayList�� �����Ѵ�.
		//���� ����� ���� ������ ������� �����մϴ�.
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
		// step1. �����ϱ� ���� ���� ��ȣ�� �ִ��� Ȯ���Ѵ�.
		if(getBoard(board.getNum()) != null ) {
		// step2. ���Ϲ�ȣ ������ false�������� �ȵȴٰ� �Ѵ�.
			System.out.println("���� ��ȣ�� ������ Ȯ�ε�");
			return false;//saveCheck���� ���忩�� Ȯ�����ǹ��� ���̵ȴ�.
		}
		// step3. ���Ϲ�ȣ ������ ������ �����Ѵ�.
		list.add(board);
		return true;//saveCheck���� ���忩�� Ȯ�����ǹ��� ���̵ȴ�.
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
		 System.out.println("board.dat���� ������ �Ϸ��մϴ�.");	
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	

}
