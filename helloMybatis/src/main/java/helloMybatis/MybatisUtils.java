package helloMybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
//sqlSessionFactory-->SqlSession
//��Դ���ؽ�����������ִ��sql�Ķ���
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static{
        InputStream inputStream = null;
        try {
//            ʹ��Mybatis����ȡsqlSessionFactory����
            String resource = "mybatis-config.xml";
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    ����sqlSessionFactory�����Ի��sqlSessionʵ��
//    sqlSession��ȫ�����������ݿ�ִ��sql������������з���
    public  static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}