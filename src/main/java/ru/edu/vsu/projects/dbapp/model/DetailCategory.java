package ru.edu.vsu.projects.dbapp.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detail_category")
public class DetailCategory implements Serializable {
    private Long id;
    private String title;
    private Set<Detail> details;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false,
            insertable = false, nullable = false)
    public Long getId() {
        return id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    public Set<Detail> getDetails() {
        return details;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(Set<Detail> details) {
        this.details = details;
    }
}
