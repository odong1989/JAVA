package global.sesoc.person.dao;


import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Mybatis�� ȯ�� ���� �а� ��ü ����
 */
public class MybatisConfig {
	//� �ຸ�� �ϵ� DB�� �����ؾ� �ϰ� �̸� ���� SqlSessionFactory�� ������ �ʿ��մϴ�.
	private static SqlSessionFactory sqlSessionFactory;

	//Ŭ���� �ε��� �� ���α׷� �����ϴ� ���ʿ� ������ ����˴ϴ�.
	//�ʿ���, ���ɿ����� ���� �ֵ��� �������ڸ��� 
	static {
		String resource = "mybatis-config.xml";		//Mybatis ȯ�漳�� ���� �б�. src ��ο� ����.
		//SRC �������� "mybatis-config.xml"������ �־�� �մϴ�. 
		//���� global.sesoc.person.xml��Ű���� �ִٸ� 
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory; //sqlSessionFactory�� ����϶�� �������شٰ� �մϴ�. ��������� ���̹�Ƽ���� ����� �غ��Դϴ�.
	}
}
