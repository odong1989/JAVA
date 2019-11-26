package workbook.address3.vo;

import java.io.Serializable;

/**
 * ȸ�� ������ ���� VO Ŭ����
 */
public class AddressVO implements Serializable {
	/**
	 * [ȸ�� ��ȣ] 
	 * ������ ��� ȸ����ȣ���� �������� ������ ȸ����ȣ�� �������� 
	 * �ϰ��� ȸ����ȣ�� �����մϴ�.
	 */
	private int num;
	/**
	 * �̸�
	 */
	private String name;
	/**
	 * ��ȭ��ȣ
	 */
	private String phone;
	/**
	 * �ּ�
	 */
	private String address;
	
	/**
	 * ������(1) 
	 * [�⺻ ������]
	 */
	public AddressVO() {
	}

	/**
	 * ������(2)
	 * [�ʱⰪ�� ���޹޾� �ʱ�ȭ�ϴ� ������]
	 * @param num 		ȸ����ȣ
	 * @param name 		�̸�
	 * @param phone 	��ȭ��ȣ
	 * @param address 	�ּ�
	 */
	public AddressVO(int num, String name, String phone, String address) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	/**
	 * Setter, Getter �޼ҵ��
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

	@Override //�ʼ��� �ƴմϴ�. ������ ���Ǹ� ���� �ϴ°� ����.
	//������̳�, ���� �����ϴ� �׷��ȱ���� ��쿡�� 
	//���� ���Դ��� Ȯ���� ���� ���� ����ϰ� �˴ϴ�. 
	public String toString() {
		return "ȸ����ȣ:" + num + ", �̸�:" + name + ", ��ȭ��ȣ:" + phone + ", �ּ�:" + address;
	}
}