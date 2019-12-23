package ru.edu.vsu.projects.dbapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.edu.vsu.projects.dbapp.dao.MakeDAO;
import ru.edu.vsu.projects.dbapp.model.Make;

import java.util.List;

@Service
public class MakeServiceImpl implements MakeService {
    private MakeDAO makeDAO;

    @Autowired
    @Transactional
    public void setMakeDAO(MakeDAO makeDAO) {
        this.makeDAO = makeDAO;
    }

    @Override
    @Transactional
    public List<Make> allMakes() {
        return makeDAO.allMakes();
    }

    @Override
    @Transactional
    public void add(Make make) {
        makeDAO.add(make);
    }

    @Override
    @Transactional
    public void delete(Make make) {
        makeDAO.delete(make);
    }

    @Override
    @Transactional
    public void edit(Make make) {
        makeDAO.edit(make);
    }

    @Override
    @Transactional
    public Make get(Long id) {
        return makeDAO.get(id);
    }
}
