package ru.edu.vsu.projects.dbapp.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "warehouse")
public class Warehouse implements Serializable {
    private Long id;
    private String address;
    private Set<Detail> details;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public Long getId() { return this.id; }

    @Column(name = "address")
    public String getAddress() { return this.address; }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    public Set<Detail> getDetails() {
        return this.details;
    }

    public void setDetails(Set<Detail> details) {
        this.details = details;
    }
}
