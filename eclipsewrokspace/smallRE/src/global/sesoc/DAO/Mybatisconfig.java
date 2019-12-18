package global.sesoc.DAO;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Mybatisconfig{
	//step1. SqlSessionFactory변수 선언
	private static SqlSessionFactory sqlsessionFactory;

	//step2. SqlSessionFactory빌드(sqlsessionFactory변수에게 마이바티스 설정값 저장)
		static {
		String resource="MybatisConfig.xml"; //	resource에게 삽입.
		try {
			Reader reader = Resources.getResourceAsReader(resource);//MybatisConfig.xml파일에 종합된 마이바티스 설정자료들을 모두 읽는다.
			sqlsessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//step1에서 선언된 변수 sqlsessionFactory에게 마이바티스 설정정보를 삽입한다.
			reader.close();//reader는 역할을 완료로 끝낸다.
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//step3.sqlsessionFactory 요청하는 DAO에게 생성완료된 sqlsessionFactory를 리턴하여 준다.(DAO는 마이바티스 통한 DB접근가능)
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlsessionFactory;
	}
}
