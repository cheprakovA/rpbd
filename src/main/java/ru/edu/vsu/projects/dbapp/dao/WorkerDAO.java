package ru.edu.vsu.projects.dbapp.dao;

import ru.edu.vsu.projects.dbapp.model.Worker;

import java.util.List;

public interface WorkerDAO {
    List<Worker> allWorkers();
    void add(Worker worker);
    void delete(Worker worker);
    void edit(Worker worker);
    Worker get(Long id);
}
