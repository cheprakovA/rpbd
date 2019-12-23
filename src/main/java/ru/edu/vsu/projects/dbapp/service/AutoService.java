package ru.edu.vsu.projects.dbapp.service;

import ru.edu.vsu.projects.dbapp.model.Auto;

import java.util.List;

public interface AutoService {
    List<Auto> allAutos();
    void add(Auto auto);
    void delete(Auto auto);
    void edit(Auto auto);
    Auto get(Long id);
}
