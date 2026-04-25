package com.a3_20261.SistemaHospitalar.entities;

import com.a3_20261.SistemaHospitalar.Enum.ExameStatus;
import com.a3_20261.SistemaHospitalar.Enum.ExameTipo;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "tb_exame")
public class Exame implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date dateRequest;
    private Date result;
    @ManyToOne
    @JoinColumn(name = "User_id")
    private User user;
    @Enumerated(EnumType.STRING)
    private ExameTipo exameTipo;
    @ManyToOne
    @JoinColumn(name = "Medico_id")
    private Medico medico;
    @Enumerated(EnumType.STRING)
    private ExameStatus exameStatus;


    public Exame() {
    }

    public Exame(Integer id, Date dateRequest, Date result,User user, ExameTipo exameTipo, Medico medico, ExameStatus exameStatus) {
        this.id = id;
        this.dateRequest = dateRequest;
        this.result = result;
        this.user = user;
        this.exameTipo = exameTipo;
        this.medico = medico;
        this.exameStatus = exameStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(Date dateRequest) {
        this.dateRequest = dateRequest;
    }
    public Date getResult() {
        return result;
    }

    public void setResult(Date result) {
        this.result = result;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public ExameTipo getExameTipo() {
        return exameTipo;
    }
    public void setExameTipo(ExameTipo exameTipo) {
        this.exameTipo = exameTipo;
    }

    public ExameStatus getExameStatus() {
        return exameStatus;
    }
    public void setExameStatus(ExameStatus exameStatus) {
        this.exameStatus = exameStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Exame exame = (Exame) o;
        return Objects.equals(id, exame.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}


