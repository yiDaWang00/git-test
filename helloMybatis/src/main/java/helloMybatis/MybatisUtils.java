package helloMybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
//sqlSessionFactory-->SqlSession
//资源加载进来，创建能执行sql的对象
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static{
        InputStream inputStream = null;
        try {
//            使用Mybatis。获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    有了sqlSessionFactory，可以获得sqlSession实例
//    sqlSession完全包含面向数据库执行sql命令所需的所有方法
    public  static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}