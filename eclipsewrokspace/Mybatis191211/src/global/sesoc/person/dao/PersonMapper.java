package global.sesoc.person.dao;

import java.util.ArrayList;

import global.sesoc.person.vo.Person;

/**
 * Mapper XML�� SQL�� ��� �޼��� ����
 */
public interface PersonMapper {
	//Person��ü ����
	public int insertPerson(Person p);//0���Ͻ� ����X, 1���Ͻ� ����?[�´��� Ȯ���Ұ�]
	//insertPerson�� ��Ī�Ǵ� SQL���� ��� �ִ°�
	//�� : personMapper.xml
	//��ȣ�� �� ����
	public int deletePerson(int n);
}







