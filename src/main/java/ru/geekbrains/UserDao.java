package ru.geekbrains;

import org.hibernate.Session;

import java.util.List;

public class UserDao {

    private final SessionFactoryUtils sessionFactoryUtils;


    public UserDao(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    public User findById(Long id) {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            User user = session.get(User.class, id);
            session.getTransaction().commit();
            return user;
        }
    }

    public List<User> findAll() {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            List user = session.createQuery("select u from User u").getResultList();
            session.getTransaction().commit();
            return user;
        }
    }

    public void save(User user) {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            session.saveOrUpdate(user);
            session.getTransaction().commit();
        }
    }

    public void update(Long id, String newName) {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            User user = session.get(User.class, id);
            user.setName(newName);
            session.getTransaction().commit();
        }
    }

    public void delete(Long id) {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
            User user = session.get(User.class, id);
            session.delete(user);
            session.getTransaction().commit();
        }
    }
}
