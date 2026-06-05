package com.a3_20261.SistemaHospitalar.Enum;

public enum StatusSalaCirurgica {
    LIVRE(1),
    OCUPADA(2),
    MANUNTENCAO(3);


    private int code5;

    private StatusSalaCirurgica(int code3) {
        this.code5 = code5;
    }

    public int getCode4() {
        return code5;
    }

    public static StatusSalaCirurgica valueOf(int code4) {
        for (StatusSalaCirurgica S : StatusSalaCirurgica.values()) {
            if (S.getCode4() == code4) {
                return S;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code4);
    }

}

