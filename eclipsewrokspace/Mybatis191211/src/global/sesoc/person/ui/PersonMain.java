package global.sesoc.person.ui;

import global.sesoc.person.dao.PersonDAO;
import global.sesoc.person.vo.Person;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class PersonMain {

	public static void main(String[] args) {
		//UI는 생략하므로 dao를 바로 직접부르게 됩니다.
		//단계1. DB관련 처리를 담당하는 클래스의 객체를 생성
		PersonDAO dao = new PersonDAO();
		//마이바틱스 객체(sqlSessionFactory도 쓸수 있어야 합니다.
		//데이터 검색,삭제 등도 할 수 있어야 하죠.(물론, DB관련만 한해서 애기입니다)
		//------------------------------------------------------------------------
		
		//단계2. DAO객체의 메소드를 이용하여 데이터 처리
		//입력 / 개인적으로 작동여부 몰라서 테스팅용
		Person pe;
		pe = new Person("고길동", 80);
		dao.insertPerson(pe);		
	}

}
