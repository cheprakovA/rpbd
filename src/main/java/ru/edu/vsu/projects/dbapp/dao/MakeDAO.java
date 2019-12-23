package ru.edu.vsu.projects.dbapp.dao;

import ru.edu.vsu.projects.dbapp.model.Make;

import java.util.List;

public interface MakeDAO {
    List<Make> allMakes();
    void add(Make make);
    void delete(Make make);
    void edit(Make make);
    Make get(Long id);
}
