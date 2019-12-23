package ru.edu.vsu.projects.dbapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.edu.vsu.projects.dbapp.model.AutoCategory;

import java.util.List;

@Repository
public class AutoCategoryDAOImpl implements AutoCategoryDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<AutoCategory> allAutoCategories() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM AutoCategory").list();
    }

    @Override
    public void add(AutoCategory autoCategory) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(autoCategory);
    }

    @Override
    public void delete(AutoCategory autoCategory) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(autoCategory);
    }

    @Override
    public void edit(AutoCategory autoCategory) {
        Session session = sessionFactory.getCurrentSession();
        session.update(autoCategory);
    }

    @Override
    public AutoCategory get(Long id) {
        Session session = sessionFactory.getCurrentSession();
            return session.get(AutoCategory.class, id);
    }
}
