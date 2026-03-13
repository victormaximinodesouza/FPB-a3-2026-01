package com.a3_20261.SistemaHospitalar.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_medico")
public class Medico implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer CRM;
    private String specialty;
    private Integer number;
    @ManyToMany
    @JoinTable(
            name = "medico_cirurgia",
            joinColumns = @JoinColumn(name = "medico_id"),
            inverseJoinColumns = @JoinColumn(name = "cirurgia_id")
    )
    @JsonIgnoreProperties("medico")
    private List<Cirurgia> cirurgia =new ArrayList<>();

    public Medico() {
    }

    public Medico(Integer id, String name, Integer CRM, String specialty, Integer number,List<Cirurgia> cirurgia) {
        this.id = id;
        this.name = name;
        this.CRM = CRM;
        this.specialty = specialty;
        this.number = number;
        this.cirurgia = cirurgia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCRM() {
        return CRM;
    }

    public void setCRM(Integer CRM) {
        this.CRM = CRM;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public List<Cirurgia> getCirurgia() {
        return cirurgia;
    }
    public void setCirurgia(List<Cirurgia> cirurgia) {
        this.cirurgia = cirurgia;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Medico medico = (Medico) o;
        return Objects.equals(id, medico.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
