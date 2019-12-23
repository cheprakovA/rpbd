package ru.edu.vsu.projects.dbapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.edu.vsu.projects.dbapp.model.Client;

import java.util.List;

@Repository
public class ClientDAOImpl implements ClientDAO{
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List allClients() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Client").list();
    }

    @Override
    public void add(Client client) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(client);
    }

    @Override
    public void delete(Client client) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(client);
    }

    @Override
    public void edit(Client client) {
        Session session = sessionFactory.getCurrentSession();
        session.update(client);
    }

    @Override
    public Client get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Client.class, id);
    }
}
