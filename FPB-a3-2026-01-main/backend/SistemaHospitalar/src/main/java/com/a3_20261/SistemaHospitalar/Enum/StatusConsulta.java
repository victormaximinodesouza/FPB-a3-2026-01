package com.a3_20261.SistemaHospitalar.Enum;

public enum StatusConsulta {

    AGENDADA(1),
    CANCELADA(2),
    REALIZADA(3);

    private int code;

    private StatusConsulta(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static StatusConsulta valueOf(int code) {
        for (StatusConsulta value : StatusConsulta.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code);
    }
}