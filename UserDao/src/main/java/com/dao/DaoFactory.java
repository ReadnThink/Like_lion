package com.dao;

public class DaoFactory {
    private UserDao connectionMaker(){
        LocalConnectionMaker localConnectionMaker = new LocalConnectionMaker();
        UserDao userDao = new UserDao(localConnectionMaker);
        return userDao;

    }

    public UserDao userDao(){
        AWSConnectionMaker awsConnectionMaker = new AWSConnectionMaker();
        UserDao userDao = new UserDao(awsConnectionMaker);

        return userDao;
    }
}
