package ru.edu.vsu.projects.dbapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.edu.vsu.projects.dbapp.model.Purchase;

import java.util.List;

@Repository
public class PurchaseDAOImpl implements PurchaseDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Purchase> allPurchases() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Purchase").list();
    }

    @Override
    public void add(Purchase purchase) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(purchase);
    }

    @Override
    public void delete(Purchase purchase) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(purchase);
    }

    @Override
    public void edit(Purchase purchase) {
        Session session = sessionFactory.getCurrentSession();
        session.update(purchase);
    }

    @Override
    public Purchase get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Purchase.class, id);
    }
}
