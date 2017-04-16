package cn.edu.ncut.dao;

import cn.edu.ncut.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao  {
    public List<User> getUserList();
}
