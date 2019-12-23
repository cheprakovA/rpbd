package ru.edu.vsu.projects.dbapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.edu.vsu.projects.dbapp.model.Detail;

import java.util.List;

@Repository
public class DetailDAOImpl implements DetailDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Detail> allDetails() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Detail").list();
    }

    @Override
    public void add(Detail detail) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(detail);
    }

    @Override
    public void delete(Detail detail) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(detail);
    }

    @Override
    public void edit(Detail detail) {
        Session session = sessionFactory.getCurrentSession();
        session.update(detail);
    }

    @Override
    public Detail get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Detail.class, id);
    }
}
