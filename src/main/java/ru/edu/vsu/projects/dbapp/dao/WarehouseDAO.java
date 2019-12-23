package ru.edu.vsu.projects.dbapp.dao;

import ru.edu.vsu.projects.dbapp.model.Warehouse;

import java.util.List;

public interface WarehouseDAO {
    List<Warehouse> allWarehouses();
    void add(Warehouse warehouse);
    void delete(Warehouse warehouse);
    void edit(Warehouse warehouse);
    Warehouse get(Long id);
}
