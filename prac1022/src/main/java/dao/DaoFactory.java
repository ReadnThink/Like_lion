package dao;

public class DaoFactory {
    public UserDao LocalConnectionFactory(){
        LocalConncetion localConncetion = new LocalConncetion();
        UserDao userDao = new UserDao(localConncetion);

        return userDao;
    }
    public UserDao AwsConnectionFactory(){
        AwsConncetion awsConncetion = new AwsConncetion();
        UserDao userDao = new UserDao(awsConncetion);

        return userDao;
    }
}

