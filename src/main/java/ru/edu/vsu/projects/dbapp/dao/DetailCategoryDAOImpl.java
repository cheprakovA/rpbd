package ru.edu.vsu.projects.dbapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.edu.vsu.projects.dbapp.model.DetailCategory;

import java.util.List;

@Repository
public class DetailCategoryDAOImpl implements DetailCategoryDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<DetailCategory> allDetailCategory() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM DetailCategory").list();
    }

    @Override
    public void add(DetailCategory detailCategory) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(detailCategory);
    }

    @Override
    public void delete(DetailCategory detailCategory) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(detailCategory);
    }

    @Override
    public void edit(DetailCategory detailCategory) {
        Session session = sessionFactory.getCurrentSession();
        session.update(detailCategory);
    }

    @Override
    public DetailCategory get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(DetailCategory.class, id);
    }
}
