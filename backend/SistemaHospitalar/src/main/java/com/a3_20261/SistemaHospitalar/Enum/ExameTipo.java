package com.a3_20261.SistemaHospitalar.Enum;

public enum ExameTipo {
    HEMOGRAMA(1),
    RAIO_X(2),
    ELETROCARDIOGRAMA(3),
    Ressonancia_Magnetica(4);

    private int code3;

    private ExameTipo(int code3) {
        this.code3 = code3;
    }

    public int getCode3() {
        return code3;
    }

    public static ExameTipo valueOf(int code3) {
        for (ExameTipo m : ExameTipo.values()) {
            if (m.getCode3() == code3) {
                return m;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code3);
    }

}
