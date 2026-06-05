package com.a3_20261.SistemaHospitalar.entities;

import com.a3_20261.SistemaHospitalar.Enum.StatusSenha;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "tb_senhaAtendimento")
public class SenhaAtendimento implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(mappedBy =  "senhaAtendimento")
    private User user;
    @Enumerated(EnumType.STRING)
    private StatusSenha statusSenha;

    public SenhaAtendimento() {
    }

    public SenhaAtendimento(Integer id, User user, StatusSenha statusSenha) {
        this.id = id;
        this.user = user;
        this.statusSenha = statusSenha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public StatusSenha getStatusSenha() {
        return statusSenha;
    }

    public void setStatusSenha(StatusSenha statusSenha) {
        this.statusSenha = statusSenha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SenhaAtendimento that = (SenhaAtendimento) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}