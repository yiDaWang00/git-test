package helloMybatis;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //��ѯ�����û�
    List<User> getUserList();
    //����id��ѯ�û�
    User getUserById(int id);
    //����û�
    int addUser(User user);
    //�޸��û�
    int updateUser(User user);
    //ɾ���û�
    int deleteUser(int id);
    //�޸�name
    int updateNameByName(Map map);
    
    public List<User> addUserList();
}