package com.example.dao;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(@Param("id") int id);
    //插入用户
    int addUser(User user);
    //更新用户
    int updateUser(User user);
    //删除用户
    int deleteUser(@Param("id") int id);
    //新增用户2
    int addUser2(Map map);
}
