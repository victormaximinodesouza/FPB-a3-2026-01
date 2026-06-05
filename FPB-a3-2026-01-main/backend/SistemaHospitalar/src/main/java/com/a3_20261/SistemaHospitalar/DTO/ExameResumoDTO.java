package com.a3_20261.SistemaHospitalar.DTO;

import com.a3_20261.SistemaHospitalar.entities.Exame;

import java.util.Date;

public class ExameResumoDTO {
    private Integer id;
    private Date result;

    public ExameResumoDTO() {
    }

    public ExameResumoDTO(Exame entity) {
        this.id = entity.getId();
        this.result = entity.getResult();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getResult() {
        return result;
    }

    public void setResult(Date result) {
        this.result = result;
    }
}