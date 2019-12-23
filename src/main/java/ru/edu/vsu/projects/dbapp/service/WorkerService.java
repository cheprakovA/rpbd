package ru.edu.vsu.projects.dbapp.service;

import ru.edu.vsu.projects.dbapp.model.AutoCategory;
import ru.edu.vsu.projects.dbapp.model.Worker;

import java.util.List;

public interface WorkerService {
    List<Worker> allWorkers();
    void add(Worker worker);
    void delete(Worker worker);
    void edit(Worker worker);
    Worker get(Long id);
}
