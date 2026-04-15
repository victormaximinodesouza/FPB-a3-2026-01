package com.a3_20261.SistemaHospitalar.DTO;

import com.a3_20261.SistemaHospitalar.Enum.ExameStatus;
import com.a3_20261.SistemaHospitalar.Enum.ExameTipo;
import com.a3_20261.SistemaHospitalar.entities.Exame;
import com.a3_20261.SistemaHospitalar.entities.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExameDTO {
    private Integer id;
    private Date Date_request;
    private Date result;
    private ExameTipo tipo;
    private UserResumoDTO user;
    private MedicoResumoDTO medico;
    private ExameStatus status;


    public ExameDTO() {
    }

    public ExameDTO(Exame entity) {
        this.id = entity.getId();
        this.Date_request = entity.getDate_request();
        this.result = entity.getResult();
        this.tipo=entity.getExameTipo();
        this.status=entity.getExameStatus();

        if (entity.getUser() != null) {
            this.user = new UserResumoDTO(entity.getUser());
        }
        if (entity.getMedico() != null) {
            this.medico = new MedicoResumoDTO(entity.getMedico());
        }

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

    public UserResumoDTO getUser() {
        return user;
    }

    public void setUser(UserResumoDTO user) {
        this.user = user;
    }

    public MedicoResumoDTO getMedico() {
        return medico;
    }

    public void setMedico(MedicoResumoDTO medico) {
        this.medico = medico;
    }

    public ExameTipo getTipo() {
        return tipo;
    }

    public void setTipo(ExameTipo tipo) {
        this.tipo = tipo;
    }

    public ExameStatus getStatus() {
        return status;
    }

    public void setStatus(ExameStatus status) {
        this.status = status;
    }
}