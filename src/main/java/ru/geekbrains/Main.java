package ru.geekbrains;

public class Main {
    public static void main(String[] args) {

        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();

        try {
            ProductDao productDao = new ProductDao(sessionFactoryUtils);
            System.out.println(productDao.findById(1L));
            System.out.println("<------------->");

            productDao.update(1L, 3);
            System.out.println(productDao.findAll());
            System.out.println("<------------->");

            productDao.delete(3L);
            System.out.println(productDao.findAll());
            System.out.println("<------------->");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutDown();
        }
    }
}