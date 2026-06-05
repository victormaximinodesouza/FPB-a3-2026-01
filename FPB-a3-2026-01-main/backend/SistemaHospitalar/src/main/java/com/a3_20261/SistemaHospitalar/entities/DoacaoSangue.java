package com.a3_20261.SistemaHospitalar.entities;

import com.a3_20261.SistemaHospitalar.Enum.TipoSanguineo;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_estoque_sangue")
public class DoacaoSangue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private TipoSanguineo tipoSanguineo;

    private Integer quantidadeBolsas;

    public DoacaoSangue() {
    }

    public DoacaoSangue(Integer quantidadeBolsas, TipoSanguineo tipoSanguineo, Integer id) {
        this.quantidadeBolsas = quantidadeBolsas;
        this.tipoSanguineo = tipoSanguineo;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Integer getQuantidadeBolsas() {
        return quantidadeBolsas;
    }

    public void setQuantidadeBolsas(Integer quantidadeBolsas) {
        this.quantidadeBolsas = quantidadeBolsas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DoacaoSangue that = (DoacaoSangue) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
