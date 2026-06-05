package com.a3_20261.SistemaHospitalar.DTO;

import com.a3_20261.SistemaHospitalar.entities.Consulta;

public class ConsultaDTO {

    private Integer id;
    private String obs;
    private MedicoResumoDTO medico;

    public ConsultaDTO() {}

    public ConsultaDTO(Consulta c) {
        this.id = c.getId();
        this.obs = c.getObs();
        this.medico = new MedicoResumoDTO(c.getMedico());
    }

    public Integer getId() {
        return id;
    }

    public String getObs() {
        return obs;
    }

    public MedicoResumoDTO getMedico() {
        return medico;
    }
}
