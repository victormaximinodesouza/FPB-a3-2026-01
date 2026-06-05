package com.a3_20261.SistemaHospitalar.Enum;

public enum StatusCirurgia {

    AGENDADA(1),
    REALIZADA(2),
    CANCELADA(3);

    private int code;

    private StatusCirurgia(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static StatusCirurgia valueOf(int code) {
        for (StatusCirurgia value : StatusCirurgia.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code);
    }
}