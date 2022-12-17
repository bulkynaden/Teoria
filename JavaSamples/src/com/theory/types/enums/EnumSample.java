package com.theory.types.enums;

public enum EnumSample {

    UNO(13, "Uno"),
    DOS(21, "Dos");

    private int valor;
    private String text;

    EnumSample(int valor, String text) {
        this.valor = valor;
        this.text = text;
    }

    public int getValor() {
        return valor;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text + ": " + valor;
    }
}