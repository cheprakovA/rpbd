package ru.edu.vsu.projects.dbapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.edu.vsu.projects.dbapp.model.Make;

import java.util.List;

@Repository
public class MakeDAOImpl implements MakeDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Make> allMakes() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Make").list();
    }

    @Override
    public void add(Make make) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(make);
    }

    @Override
    public void delete(Make make) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(make);
    }

    @Override
    public void edit(Make make) {
        Session session = sessionFactory.getCurrentSession();
        session.update(make);
    }

    @Override
    public Make get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Make.class, id);
    }
}
