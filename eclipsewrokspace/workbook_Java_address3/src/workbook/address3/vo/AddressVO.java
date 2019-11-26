package workbook.address3.vo;

import java.io.Serializable;

/**
 * 회원 정보를 담을 VO 클래스
 */
public class AddressVO implements Serializable {
	/**
	 * [회원 번호] 
	 * 기존의 경우 회원번호등은 없었지만 이제는 회원번호로 구별까지 
	 * 하고자 회원번호도 저장합니다.
	 */
	private int num;
	/**
	 * 이름
	 */
	private String name;
	/**
	 * 전화번호
	 */
	private String phone;
	/**
	 * 주소
	 */
	private String address;
	
	/**
	 * 생성자(1) 
	 * [기본 생성자]
	 */
	public AddressVO() {
	}

	/**
	 * 생성자(2)
	 * [초기값을 전달받아 초기화하는 생성자]
	 * @param num 		회원번호
	 * @param name 		이름
	 * @param phone 	전화번호
	 * @param address 	주소
	 */
	public AddressVO(int num, String name, String phone, String address) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	/**
	 * Setter, Getter 메소드들
	 */
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override //필수는 아닙니다. 하지만 편의를 위해 하는게 좋죠.
	//모바일이나, 웹을 제작하는 그래픽기반의 경우에도 
	//값이 들어왔는지 확인을 위해 많이 사용하게 됩니다. 
	public String toString() {
		return "회원번호:" + num + ", 이름:" + name + ", 전화번호:" + phone + ", 주소:" + address;
	}
}
