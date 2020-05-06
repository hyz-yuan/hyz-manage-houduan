package cn.edu.upc.hyz.service.impl;

import cn.edu.upc.hyz.service.UserService;
import cn.edu.upc.hyz.dao.UserMapper;
import cn.edu.upc.hyz.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userDao;

    @Override
    public User selectUser(User user) {
        return userDao.selectByPrimaryKey(user);
    }

    @Override
    public int updateUser(User user){
        return userDao.updateByPrimaryKey(user);
    }

    @Override
     public int deletUser(User user){
        return userDao.deletUserFlag(user);
    }

    @Override
    public List<User> selectManager() {
        return userDao.selectManagerByRole();
    }

    @Override
    public int insertUser(User user){
        return userDao.insert(user);
    }
    @Override
    public List<User> selectUsers(){
        return userDao.getUserList();
    }
}
