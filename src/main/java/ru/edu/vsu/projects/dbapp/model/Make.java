package ru.edu.vsu.projects.dbapp.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "make")
public class Make implements Serializable {
    private Long id;
    private String name;
    private Set<Auto> autos;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false,
            insertable = false, nullable = false)
    public Long getId() {
        return this.id;
    }

    @Column(name = "name")
    public String getName() {
        return this.name;
    }

    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    public Set<Auto> getAutos() {
        return this.autos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAutos(Set<Auto> autos) {
        this.autos = autos;
    }
}
