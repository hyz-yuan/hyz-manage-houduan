package cn.edu.upc.hyz.service;

import cn.edu.upc.hyz.model.User;

import java.util.List;

public interface UserService {
    /**
     * 从user表里查询manager
     */
    List<User> selectManager();
    /*通过id查找user*/
    User selectUser(User user);
    /*通过id更新user*/
    int updateUser(User user);
    /*通过flag删除*/
    int deletUser(User user);
    /*添加user*/
    int insertUser(User user);
    /*查询所有user*/
    List<User> selectUsers();
}
