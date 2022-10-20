package ru.geekbrains;

public class Main {
    public static void main(String[] args) {

        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();

        try {
            UserDao userDao = new UserDao(sessionFactoryUtils);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutDown();
        }
    }
}