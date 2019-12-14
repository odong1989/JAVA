package workbook.address3.service;

import java.util.ArrayList;

import workbook.address3.vo.AddressVO;

/**
 * 하위 클래스에서 구현할 추상 메소드들을 정의한 인터페이스
 */
public interface AddressManager {
	/**
	 * 리스트에 새 회원정보를 추가
	 * @param address 추가할 회원 정보
	 * @return 저장 성공 여부
	 */
	public boolean addAddress(AddressVO board);
	
	/**
	 * 리스트의 모든 내용 리턴
	 * @return 리스트 객체
	 */
	public ArrayList<AddressVO> getList();
	
	/**
	 * 전달된 번호의 회원 정보 리턴
	 * @param num 회원 번호
	 * @return 해당 번호의 회원 정보
	 */
	public AddressVO getAddress(int num);
	
	/**
	 * 전달된 이름의 회원들의 정보 리턴
	 * @param name 회원이름
	 * @return 이름을 가진 회원 정보 리스트
	 */
	public ArrayList<AddressVO> getAddress(String name);
	
	/**
	 * 전달된 번호의 회원 정보 삭제
	 * @param num 삭제할 회원번호
	 * @return 삭제 성공 여부
	 */
	public boolean deleteAddress(int num);
	
	/**
	 * 파일 저장
	 */
	public void saveFile();
}
