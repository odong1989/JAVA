package workbook.address3.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import workbook.address3.vo.AddressVO;

/**
 * ȸ�������� ����, ����, �˻����ִ� ��� ��� Ŭ����
 */
public class AddressManagerImpl implements AddressManager {
	ArrayList<AddressVO> list;		//ȸ�� ������ ������ ����Ʈ
	ObjectInputStream inFile;		//���Ϸκ��� ��ü�� ���� ��Ʈ��
	ObjectOutputStream outFile;		//���Ͽ� ��ü�� ������ ��Ʈ��
	/* ArrayList<AddressVO> list;		//ȸ�� ������ ������ ����Ʈ
	   ObjectInputStream inFile;		//���Ϸκ��� ��ü�� ���� ��Ʈ��
	   ObjectOutputStream outFile;		//���Ͽ� ��ü�� ������ ��Ʈ��
	     ���� �������� ��� �ʱⰪ�� NULL�Դϴ�.
	 * */
	final String filename = "address.dat";	//���ϸ�, ������ ���ϸ� �����ϰ� �ϸ鼭 �ǰ��ϴ� �⺻���� �ƿ� �س�����.
	//final�� �����տ� ���� ���->������ ������ �����Ѵ�!
	//final�� Ŭ���� �տ� ���� ��� -> ��ӹޱ⸦ �����Ѵ�!
	//final�� �޼ҵ� �տ� ���� ��� -> ����. Ŭ�������� �����µ� ������ �޼ҵ带 ��ӹ޾Ƽ� ����? 
	public AddressManagerImpl() {
		//���� ����� �� ������ �о���̰�, ������ ����Ʈ ����
		try {
			inFile = new ObjectInputStream(new FileInputStream(filename));//������ ���� ��� catch�� ���ϴ�.
			list = (ArrayList<AddressVO>) inFile.readObject(); //������ �ִµ� ������ ���� ��쵵 catch�� ���ϴ�.
			inFile.close();//����� �о��ٸ� ���ϴݱ���� ����.
		}
		catch (Exception e) {
			list = new ArrayList<AddressVO>();//����ִ� ArrayList�� �����ض�.
		}
	}
	
	@Override
	public boolean addAddress(AddressVO vo) {
		//���� ��ȣ�� ȸ���� �ִ��� Ȯ��
		if (getAddress(vo.getNum()) != null) {//null�� �ƴϴ�! = ����� �ƴϾ�!=������ ���� �־�!
			return false;//���� ��ȣ�� �ο��� ���� ���ݾ�? �׷��� �ȵǿ��� ����Ѱ�.
		}
		//������ ����
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
		//�˻������ ������ ����Ʈ ����
		ArrayList<AddressVO> searchList = new ArrayList<>();
		AddressVO vo = null;
		
		for (int i = 0; i < list.size(); i++) {
			vo = list.get(i);
			//�̸��� ���� ȸ���� ������ �� ����Ʈ�� �߰�
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
			//���޹��� ��ȣ�� ȸ�������� ������ ����
			if (num == vo.getNum()) {
				list.remove(i);
				return true;
			}
		}
		//������ false����
		return false;
	}

	@Override
	public void saveFile() {
		try {
			//���� ArrayList�� ���Ͽ� ����
			outFile = new ObjectOutputStream(new FileOutputStream(filename));
			outFile.writeObject(list);//ArrayList�� ����ȭ �Ǿ��ְ� ���� �Է��� ������ vo��ü���� ����ȭ �Ǿ��ִٸ� 1���������� ������ ����˴ϴ�.
			//public class AddressVO implements Serializable
			//implements Serializable��¹����� ������ ��ü����ȭ�� �ȵǰ�,
			//�׷��� ������ �ȵǰ�, �׷��� �������� �� ����
			outFile.close();
			System.out.println("������ ����Ǿ����ϴ�.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
