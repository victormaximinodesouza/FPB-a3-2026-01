package com.a3_20261.SistemaHospitalar.entities;

import com.a3_20261.SistemaHospitalar.Enum.MedicoSpecialty;
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
    @Enumerated(EnumType.STRING)
    private MedicoSpecialty specialty;
    private Integer number;
    @ManyToMany
    @JoinTable(
            name = "medico_cirurgia",
            joinColumns = @JoinColumn(name = "medico_id"),
            inverseJoinColumns = @JoinColumn(name = "cirurgia_id")
    )
    private List<Cirurgia> cirurgia =new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "Hospital_id")
    private Hospital hospital;
    @OneToMany
    private List<Consulta> consultas =new ArrayList<>();
    @OneToMany
    private List<Exame> exames =new ArrayList<>();

    public Medico() {
    }

    public Medico(Integer id, String name, Integer CRM, MedicoSpecialty specialty, Integer number,List<Cirurgia> cirurgia,List<Consulta> consultas,List<Exame> exames) {
        this.id = id;
        this.name = name;
        this.CRM = CRM;
        this.specialty = specialty;
        this.number = number;
        this.cirurgia = cirurgia;
        this.consultas = consultas;
        this.exames = exames;
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

    public  MedicoSpecialty  getSpecialty() {
        return specialty;
    }

    public void setSpecialty(MedicoSpecialty specialty) {
        this.specialty = specialty;
    }

    public List<Cirurgia> getCirurgia() {
        return cirurgia;
    }
    public void setCirurgia(List<Cirurgia> cirurgia) {
        this.cirurgia = cirurgia;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
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
