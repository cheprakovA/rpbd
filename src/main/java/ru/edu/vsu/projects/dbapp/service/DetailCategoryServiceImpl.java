package ru.edu.vsu.projects.dbapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.edu.vsu.projects.dbapp.dao.DetailCategoryDAO;
import ru.edu.vsu.projects.dbapp.model.DetailCategory;

import java.util.List;

@Service
public class DetailCategoryServiceImpl implements DetailCategoryService {
    private DetailCategoryDAO detailCategoryDAO;

    @Autowired
    public void setDetailCategoryDAO(DetailCategoryDAO detailCategoryDAO) {
        this.detailCategoryDAO = detailCategoryDAO;
    }

    @Override
    @Transactional
    public List<DetailCategory> allDetailCategory() {
        return detailCategoryDAO.allDetailCategory();
    }

    @Override
    @Transactional
    public void add(DetailCategory detailCategory) {
        detailCategoryDAO.add(detailCategory);
    }

    @Override
    @Transactional
    public void delete(DetailCategory detailCategory) {
        detailCategoryDAO.delete(detailCategory);
    }

    @Override
    @Transactional
    public void edit(DetailCategory detailCategory) {
        detailCategoryDAO.edit(detailCategory);
    }

    @Override
    @Transactional
    public DetailCategory get(Long id) {
        return detailCategoryDAO.get(id);
    }
}
