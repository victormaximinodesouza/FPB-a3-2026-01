package com.a3_20261.SistemaHospitalar.Enum;

public enum StatusSenha {

    ESPERANDO(1),
    CHAMADO(2),
    CANCELADO(3);

    private int code;

    private StatusSenha(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static StatusSenha valueOf(int code) {
        for (StatusSenha value : StatusSenha.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code);
    }
}