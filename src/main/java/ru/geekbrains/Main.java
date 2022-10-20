package ru.geekbrains;

public class Main {
    public static void main(String[] args) {

        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();

        try {
            UserDao userDao = new UserDao(sessionFactoryUtils);
            System.out.println(userDao.findById(1L));
            System.out.println("<------------->");

            userDao.update(1L, 3);
            System.out.println(userDao.findAll());
            System.out.println("<------------->");

            userDao.delete(3L);
            System.out.println(userDao.findAll());
            System.out.println("<------------->");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutDown();
        }
    }
}