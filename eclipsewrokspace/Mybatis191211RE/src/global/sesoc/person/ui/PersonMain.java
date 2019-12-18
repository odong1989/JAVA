package global.sesoc.person.ui;

import global.sesoc.person.dao.PersonDAO;

import java.util.Scanner;
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
		//Person pe;
		//pe = new Person("유재석", 45);
		//dao.insertPerson(pe);		
		
		/*19-12-12의 수업을 위해 12워11일의 수정문을 주석으로 처리.
		//19.12.11 수정SQL을 추가해봅시다.
		//[방법1] 수정도 위의 입력처럼 수정할 값들을 채워줘서 VO객체를 보내준다.
		//[방법2] 배열을 통하여 저장
		Person pe;	//값 보낼게 여러개라 담아서 보낼려고 pe객체 생성하여 값을 담아 전송.
		pe = new Person();
		pe.setNum(42);  //실수로 SQL기본제공되는 행의 번호 1,2,3으로 오해했습니다;;
		pe.setAge(20); //num의 42번으로 해야 유재석씨의 나이가 20으로 바뀝니다.
		int n = dao.updatePerson(pe);//DAO클래스에서 메소드를 만들어야 합니다.
	
		//int n을 활용하여
		//dao.updatePerson(pe);에서 리턴받은 수정된 행의 값을 활용하여 수정여부출력
		
		if(n != 0){
			System.out.println("수정되었습니다.");
		}
		else{
			System.out.println("해당회원이 없습니다.");			
		}
		*/
		
		//19-12-12 회워1명 정보 출력을 위한 화면을 구성해봅시다.
		//DAO객체의 메소드를 이용하여 데이터를 처리합니다.
		Scanner scan = new Scanner(System.in);
		int searchNum;
		//단계1.검색할 회원의 번호를 입력받는다.
		System.out.println("검색할 회원의 번호를 입력해주세요 : ");
		searchNum = scan.nextInt();
		scan.nextLine();//스택에 남을 엔터값 삭제용

		//검색한다
		
		dao.selectPerson(searchNum);
		
		//검색결과가 없으면 "해당 번호의 회원이 없습니다."라고 출력
		//결과가 있으면 "번호 :1   이름 : 홍길동 나이 : 20 "형식으로 출력하십시오.
		
		
		
	}

}
