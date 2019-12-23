package ru.edu.vsu.projects.dbapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.edu.vsu.projects.dbapp.dao.WorkerDAO;
import ru.edu.vsu.projects.dbapp.model.Worker;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
    private WorkerDAO workerDAO;

    @Autowired
    public void setWorkerDAO(WorkerDAO workerDAO) {
        this.workerDAO = workerDAO;
    }
    @Override
    @Transactional
    public List<Worker> allWorkers() {
        return workerDAO.allWorkers();
    }

    @Override
    @Transactional
    public void add(Worker worker) {
        workerDAO.add(worker);
    }

    @Override
    @Transactional
    public void delete(Worker worker) {
        workerDAO.delete(worker);
    }

    @Override
    @Transactional
    public void edit(Worker worker) {
        workerDAO.edit(worker);
    }

    @Override
    @Transactional
    public Worker get(Long id) {
        return workerDAO.get(id);
    }
}
