package ru.edu.vsu.projects.dbapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.edu.vsu.projects.dbapp.dao.AutoDAO;
import ru.edu.vsu.projects.dbapp.model.Auto;

import java.util.List;

@Service
public class AutoServiceImpl implements AutoService {
    private AutoDAO autoDAO;

    @Autowired
    public void setAutoDAO(AutoDAO autoDAO) {
        this.autoDAO = autoDAO;
    }

    @Override
    @Transactional
    public List<Auto> allAutos() {
        return autoDAO.allAutos();
    }

    @Override
    @Transactional
    public void add(Auto auto) {
        autoDAO.add(auto);
    }

    @Override
    @Transactional
    public void delete(Auto auto) {
        autoDAO.delete(auto);
    }

    @Override
    @Transactional
    public void edit(Auto auto) {
        autoDAO.edit(auto);
    }

    @Override
    @Transactional
    public Auto get(Long id) {
        return autoDAO.get(id);
    }
}
