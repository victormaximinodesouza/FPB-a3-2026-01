package com.a3_20261.SistemaHospitalar.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "tb_prontuario")

public class Prontuario implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date;
    private String OBS;

    public Prontuario() {
    }

    public Prontuario(Integer id, Date date, String OBS) {
        this.id = id;
        this.date = date;
        this.OBS = OBS;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOBS() {
        return OBS;
    }

    public void setOBS(String OBS) {
        this.OBS = OBS;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Prontuario prontuario = (Prontuario) o;
        return Objects.equals(id, prontuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
