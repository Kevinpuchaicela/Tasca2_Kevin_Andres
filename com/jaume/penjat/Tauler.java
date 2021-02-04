package com.jaume.penjat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tauler {
    public char[] paraulaSecreta;
    public int intents;
    public int vidas;
    public String[] palabraEndevinada;

    public void inicialitzarPartida(String palabra, int numIntentos) {
        setParaulaSecreta(palabra.toCharArray());
        setIntents(numIntentos);
        setVidas(numIntentos);
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
