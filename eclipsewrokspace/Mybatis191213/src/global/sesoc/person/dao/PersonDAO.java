package global.sesoc.person.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import global.sesoc.person.vo.Person;

/**
 * DB관련 처리 클래스
 */
public class PersonDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // 마이바티스 객체
	//SqlSessionFactory를 활용하여 DB의 저장 삭제 등 DB관련 관리들을 합니다.
	//MybatisConfig.getSqlSessionFactory(); 를 통해 생성되었으며 사용이 가능합니다.
	
	//회원정보 저장
	public void insertPerson(Person p) {
		SqlSession ss = null;
		
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class);//PersonMapper.java라는 인터페이스가 필요!
			//인터페이스를 구현, 객체를 생성합니다.
			//추상메서드를 불르고,
			mapper.insertPerson(p);
			//필요사항이 있다면 이외의 것들도 부르고.
			ss.commit();//커밋까지 해야 save명령을 내린것과 같습니다.(ss.close()까지 해야 진짜 끝이지만요)
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {//finally : 예외가 발생하든 않든 무조건 해야하는 사항들을 기재합니다.
			if (ss != null) ss.close();//ss.close()를 하여 데이터 저장이 끝났다고 해야합니다.
			//if (ss != null) ->세션이 있으면 저장하되, 없으면(null이면) 그냥 닫아라.
		}
	}

	//번호를 전달받아 회원정보 삭제
	public void deletePerson(int n) {
		SqlSession ss = null;
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			mapper.deletePerson(n);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}	
	}//삭제 끝
	
	//번호를 전달받아 회원정보 수정
	public int updatePerson(Person p) {//updatePerson명령은 xml에 정의되어 있습니다
		int cnt=0;
		//1.세션으르 엽니다.
		SqlSession ss = null;
		//예외처리try
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class); 
			//getMapper는 SqlSession클래스(마이바티스 소속)으로 보인다.
			cnt = mapper.updatePerson(p);//몇번 코드가 지워졌는지 볼려고 리턴(0이면 "완료"-1이면 "실패"식으로 리턴가능해지죠)
			ss.commit();
		}
		//예외처리catch
		catch(Exception e) {
			e.printStackTrace();
		}
		//수정용 메서드 불러서 정의
		finally {
			if(ss != null) ss.close();
		}
		//업데이트 커밋
		return cnt;
	}//updatePerson END
		
		//19-12-12 1교시-회원 1명의 정보 출력문 추가
		//DAO에서는 구체적으로 할일을 기재합니다.
		//update문과 거의 동일해서 복사해서 약간만 수정.
		public Person selectPerson(int n){
			SqlSession ss = null;
			Person p =null;
			try {
				ss = factory.openSession();
				PersonMapper mapper = ss.getMapper(PersonMapper.class); 
				//getMapper는 SqlSession클래스(마이바티스 소속)으로 보인다.
				p = mapper.selectPerson(n);//해당자 없을시 NULL이 리턴됩니다.
				ss.commit();
			}
			//예외처리catch
			catch(Exception e) {
				e.printStackTrace();
			}
			//수정용 메서드 불러서 정의
			finally {
				if(ss != null) ss.close();
			}
			//업데이트 커밋
			return p;		
			}//selectPerson END
		
		
		//19-12-12 2교시-이름을 통한 검색입니다.
		//[키워드 : 부분검색, n행의 결과를 리턴받음]
		public ArrayList<Person> selectPersonByname(String name){
			ArrayList<Person> resultNames = new ArrayList<>();
			SqlSession ss = null;
			try {
				ss = factory.openSession();
				PersonMapper mapper = ss.getMapper(PersonMapper.class); 
				resultNames = mapper.selectPersonByname(name);
				ss.commit();
			}
			//예외처리catch
			catch(Exception e) {
				e.printStackTrace();
			}
			//수정용 메서드 불러서 정의
			finally {
				if(ss != null) ss.close();
			}
			//업데이트 커밋
			return resultNames;		
			}//selectPerson END

		public ArrayList<Person> ShowAllPerson(){
			ArrayList<Person> resultNames = new ArrayList<>();
			SqlSession ss = null;
			try {
				ss = factory.openSession();
				PersonMapper mapper = ss.getMapper(PersonMapper.class); 
				resultNames = mapper.ShowAllPerson();
				//ss.commit();
			}
			//예외처리catch
			catch(Exception e) {
				e.printStackTrace();
			}
			//수정용 메서드 불러서 정의
			finally {
				if(ss != null) ss.close();
			}
			//업데이트 커밋
			return resultNames;		
			}//ShowAllPerson END			

		
}//public class PersonDAO END
