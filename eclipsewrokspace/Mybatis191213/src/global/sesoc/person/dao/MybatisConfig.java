package global.sesoc.person.dao;


import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Mybatis의 환경 설정 읽고 객체 생성
 */
public class MybatisConfig {
	//어떤 행보를 하든 DB에 접근해야 하고 이를 위해 SqlSessionFactory형 변수가 필요합니다.
	private static SqlSessionFactory sqlSessionFactory;

	//클래스 로딩될 때 프로그램 시작하는 최초에 무조건 실행됩니다.
	//필요한, 어떤기능에서든 쓸수 있도록 시작하자마자 
	static {
		String resource = "mybatis-config.xml";		//Mybatis 환경설정 파일 읽기. src 경로에 저장.
		//SRC 폴더내에 "mybatis-config.xml"파일이 있어야 합니다. 
		//만약 global.sesoc.person.xml패키지에 있다면 
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory; //sqlSessionFactory를 사용하라고 리턴해준다고 합니다. 여기까지가 마이바티스를 사용할 준비입니다.
	}
}
