package global.sesoc.DAO;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Mybatisconfig{
	//step1. SqlSessionFactory���� ����
	private static SqlSessionFactory sqlsessionFactory;

	//step2. SqlSessionFactory����(sqlsessionFactory�������� ���̹�Ƽ�� ������ ����)
		static {
		String resource="MybatisConfig.xml"; //	resource���� ����.
		try {
			Reader reader = Resources.getResourceAsReader(resource);//MybatisConfig.xml���Ͽ� ���յ� ���̹�Ƽ�� �����ڷ���� ��� �д´�.
			sqlsessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//step1���� ����� ���� sqlsessionFactory���� ���̹�Ƽ�� ���������� �����Ѵ�.
			reader.close();//reader�� ������ �Ϸ�� ������.
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//step3.sqlsessionFactory ��û�ϴ� DAO���� �����Ϸ�� sqlsessionFactory�� �����Ͽ� �ش�.(DAO�� ���̹�Ƽ�� ���� DB���ٰ���)
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlsessionFactory;
	}
}
