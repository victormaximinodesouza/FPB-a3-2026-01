package com.a3_20261.SistemaHospitalar.entities;

import java.util.Date;
import java.util.Objects;

public class Exame {
    private Integer id;
    private Date Date_request;
    private Date result;

    public Exame() {
    }

    public Exame(Integer id, Date date_request, Date result) {
        this.id = id;
        Date_request = date_request;
        this.result = result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate_request() {
        return Date_request;
    }

    public void setDate_request(Date date_request) {
        Date_request = date_request;
    }

    public Date getResult() {
        return result;
    }

    public void setResult(Date result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Exame exame = (Exame) o;
        return Objects.equals(id, exame.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}


