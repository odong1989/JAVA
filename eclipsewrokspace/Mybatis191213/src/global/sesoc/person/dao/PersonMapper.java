package global.sesoc.person.dao;

import java.util.ArrayList;
import global.sesoc.person.vo.Person;

/**
 * Mapper XML의 SQL문 사용 메서드 정의
 */
public interface PersonMapper {
	//Person객체 저장
	public int insertPerson(Person p);//0리턴시 저장X, 1리턴시 저장?[맞는지 확인할것]
	//insertPerson과 매칭되는 SQL문은 어디에 있는가
	//답 : personMapper.xml
	//번호로 행 삭제
	public int deletePerson(int n);
	
	//19-12-11 수정문 추가(나이만 수정)
	public int updatePerson(Person p);
	
	//19-12-12 1교시 회원1명의 정보 출력문
	public Person selectPerson(int n);
    /*personMapper.xml의  <select id="selectPerson" parameterType="int" resultType="person">
      select id="selectPerson"와 
	  
	  public Person selectPerson(int n);selectPerson
	  
	  는 같아야합니다.
     *
     */
	
	//19-12-12 2교시 회원1명의 정보 출력문
	//검색결과가 여러명이 출력될수도 있기에
	//동일한 person형을 입력받을수 있도록 
	public ArrayList<Person> selectPersonByname(String name);
	
	public ArrayList<Person> ShowAllPerson();
	
	
}







