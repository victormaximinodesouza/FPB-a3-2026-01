package com.a3_20261.SistemaHospitalar.DTO;

import com.a3_20261.SistemaHospitalar.entities.Exame;
import com.a3_20261.SistemaHospitalar.entities.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExameDTO {
    private Integer id;
    private Date Date_request;
    private Date result;
    private UserResumoDTO user;

    public ExameDTO() {
    }

    public ExameDTO(Exame entity) {
        this.id = entity.getId();
        this.Date_request = entity.getDate_request();
        this.result = entity.getResult();
        this.user = new UserResumoDTO(entity.getUser()); // 👈 sem for
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
}