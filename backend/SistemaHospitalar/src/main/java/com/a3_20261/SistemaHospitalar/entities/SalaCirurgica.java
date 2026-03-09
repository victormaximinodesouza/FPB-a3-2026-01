package com.a3_20261.SistemaHospitalar.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class SalaCirurgica implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer number;
    //private status fazer um enum


    public SalaCirurgica() {
    }

    public SalaCirurgica(Integer id, Integer number) {
        this.id = id;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SalaCirurgica that = (SalaCirurgica) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
