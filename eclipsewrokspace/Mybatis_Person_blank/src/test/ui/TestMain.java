package test.ui;

import java.util.ArrayList;

import test.dao.PersonDAO;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		
		PersonDAO dao = new PersonDAO();
		
		int num = 21;
		dao.deletePerson(num);
		
		
		//�Է�
//		Person pe;
//		pe = new Person("��ö��", 30);
//		dao.insertPerson(pe);
		

		
	}
}
