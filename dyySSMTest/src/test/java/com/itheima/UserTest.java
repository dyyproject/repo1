package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
    @Resource
    private  SqlSessionFactoryBean sqlSessionFactoryBean;

@Test
    public void test1() throws Exception {
        /*SqlSessionFactory Factory = sqlSessionFactoryBean.getObject();
        UserDao mapper = Factory.openSession().getMapper(UserDao.class);
        User user = mapper.findUserById(2);*/
    ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserDao userDao = app.getBean(UserDao.class);
    User user = userDao.findUserById(2);
    System.out.println(user);
    }

    @Test
    public void test2() throws Exception {
        /*SqlSessionFactory Factory = sqlSessionFactoryBean.getObject();
        UserDao mapper = Factory.openSession().getMapper(UserDao.class);
        User user = mapper.findUserById(2);*/
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = app.getBean(UserDao.class);
        List<User> allUsers = userDao.findAllUsers();
        System.out.println(allUsers);
    }
    @Test
    public void test3() throws Exception {
        User user = new User();
        user.setId(66);
        user.setUsername("陈浩");
        user.setPassword("shenren");
        /*SqlSessionFactory Factory = sqlSessionFactoryBean.getObject();
        UserDao mapper = Factory.openSession().getMapper(UserDao.class);
        User user = mapper.findUserById(2);*/
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = app.getBean(UserDao.class);
        userDao.addUser(user);
    }
}
