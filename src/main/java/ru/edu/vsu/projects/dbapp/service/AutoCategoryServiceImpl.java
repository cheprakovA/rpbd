package ru.edu.vsu.projects.dbapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.edu.vsu.projects.dbapp.dao.AutoCategoryDAO;
import ru.edu.vsu.projects.dbapp.model.AutoCategory;

import java.util.List;

@Service
public class AutoCategoryServiceImpl implements AutoCategoryService {
    private AutoCategoryDAO autoCategoryDAO;

    @Autowired
    public void setAutoCategoryDAO(AutoCategoryDAO autoCategoryDAO) {
        this.autoCategoryDAO = autoCategoryDAO;
    }

    @Override
    @Transactional
    public List<AutoCategory> allAutoCategories() {
        return autoCategoryDAO.allAutoCategories();
    }

    @Override
    @Transactional
    public void add(AutoCategory autoCategory) {
        autoCategoryDAO.add(autoCategory);
    }

    @Override
    @Transactional
    public void delete(AutoCategory autoCategory) {
        autoCategoryDAO.delete(autoCategory);
    }

    @Override
    @Transactional
    public void edit(AutoCategory autoCategory) {
        autoCategoryDAO.edit(autoCategory);
    }

    @Override
    @Transactional
    public AutoCategory get(Long id) {
        return autoCategoryDAO.get(id);
    }
}
