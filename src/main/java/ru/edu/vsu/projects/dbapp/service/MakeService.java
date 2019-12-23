package ru.edu.vsu.projects.dbapp.service;

import ru.edu.vsu.projects.dbapp.model.Make;

import java.util.List;

public interface MakeService {
    List<Make> allMakes();
    void add(Make make);
    void delete(Make make);
    void edit(Make make);
    Make get(Long id);
}
