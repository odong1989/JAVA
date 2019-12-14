package workbook.address3.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import workbook.address3.vo.AddressVO;

/**
 * 회원정보를 저장, 삭제, 검색해주는 기능 담당 클래스
 */
public class AddressManagerImpl implements AddressManager {
	ArrayList<AddressVO> list;		//회원 정보를 저장할 리스트
	ObjectInputStream inFile;		//파일로부터 객체를 읽을 스트림
	ObjectOutputStream outFile;		//파일에 객체를 저장할 스트림
	/* ArrayList<AddressVO> list;		//회원 정보를 저장할 리스트
	   ObjectInputStream inFile;		//파일로부터 객체를 읽을 스트림
	   ObjectOutputStream outFile;		//파일에 객체를 저장할 스트림
	     위의 변수들은 모두 초기값이 NULL입니다.
	 * */
	final String filename = "address.dat";	//파일명, 일일이 파일명 설정하고 하면서 피곤하니 기본값을 아예 해놓았음.
	//final가 변수앞에 붙을 경우->변수의 수정을 불허한다!
	//final가 클래스 앞에 붙을 경우 -> 상속받기를 금지한다!
	//final가 메소드 앞에 붙을 경우 -> 없다. 클래스부터 막혔는데 뭔수로 메소드를 상속받아서 막아? 
	public AddressManagerImpl() {
		//최초 실행될 때 파일을 읽어들이고, 없으면 리스트 생성
		try {
			inFile = new ObjectInputStream(new FileInputStream(filename));//파일이 없는 경우 catch로 갑니다.
			list = (ArrayList<AddressVO>) inFile.readObject(); //파일은 있는데 내용이 없는 경우도 catch로 갑니다.
			inFile.close();//제대로 읽었다면 파일닫기까지 하지.
		}
		catch (Exception e) {
			list = new ArrayList<AddressVO>();//비어있는 ArrayList를 생성해라.
		}
	}
	
	@Override
	public boolean addAddress(AddressVO vo) {
		//같은 번호의 회원이 있는지 확인
		if (getAddress(vo.getNum()) != null) {//null이 아니다! = 빈방이 아니야!=누군가 쓰고 있어!
			return false;//같은 번호를 부여할 수는 없잖아? 그래서 안되요라고 답신한거.
		}
		//없으면 저장
		list.add(vo);
		return true;
	}

	@Override
	public ArrayList<AddressVO> getList() {
		return list;
	}

	@Override
	public AddressVO getAddress(int num) {
		AddressVO vo = null;
		for (int i = 0; i < list.size(); i++) {
			vo = list.get(i);
			if (num == vo.getNum()) {
				return vo;
			}
		}
		return null;
	}
	
	@Override
	public ArrayList<AddressVO> getAddress(String name) {
		//검색결과를 저장할 리스트 생성
		ArrayList<AddressVO> searchList = new ArrayList<>();
		AddressVO vo = null;
		
		for (int i = 0; i < list.size(); i++) {
			vo = list.get(i);
			//이름이 같은 회원의 정보를 새 리스트에 추가
			if (name.equals(vo.getName())) {
				searchList.add(vo);
			}
		}
		return searchList;
	}

	@Override
	public boolean deleteAddress(int num) {
		AddressVO vo = null;
		
		for (int i = 0; i < list.size(); i++) {
			vo = list.get(i);
			//전달받은 번호의 회원정보가 있으면 삭제
			if (num == vo.getNum()) {
				list.remove(i);
				return true;
			}
		}
		//없으면 false리턴
		return false;
	}

	@Override
	public void saveFile() {
		try {
			//현재 ArrayList를 파일에 저장
			outFile = new ObjectOutputStream(new FileOutputStream(filename));
			outFile.writeObject(list);//ArrayList는 직렬화 되어있고 내가 입력한 데이터 vo객체들이 직렬화 되어있다면 1번저장으로 모조리 저장됩니다.
			//public class AddressVO implements Serializable
			//implements Serializable라는문구가 없으면 객체직렬화가 안되고,
			//그러고 저장이 안되고, 그렇게 문제내기 딱 좋고
			outFile.close();
			System.out.println("파일이 저장되었습니다.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
