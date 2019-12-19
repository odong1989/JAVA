package global.sesoc.book.dao;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisConfig {
	//step1.
	private static SqlSessionFactory sqlsessionFactory;
	
	//step2.
	static {
		String resource="MybatisConfig.xml";
		try {
				Reader reader =Resources.getResourceAsReader(resource);
				sqlsessionFactory = new SqlSessionFactoryBuilder().build(reader);
				
				reader.close();
			}
		catch(Exception e) {
			e.printStackTrace();
			}
		}//static end
	
	//step3.
	public static SqlSessionFactory getsqlsessionFactory(){
		return sqlsessionFactory;
	}
	
}
