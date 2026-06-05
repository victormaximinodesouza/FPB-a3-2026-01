package com.a3_20261.SistemaHospitalar.Enum;

public enum MedicoSpecialty {
    CARDIOLOGIA(1),
    ORTOPEDIA(2),
    CLINICA_GERAL(3),
    DERMATOLOGIA(4);

    private int code;

    private MedicoSpecialty(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static MedicoSpecialty valueOf(int code) {
        for (MedicoSpecialty m : MedicoSpecialty.values()) {
            if (m.getCode() == code) {
                return m;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code);
    }

}
