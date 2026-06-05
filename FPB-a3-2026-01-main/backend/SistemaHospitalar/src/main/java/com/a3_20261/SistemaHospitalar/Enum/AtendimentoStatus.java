package com.a3_20261.SistemaHospitalar.Enum;

public enum AtendimentoStatus {
    AGENDADO(1),
    CONCLUIDO(2),
    ANDAMENTO(3);


    private int code5;

    private AtendimentoStatus(int code3) {
        this.code5 = code5;
    }

    public int getCode5() {
        return code5;
    }

    public static AtendimentoStatus valueOf(int code5) {
        for (AtendimentoStatus m : AtendimentoStatus.values()) {
            if (m.getCode5() == code5) {
                return m;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code5);
    }

}
