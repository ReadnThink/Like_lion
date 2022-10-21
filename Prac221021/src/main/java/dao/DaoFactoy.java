package dao;

import domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactoy {
    @Bean
    public UserDao LocalFactory(){
        LocalConnectionMaker localConnectionMaker = new LocalConnectionMaker();
        UserDao userDao = new UserDao(localConnectionMaker);

        return userDao;
    }
    @Bean
    public UserDao AwsFactory(){
        AwsConnectionMaker awsConnectionMaker = new AwsConnectionMaker();
        UserDao userDao = new UserDao(awsConnectionMaker);

        return userDao;
    }
}
