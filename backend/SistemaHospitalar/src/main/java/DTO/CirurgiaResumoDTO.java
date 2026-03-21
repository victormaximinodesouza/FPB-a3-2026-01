package DTO;

import com.a3_20261.SistemaHospitalar.entities.Cirurgia;

import java.util.Date;

public class CirurgiaResumoDTO {
    private Integer id;
    private Date dateSurgery;
    private String report;

    public CirurgiaResumoDTO() {}

    public CirurgiaResumoDTO(Cirurgia entity) {
        this.id = entity.getId();
        this.dateSurgery = entity.getDateSurgery();
        this.report = entity.getReport();
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
}
