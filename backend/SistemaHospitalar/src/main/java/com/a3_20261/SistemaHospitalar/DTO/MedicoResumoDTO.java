package com.a3_20261.SistemaHospitalar.DTO;

import com.a3_20261.SistemaHospitalar.entities.Medico;

public class MedicoResumoDTO {
    private Integer id;
    private String name;
    private String specialty;

    public MedicoResumoDTO() {}

    public MedicoResumoDTO(Medico entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.specialty = entity.getSpecialty();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
