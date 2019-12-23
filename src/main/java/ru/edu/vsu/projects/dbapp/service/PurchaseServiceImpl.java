package ru.edu.vsu.projects.dbapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.edu.vsu.projects.dbapp.dao.PurchaseDAO;
import ru.edu.vsu.projects.dbapp.model.Purchase;

import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    private PurchaseDAO purchaseDAO;

    @Autowired
    public void setPurchaseDAO(PurchaseDAO purchaseDAO) {
        this.purchaseDAO = purchaseDAO;
    }

    @Override
    @Transactional
    public List<Purchase> allPurchases() {
        return purchaseDAO.allPurchases();
    }

    @Override
    @Transactional
    public void add(Purchase purchase) {
        purchaseDAO.add(purchase);
    }

    @Override
    @Transactional
    public void delete(Purchase purchase) {
        purchaseDAO.delete(purchase);
    }

    @Override
    @Transactional
    public void edit(Purchase purchase) {
        purchaseDAO.edit(purchase);
    }

    @Override
    @Transactional
    public Purchase get(Long id) {
        return purchaseDAO.get(id);
    }
}
