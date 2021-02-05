package com.jaume.penjat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tauler {
    private char[] paraulaSecreta;
    private int intents;
    private int totalIntents;
    private String[] palabraEndevinada;
    private boolean guanyador = false;

    public void inicialitzarPartida(String palabra, int numIntentos) {
        setParaulaSecreta(palabra.toCharArray());
        setIntents(numIntentos);
        setTotalIntents(numIntentos);
        setPalabraEndevinada(new String[getParaulaSecreta().length]);
        String[] arrPalabra = palabra.split("");
        for (int i = 0; i < palabra.length(); i++) {
            if (arrPalabra[i].equals(" ")) {
                this.palabraEndevinada[i] = " ";
            }
        }
    }

    public String verificar(String entrada) {
        if (entrada.equals("")) {
            return "Has d'introduir alguna lletra.";
        }

        if (entrada.length() >= 2) {
            char[] arrayEntrada = entrada.toCharArray();
            if (Arrays.equals(arrayEntrada, paraulaSecreta)) {
                this.guanyador = true; //crear setter de guanyador?
                return "Paraula correcte";
            }
            this.intents = intents - 1;
            return "Paraula incorrecte";
        }

        boolean coincidencia = false;

        for (int i = 0; i < paraulaSecreta.length; i++) {
            if (entrada.charAt(0) == (paraulaSecreta[i])) {
                this.palabraEndevinada[i] = entrada;
                coincidencia = true; //sug: se podria hacer que imprima el nº de coincidencias encontradas (arr)
            }
        }
        if (coincidencia == true) {
            if (Arrays.equals(String.join("", palabraEndevinada).toCharArray(), paraulaSecreta)) {
                this.guanyador = true;
            }
            return "Lletra correcte";
        }
        this.intents = intents - 1;
        return "Lletra incorrecte";
    }

    public String imprimirVides() {
        if (intents >= 1) {
            return "Et queden " + intents + " vides de " + getTotalIntents();
        }
        return "Et queda 1 vida de " + getTotalIntents();
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

    public String[] getPalabraEndevinada() {
        return palabraEndevinada;
    }

    public void setPalabraEndevinada(String[] palabraEndevinada) {
        this.palabraEndevinada = palabraEndevinada;
    }

    public int getTotalIntents() {
        return totalIntents;
    }

    public void setTotalIntents(int totalIntents) {
        this.totalIntents = totalIntents;
    }
}
