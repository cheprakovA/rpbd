package ru.edu.vsu.projects.dbapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.edu.vsu.projects.dbapp.model.Worker;

import java.util.List;

@Repository
public class WorkerDAOImpl implements WorkerDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Worker> allWorkers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Worker").list();
    }

    @Override
    public void add(Worker worker) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(worker);
    }

    @Override
    public void delete(Worker worker) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(worker);
    }

    @Override
    public void edit(Worker worker) {
        Session session = sessionFactory.getCurrentSession();
        session.update(worker);
    }

    @Override
    public Worker get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Worker.class, id);
    }
}
