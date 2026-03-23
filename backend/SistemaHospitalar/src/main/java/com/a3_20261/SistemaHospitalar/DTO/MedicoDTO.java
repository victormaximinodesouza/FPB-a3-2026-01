package com.a3_20261.SistemaHospitalar.DTO;

import com.a3_20261.SistemaHospitalar.entities.Cirurgia;
import com.a3_20261.SistemaHospitalar.entities.Medico;
import java.util.ArrayList;
import java.util.List;

public class MedicoDTO {
    private Integer id;
    private String name;
    private Integer CRM;
    private String specialty;
    private Integer number;
    private List<CirurgiaResumoDTO> cirurgia = new ArrayList<>();
    private HospitalResumoDTO hospital;

    public MedicoDTO() {}

    public MedicoDTO(Medico entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.CRM = entity.getCRM();
        this.specialty = entity.getSpecialty();
        this.number = entity.getNumber();

        for (Cirurgia c : entity.getCirurgia()) {
            this.cirurgia.add(new CirurgiaResumoDTO(c));
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

    public Integer getCRM() {
        return CRM;
    }

    public void setCRM(Integer CRM) {
        this.CRM = CRM;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<CirurgiaResumoDTO> getCirurgia() {
        return cirurgia;
    }

    public void setCirurgia(List<CirurgiaResumoDTO> cirurgia) {
        this.cirurgia = cirurgia;
    }
}


