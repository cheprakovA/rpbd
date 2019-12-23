package ru.edu.vsu.projects.dbapp.dao;

import ru.edu.vsu.projects.dbapp.model.Detail;

import java.util.List;

public interface DetailDAO {
    List<Detail> allDetails();
    void add(Detail detail);
    void delete(Detail detail);
    void edit(Detail detail);
    Detail get(Long id);
}
