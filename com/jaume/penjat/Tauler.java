package com.jaume.penjat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tauler {
    private char[] paraulaSecreta;
    private int intents;
    private int vidas;
    private String[] palabraEndevinada;
    private boolean guanyador = false;

    public void inicialitzarPartida(String palabra, int numIntentos) {
        setParaulaSecreta(palabra.toCharArray());
        setIntents(numIntentos);
        setVidas(numIntentos);
        setPalabraEndevinada(new String[getParaulaSecreta().length]);
    }

    public char[] getParaulaSecreta() {
        return paraulaSecreta;
    }

    public void setParaulaSecreta(char[] paraulaSecreta) {
        this.paraulaSecreta = paraulaSecreta;
    }

    public int getIntents() {
        return intents;
    }

    public void setIntents(int intents) {
        this.intents = intents;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public String[] getPalabraEndevinada() {
        return palabraEndevinada;
    }

    public void setPalabraEndevinada(String[] palabraEndevinada) {
        this.palabraEndevinada = palabraEndevinada;
    }
}
