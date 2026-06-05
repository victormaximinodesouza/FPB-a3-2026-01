package com.a3_20261.SistemaHospitalar.DTO;

import com.a3_20261.SistemaHospitalar.Enum.MedicoSpecialty;
import com.a3_20261.SistemaHospitalar.entities.Medico;

public class MedicoResumoDTO {
    private Integer id;
    private String name;
    private MedicoSpecialty specialty;

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

    public MedicoSpecialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(MedicoSpecialty specialty) {
        this.specialty = specialty;
    }
}
