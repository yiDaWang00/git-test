package helloMybatis;
import helloMybatis.User;
import helloMybatis.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
public class UserMapperTest {
	/*
	@Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //��������CRUD����һ�δ�����в���
      //��ѯ�����û�
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user.getId()+" "+user.getName()+" "+user.getPwd());
        }
        sqlSession.close();
    }
    
    @Test
    public void updateNameTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "�㻪");
        mapper.updateNameByName(map);
        sqlSession.commit();
        sqlSession.close();
    }*/
    @Test
    public void ResultMapperTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.addUserList();
        for(User user : users){
            System.out.println(user.toString());
        }
    }
}
//������CRUD����
//��ѯ�����û�

