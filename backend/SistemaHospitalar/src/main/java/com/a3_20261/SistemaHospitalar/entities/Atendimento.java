package com.a3_20261.SistemaHospitalar.entities;

import com.a3_20261.SistemaHospitalar.Enum.AtendimentoStatus;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "tb_Atendimento")
public class Atendimento implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private String diagnosis;
    private Date service_date;
    @Enumerated(EnumType.STRING)
    private AtendimentoStatus atendimentoStatus;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User usuario;

    public Atendimento() {
    }

    public Atendimento(Integer id,String descricao, String diagnosis, Date service_date, AtendimentoStatus atendimentoStatus, User usuario) {
        this.id = id;
        this.descricao = descricao;
        this.diagnosis = diagnosis;
        this.service_date = service_date;
        this.atendimentoStatus = atendimentoStatus;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Date getService_date() {
        return service_date;
    }

    public void setService_date(Date service_date) {
        this.service_date = service_date;
    }

    public AtendimentoStatus getAtendimentoStatus() {
        return atendimentoStatus;
    }

    public void setAtendimentoStatus(AtendimentoStatus atendimentoStatus) {
        this.atendimentoStatus = atendimentoStatus;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Atendimento that = (Atendimento) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
