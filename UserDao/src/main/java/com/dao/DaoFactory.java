package com.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
    @Bean
    private UserDao connectionMaker(){
        LocalConnectionMaker localConnectionMaker = new LocalConnectionMaker();
        // context : 재사용 하는 부분이 많은 코드
        UserDao userDao = new UserDao(localConnectionMaker);
        return userDao;

    }
    @Bean
    public UserDao userDao(){
        AWSConnectionMaker awsConnectionMaker = new AWSConnectionMaker();
        UserDao userDao = new UserDao(awsConnectionMaker);

        return userDao;
    }
}
