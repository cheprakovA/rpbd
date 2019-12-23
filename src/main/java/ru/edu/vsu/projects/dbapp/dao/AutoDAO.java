package ru.edu.vsu.projects.dbapp.dao;

import ru.edu.vsu.projects.dbapp.model.Auto;

import java.util.List;

public interface AutoDAO {
    List<Auto> allAutos();
    void add(Auto auto);
    void delete(Auto auto);
    void edit(Auto auto);
    Auto get(Long id);
}
