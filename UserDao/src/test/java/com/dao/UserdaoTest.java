package com.dao;

import com.domain.User;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserdaoTest {
    @Test
    void addAndGet() throws SQLException, ClassNotFoundException {
        DaoFactory daoFactory = new DaoFactory();
        UserDao userdao = new DaoFactory().userDao();
        User user = new User();

        String id = "4";

        user.setId(id);
        user.setName("sols");
        user.setPassword("1123");

        userdao.add(user);

        User result = userdao.select(id);
        System.out.println(result.getId());
        System.out.println(result.getName());
        assertEquals(id, result.getId());


    }
}