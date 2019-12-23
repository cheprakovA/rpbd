package ru.edu.vsu.projects.dbapp.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "purchase")
public class Purchase implements Serializable {
    private Long id;
    private Long clientId;
    private Long detailId;
    private Long workerId;
    private int amount;
    private Timestamp dateTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false,
            insertable = false, nullable = false)
    public Long getId() {
        return this.id;
    }

    @Column(name = "client_id")
    public Long getClientId() {
        return this.clientId;
    }

    @Column(name = "detail_id")
    public Long getDetailId() {
        return this.detailId;
    }

    @Column(name = "worker_id")
    public Long getWorkerId() { return this.workerId; }

    @Column(name = "amount")
    public int getAmount() {
        return this.amount;
    }

    @Column(name = "date_time")
    public Timestamp getDateTime() {
        return this.dateTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }
}
