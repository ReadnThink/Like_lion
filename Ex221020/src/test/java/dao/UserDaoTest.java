package dao;

import domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
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
    void setUp(){
        this.userDao = context.getBean("LocalConnectionMaker", UserDao.class);
        this.user1 = new User("121", "박성철", "61321");
        this.user2 = new User("122", "이길원", "82465");
        this.user3 = new User("123", "박범진", "55064");
    }
    @Test
    void addAndFindById() throws SQLException {
//        UserDao userDao = new DaoFactory().LocalConnectionMaker();

        userDao.deleteAll();
        assertEquals(0,userDao.count());


        userDao.add(user1);
        assertEquals(1, userDao.count());

        User user = userDao.FindById(user1.getId());
        assertEquals(user1.getName(), user.getName());
        assertEquals(user1.getPassword(),user.getPassword());
    }

}