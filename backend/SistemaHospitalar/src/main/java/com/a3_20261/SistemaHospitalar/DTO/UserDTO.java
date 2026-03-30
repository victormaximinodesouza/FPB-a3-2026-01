package com.a3_20261.SistemaHospitalar.DTO;

import com.a3_20261.SistemaHospitalar.entities.Exame;
import com.a3_20261.SistemaHospitalar.entities.User;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonPropertyOrder({
        "id",
        "nome",
        "CPF",
        "email",
        "dateBirth",
        "address",
        "number",
        "prontuario",
        "exame"

})
public class UserDTO {


    private Integer id;
    private String nome;
    private Integer CPF;
    private Date dateBirth;
    private String address;
    private String email;
    private String number;
    private ProntuarioResumoDTO prontuario;
    private List<ExameResumoDTO> exame = new ArrayList<>();


    public UserDTO() {
    }

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.CPF = entity.getCPF();
        this.dateBirth = entity.getDateBirth();
        this.address = entity.getAddress();
        this.email = entity.getEmail();
        this.number = entity.getNumber();


        if (entity.getProntuario() != null) {
            this.prontuario = new ProntuarioResumoDTO(entity.getProntuario());
        }
        for (Exame e : entity.getExames()) {
            this.exame.add(new ExameResumoDTO(e));
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCPF() {
        return CPF;
    }

    public void setCPF(Integer CPF) {
        this.CPF = CPF;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ProntuarioResumoDTO getProntuario() {
        return prontuario;
    }

    public void setProntuario(ProntuarioResumoDTO prontuario) {
        this.prontuario = prontuario;
    }

    public List<ExameResumoDTO> getExame() {
        return exame;
    }
    public void setExame(List<ExameResumoDTO> exame) {
        this.exame = exame;
    }
}