package com.a3_20261.SistemaHospitalar.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "tb_Cirurgias")
public class Cirurgia implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date dateSurgery;
    private String report;
    @ManyToMany(mappedBy = "cirurgia")
    @JsonIgnore
    private List<Medico> medicos = new ArrayList<>();
    public Cirurgia() {
    }

    public Cirurgia(Integer id, Date dateSurgery, String report,List<Medico> medicos) {
        this.id = id;
        this.dateSurgery = dateSurgery;
        this.report = report;
        this.medicos = medicos;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateSurgery() {
        return dateSurgery;
    }

    public void setDateSurgery(Date dateSurgery) {
        this.dateSurgery = dateSurgery;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }
    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cirurgia cirurgia = (Cirurgia) o;
        return Objects.equals(id, cirurgia.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
