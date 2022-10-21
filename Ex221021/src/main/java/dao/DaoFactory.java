package dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
    @Bean
    public UserDao LocalFactory(){
        LocalConnection localConnection = new LocalConnection();
        UserDao userDao = new UserDao(localConnection);

        return userDao;
    }

    @Bean
    public UserDao AwsFactory(){
        AwsConnection awsConnection = new AwsConnection();
        UserDao userDao = new UserDao(awsConnection);

        return userDao;
    }

}
