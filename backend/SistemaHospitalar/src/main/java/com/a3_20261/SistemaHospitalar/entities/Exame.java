package com.a3_20261.SistemaHospitalar.entities;

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
    private Date Date_request;
    private Date result;
    @ManyToOne
    @JoinColumn(name = "User_id")
    private User user;

    public Exame() {
    }

    public Exame(Integer id, Date date_request, Date result,User user) {
        this.id = id;
        Date_request = date_request;
        this.result = result;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate_request() {
        return Date_request;
    }

    public void setDate_request(Date date_request) {
        Date_request = date_request;
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


