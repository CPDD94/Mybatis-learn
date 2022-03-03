import com.example.dao.UserMapper;
import com.example.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;

public class MyTest {
    @Test
    public void test() {
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        // 查询用户list
        /*List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }*/
        // 根据id查询用户
        /*User user = mapper.getUserById(1);
        System.out.println(user);*/
        // 新增user
        /*User user = new User();
        user.setId(4);
        user.setName("法外狂徒");
        user.setPwd("123456");
        mapper.addUser(user);
        session.commit();*/
        //修改用户
        /*User user = new User(3, "李逵", "888888");
        mapper.updateUser(user);*/
        // 新增用户2
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id",8);
        map.put("name","cccp");
        map.put("pwd","666666");
        mapper.addUser2(map);

        session.close();
    }
}
