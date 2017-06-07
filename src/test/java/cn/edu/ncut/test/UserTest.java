package cn.edu.ncut.test;

import cn.edu.ncut.dao.RoleDao;
import cn.edu.ncut.dao.UserDao;
import cn.edu.ncut.model.RoleObj;
import cn.edu.ncut.model.User;
import cn.edu.ncut.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lh on 2017/4/14.
 */

@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {

    @Resource
    private UserDao userDao;

    @Resource
    private UserService userService;

    @Resource
    private RoleDao roleDao;

    @Test
    public void testGetTestBook() {
        List<User> userList = userService.getUserList();
        //Assert.assertEquals(3, userList.size());
    }

    @Test
    public void test() {
        List<User> userList = userDao.getUserList();
        //Assert.assertEquals(3, userList.size());
    }

    @Test
    public void getRole() {
        RoleObj roleObj = roleDao.selectByPrimaryKey(new Integer(1));
        System.out.println(roleObj.getRolename());
    }



}
