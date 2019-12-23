package ru.edu.vsu.projects.dbapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.edu.vsu.projects.dbapp.model.Auto;

import java.util.List;

@Repository
public class AutoDAOImpl implements AutoDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Auto> allAutos() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Auto").list();
    }

    @Override
    public void add(Auto auto) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(auto);
    }

    @Override
    public void delete(Auto auto) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(auto);
    }

    @Override
    public void edit(Auto auto) {
        Session session = sessionFactory.getCurrentSession();
        session.update(auto);
    }

    @Override
    public Auto get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Auto.class, id);
    }
}
