package com.a3_20261.SistemaHospitalar.DTO;

import com.a3_20261.SistemaHospitalar.entities.Cirurgia;
import com.a3_20261.SistemaHospitalar.entities.Medico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CirurgiaDTO {
    private Integer id;
    private Date dateSurgery;
    private String report;

    private List<MedicoResumoDTO> medicos = new ArrayList<>();

    public CirurgiaDTO() {}

    public CirurgiaDTO(Cirurgia entity) {
        this.id = entity.getId();
        this.dateSurgery = entity.getDateSurgery();
        this.report = entity.getReport();

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

    public Date getDateSurgery() {
        return dateSurgery;
    }

    public void setDateSurgery(Date dateSurgery) {
        this.dateSurgery = dateSurgery;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public List<MedicoResumoDTO> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<MedicoResumoDTO> medicos) {
        this.medicos = medicos;
    }
}
