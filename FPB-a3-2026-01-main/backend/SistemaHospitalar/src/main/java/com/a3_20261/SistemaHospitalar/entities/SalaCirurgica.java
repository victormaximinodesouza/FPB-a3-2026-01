package com.a3_20261.SistemaHospitalar.entities;

import com.a3_20261.SistemaHospitalar.Enum.StatusSalaCirurgica;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_sala")

public class SalaCirurgica implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer number;
    @Enumerated(EnumType.STRING)
    private StatusSalaCirurgica status;
    @OneToMany
    private List<Cirurgia> cirurgias;

    public SalaCirurgica() {
    }

    public SalaCirurgica(Integer id, Integer number, StatusSalaCirurgica status, List<Cirurgia> cirurgias) {
        this.id = id;
        this.number = number;
        this.status = status;
        this.cirurgias = cirurgias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public StatusSalaCirurgica getStatus() {
        return status;
    }

    public void setStatus(StatusSalaCirurgica status) {
        this.status = status;
    }

    public List<Cirurgia> getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(List<Cirurgia> cirurgias) {
        this.cirurgias = cirurgias;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SalaCirurgica that = (SalaCirurgica) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
