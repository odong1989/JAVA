package global.sesoc.study191122;

import java.io.Serializable;

public class Data implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3017658668142658517L;
	/*	private static final long serialVersionUID = -3017658668142658517L;
	 * 이거는 뭔가요?
	 * private=보호중입니다.접근못해요
	 * static=클래스내에서 고유한, 유일한 존재입니다
	 * final= 못고쳐요.수정불허
	 * ----------------------------------------------
	 * serialVersionUID = -3017658668142658517L; 
	 * 버전의 구별을 위해 생성된 것입니다.
	 * 숫자자체는 큰 의미없이 랜덤으로 생성된 겁니다.
	 * = 오른쪽의 숫자는 사용자가 임의로 정의해도 됩니다.(#구별만 잘되면 되니까...)						
	 * 이게 실은 매우중요한 작업이에요
	 * 정의하지 않아도 작동은 합니다.
	 * 하지만 계속되는 업데이트를 하다보면 동명의 클래스들이 생성되는등의 위험이 증가하는데
	 * 
	 * */
	String name;
	int age;
	String address;
	
	public Data() {
	}
	
	public Data(String name, int age, String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}	
	
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}	
	
	//오버라이딩 연습허세요!!!
	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
