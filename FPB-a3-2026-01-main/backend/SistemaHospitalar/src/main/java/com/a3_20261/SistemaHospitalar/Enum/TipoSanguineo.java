package com.a3_20261.SistemaHospitalar.Enum;

public enum TipoSanguineo {

    A_POSITIVO(1),
    A_NEGATIVO(2),

    B_POSITIVO(3),
    B_NEGATIVO(4),

    AB_POSITIVO(5),
    AB_NEGATIVO(6),

    O_POSITIVO(7),
    O_NEGATIVO(8);

    private int code4;

    private TipoSanguineo(int code4) {
        this.code4 = code4;
    }

    public int getCode4() {
        return code4;
    }

    public static TipoSanguineo valueOf(int code4) {

        for (TipoSanguineo m : TipoSanguineo.values()) {

            if (m.getCode4() == code4) {
                return m;
            }
        }

        throw new IllegalArgumentException("Código inválido: " + code4);
    }
}