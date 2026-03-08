package com.a3_20261.SistemaHospitalar.entities;

import java.util.Date;
import java.util.Objects;

public class Cirurgias {
    private Integer id;
    private Date dateSurgery;
    private String report;

    public Cirurgias() {
    }

    public Cirurgias(Integer id, Date dateSurgery, String report) {
        this.id = id;
        this.dateSurgery = dateSurgery;
        this.report = report;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cirurgias cirurgias = (Cirurgias) o;
        return Objects.equals(id, cirurgias.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
