package com.dao;

import com.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = DaoFactory.class) //해당 클래스만 특정해서 불러온다.
class UserdaoTest {
    @Autowired
    ApplicationContext context;

    @Test
    void addAndGet() throws SQLException, ClassNotFoundException {
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        UserDao userDao2 = context.getBean("awsUserDao", UserDao.class);

        System.out.println(userDao);
        System.out.println(userDao2);

        User user = new User();

        String id = "4";

//        user.setId(id);
//        user.setName("sols");
//        user.setPassword("1123");
//
//        userDao.add(user);
//
//        User result = userDao.select(id);
//        System.out.println(result.getId());
//        System.out.println(result.getName());
//        assertEquals(id, result.getId());


    }
}