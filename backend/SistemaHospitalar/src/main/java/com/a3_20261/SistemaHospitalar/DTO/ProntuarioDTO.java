package com.a3_20261.SistemaHospitalar.DTO;

import com.a3_20261.SistemaHospitalar.entities.Prontuario;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;
@JsonPropertyOrder({
        "id",
        "date",
        "OBS",
        "user"
})
public class ProntuarioDTO {

    private Integer id;
    private String OBS;
    private Date date;
    private UserResumoDTO user;
    public ProntuarioDTO() {}

    public ProntuarioDTO(Prontuario entity) {
        this.id = entity.getId();
        this.OBS = entity.getOBS();
        this.date = entity.getDate();
        if (entity.getUser() != null) {
            this.user = new UserResumoDTO(entity.getUser());
        }
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserResumoDTO getUser() {
        return user;
    }

    public void setUser(UserResumoDTO user) {
        this.user = user;
    }
}