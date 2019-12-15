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
	
	//19-12-11 ������ �߰�(���̸� ����)
	public int updatePerson(Person p);
	
	//19-12-12 ȸ��1���� ���� ��¹�
	public Person selectPerson(int n);
    /*personMapper.xml��  <select id="selectPerson" parameterType="int" resultType="person">
      select id="selectPerson"�� 
	  
	  public Person selectPerson(int n);selectPerson
	  
	  �� ���ƾ��մϴ�.
     *
     */
	//	
}







