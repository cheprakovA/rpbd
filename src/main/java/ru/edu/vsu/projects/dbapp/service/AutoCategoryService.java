package ru.edu.vsu.projects.dbapp.service;

import ru.edu.vsu.projects.dbapp.model.AutoCategory;

import java.util.List;

public interface AutoCategoryService {
    List<AutoCategory> allAutoCategories();
    void add(AutoCategory autoCategory);
    void delete(AutoCategory autoCategory);
    void edit(AutoCategory autoCategory);
    AutoCategory get(Long id);
}
