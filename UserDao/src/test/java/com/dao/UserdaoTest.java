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
@ContextConfiguration(classes = DaoFactory.class)
class UserdaoTest {
    @Autowired
    ApplicationContext context;

    @Test
    void addAndGet() throws SQLException, ClassNotFoundException {
        UserDao userDao = context.getBean("localUserDao", UserDao.class);

        String id = "4";
        userDao.add(new User(id,"Nunu","112233"));

        User user = userDao.select(id);
        assertEquals(id, user.getId());
        assertEquals("Nunu", user.getName());


    }
}