package ru.edu.vsu.projects.dbapp.dao;

import ru.edu.vsu.projects.dbapp.model.DetailCategory;

import java.util.List;

public interface DetailCategoryDAO {
    List<DetailCategory> allDetailCategory();
    void add(DetailCategory detailCategory);
    void delete(DetailCategory detailCategory);
    void edit(DetailCategory detailCategory);
    DetailCategory get(Long id);
}
