package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {

    private List<Carta> cartas  = new ArrayList <>();

    public Monte() {
        int[] valores = {1,2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

        for (int valor : valores) {
            cartas.add(new Carta(valor,Naipe.Clubs));
        }
        for (int valor : valores) {
            cartas.add(new Carta(valor,Naipe.Diamonds));
        }
        for (int valor : valores) {
            cartas.add(new Carta(valor,Naipe.Hearts));
        }
        for (int valor : valores) {
            cartas.add(new Carta(valor,Naipe.Spades));
        }

    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public Carta virar (){
        
        return cartas.remove(0);

    }

}