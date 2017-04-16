package cn.edu.ncut.service;

import cn.edu.ncut.dao.UserDao;
import cn.edu.ncut.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lenovo on 2017/4/14.
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
