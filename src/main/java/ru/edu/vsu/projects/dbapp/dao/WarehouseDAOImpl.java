package ru.edu.vsu.projects.dbapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.edu.vsu.projects.dbapp.model.Warehouse;

import java.util.List;

@Repository
public class WarehouseDAOImpl implements WarehouseDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Warehouse> allWarehouses() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Warehouse").list();
    }

    @Override
    public void add(Warehouse warehouse) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(warehouse);
    }

    @Override
    public void delete(Warehouse warehouse) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(warehouse);
    }

    @Override
    public void edit(Warehouse warehouse) {
        Session session = sessionFactory.getCurrentSession();
        session.update(warehouse);
    }

    @Override
    public Warehouse get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Warehouse.class, id);
    }
}
