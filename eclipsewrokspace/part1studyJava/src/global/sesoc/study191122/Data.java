package global.sesoc.study191122;

import java.io.Serializable;

public class Data implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3017658668142658517L;
	/*	private static final long serialVersionUID = -3017658668142658517L;
	 * �̰Ŵ� ������?
	 * private=��ȣ���Դϴ�.���ٸ��ؿ�
	 * static=Ŭ���������� ������, ������ �����Դϴ�
	 * final= �����Ŀ�.��������
	 * ----------------------------------------------
	 * serialVersionUID = -3017658668142658517L; 
	 * ������ ������ ���� ������ ���Դϴ�.
	 * ������ü�� ū �ǹ̾��� �������� ������ �̴ϴ�.
	 * = �������� ���ڴ� ����ڰ� ���Ƿ� �����ص� �˴ϴ�.(#������ �ߵǸ� �Ǵϱ�...)						
	 * �̰� ���� �ſ��߿��� �۾��̿���
	 * �������� �ʾƵ� �۵��� �մϴ�.
	 * ������ ��ӵǴ� ������Ʈ�� �ϴٺ��� ������ Ŭ�������� �����Ǵµ��� ������ �����ϴµ�
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
	
	//�������̵� �����㼼��!!!
	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
