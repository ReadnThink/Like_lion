package dao;

import domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = DaoFactory.class)
class UserDaoTest {
    @Autowired
    ApplicationContext context;
    UserDao userDao;
    User user1;
    User user2;
    User user3;

    @BeforeEach
    @DisplayName("시작 잘 되는지")
    void setUp(){

//        userDao = new UserDao(new LocalConnectionMaker());
//        userDao = new DaoFactory().LocalDaoFactory();
        this.userDao = context.getBean("LocalDaoFactory", UserDao.class);

        user1 = new User("1", "A", "123");
        user2 = new User("2", "B", "456");
        user3 = new User("3", "C", "789");
    }

    @Test
    void addNfindById() throws SQLException {
        userDao.deleteAll();
        assertEquals(0, userDao.getCount());
        //add
        userDao.add(user2);
        //findid
        User result = userDao.findById(user2.getId());
        assertEquals(user2.getId(),result.getId());
    }

//    @Test
//    @DisplayName("User가 null인 경우 Exception")
//    void checkfindByIdError() throws SQLException {
//        assertThrows(EmptyResultDataAccessException.class, ()->{
//            userDao.deleteAll();
//            userDao.findById("0");
//        });
//
//    }
}