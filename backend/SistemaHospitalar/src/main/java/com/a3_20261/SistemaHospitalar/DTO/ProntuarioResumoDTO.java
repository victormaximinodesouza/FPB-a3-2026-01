package com.a3_20261.SistemaHospitalar.DTO;

import com.a3_20261.SistemaHospitalar.entities.Prontuario;

import java.util.Date;

public class ProntuarioResumoDTO {
    private Integer id;
    private String OBS;
    private Date date;

    public ProntuarioResumoDTO() {}

    public ProntuarioResumoDTO(Prontuario entity) {
        this.id = entity.getId();
        this.OBS = entity.getOBS();
        this.date = entity.getDate();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOBS() {
        return OBS;
    }

    public void setOBS(String OBS) {
        this.OBS = OBS;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}