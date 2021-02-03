package com.jaume.penjat;

import java.util.ArrayList;
import java.util.List;

public class Tauler {
    public List<Character> chars = new ArrayList<>();
    public int intents;
    public int vidas;

    public void inicialitzarPartida(String palabra, int numIntentos) {
        for (char character : palabra.toCharArray()) {
            chars.add(character);
        }
        setIntents(numIntentos);
    }

    public List<Character> getChars() {
        return chars;
    }

    public void setChars(List<Character> chars) {
        this.chars = chars;
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


}
