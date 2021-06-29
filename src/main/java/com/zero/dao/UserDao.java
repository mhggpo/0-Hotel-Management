package com.zero.dao;

import com.zero.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    /**
     * 增加用户信息
     * @param user 用户对象
     * @return 返回0表示失败 返回正整数表示数据库中受影响的条数
     */
    int insertUser(User user);

    /**
     * 删除用户信息
     * @param userId 用户id
     * @return 返回0表示失败 返回正整数表示数据库中受影响的条数
     */
    int deleteUser(@Param("userId")Integer userId);

    /**
     * 修改用户信息
     * @param userId 用户id
     * @return 返回0表示失败 返回正整数表示数据库中受影响的条数
     */
    int updateUser(@Param("userId")Integer userId);

    /**
     * 根据用户编号查询用户信息
     * @param userId 用户id
     * @return 返回查询到的用户列表
     */
    List<User> selectUserById(@Param("userId")Integer userId);

    /**
     * 根据用户名查询用户信息
     * @param userName 用户id
     * @return 返回查询到的用户列表
     */
    List<User> selectUserByName(@Param("userName")String userName);
}
