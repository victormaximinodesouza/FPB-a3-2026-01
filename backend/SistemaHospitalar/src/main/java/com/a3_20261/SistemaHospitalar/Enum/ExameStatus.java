package com.a3_20261.SistemaHospitalar.Enum;

public enum ExameStatus {
    AGENDADO(1),
    CONCLUIDO(2),
    ANDAMENTO(3);


    private int code4;

    private ExameStatus(int code3) {
        this.code4 = code4;
    }

    public int getCode4() {
        return code4;
    }

    public static ExameStatus valueOf(int code4) {
        for (ExameStatus m : ExameStatus.values()) {
            if (m.getCode4() == code4) {
                return m;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code4);
    }

}
