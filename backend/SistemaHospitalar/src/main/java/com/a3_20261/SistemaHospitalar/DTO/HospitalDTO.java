package com.a3_20261.SistemaHospitalar.DTO;

import com.a3_20261.SistemaHospitalar.entities.Hospital;
import com.a3_20261.SistemaHospitalar.entities.Medico;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "id",
        "name",
        "number",
        "address",
        "medicos",
        "users"
})
public class HospitalDTO {

    private Integer id;
    private String name;

    private List<MedicoResumoDTO> medicos = new ArrayList<>();

    public HospitalDTO() {}

    public HospitalDTO(Hospital entity) {
        this.id = entity.getId();
        this.name = entity.getName();

        for (Medico m : entity.getMedicos()) {
            this.medicos.add(new MedicoResumoDTO(m));
        }
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

    public List<MedicoResumoDTO> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<MedicoResumoDTO> medicos) {
        this.medicos = medicos;
    }
}
