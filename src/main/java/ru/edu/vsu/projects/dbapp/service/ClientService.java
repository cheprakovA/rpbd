package ru.edu.vsu.projects.dbapp.service;

import ru.edu.vsu.projects.dbapp.model.Client;

import java.util.List;

public interface ClientService {
    List<Client> allClients();
    void add(Client client);
    void delete(Client client);
    void edit(Client client);
    Client get(Long id);
}
