package com.dao;

public class DaoFactory {
    private ConnectionMaker connectionMaker(){
        LocalConnectionMaker localConnectionMaker = new LocalConnectionMaker();
        return localConnectionMaker;

    }

    public UserDao userDao(){

        LocalConnectionMaker localConnectionMaker = new LocalConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker());

        return userDao;
    }
}
