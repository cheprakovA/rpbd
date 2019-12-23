package ru.edu.vsu.projects.dbapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.edu.vsu.projects.dbapp.dao.DetailDAO;
import ru.edu.vsu.projects.dbapp.model.Detail;

import java.util.List;

@Service
public class DetailServiceImpl implements DetailService {
    private DetailDAO detailDAO;

    @Autowired
    public void setDetailDAO(DetailDAO detailDAO) {
        this.detailDAO = detailDAO;
    }

    @Override
    @Transactional
    public List<Detail> allDetails() {
        return detailDAO.allDetails();
    }

    @Override
    @Transactional
    public void add(Detail detail) {
        detailDAO.add(detail);
    }

    @Override
    @Transactional
    public void delete(Detail detail) {
        detailDAO.delete(detail);
    }

    @Override
    @Transactional
    public void edit(Detail detail) {
        detailDAO.edit(detail);
    }

    @Override
    @Transactional
    public Detail get(Long id) {
        return detailDAO.get(id);
    }
}
