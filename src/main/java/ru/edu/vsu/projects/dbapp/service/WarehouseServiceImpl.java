package ru.edu.vsu.projects.dbapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.edu.vsu.projects.dbapp.dao.WarehouseDAO;
import ru.edu.vsu.projects.dbapp.model.Warehouse;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {
    private WarehouseDAO warehouseDAO;

    @Autowired
    public void setWarehouseDAO(WarehouseDAO warehouseDAO) {
        this.warehouseDAO = warehouseDAO;
    }

    @Override
    @Transactional
    public List<Warehouse> allWarehouses() {
        return warehouseDAO.allWarehouses();
    }

    @Override
    @Transactional
    public void add(Warehouse warehouse) {
        warehouseDAO.add(warehouse);
    }

    @Override
    @Transactional
    public void delete(Warehouse warehouse) {
        warehouseDAO.delete(warehouse);
    }

    @Override
    @Transactional
    public void edit(Warehouse warehouse) {
        warehouseDAO.edit(warehouse);
    }

    @Override
    @Transactional
    public Warehouse get(Long id) {
        return warehouseDAO.get(id);
    }
}
