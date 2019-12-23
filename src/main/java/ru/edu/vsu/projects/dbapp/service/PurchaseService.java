package ru.edu.vsu.projects.dbapp.service;

import ru.edu.vsu.projects.dbapp.model.Purchase;

import java.util.List;

public interface PurchaseService {
    List<Purchase> allPurchases();
    void add(Purchase purchase);
    void delete(Purchase purchase);
    void edit(Purchase purchase);
    Purchase get(Long id);
}
