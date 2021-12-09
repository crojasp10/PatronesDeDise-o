package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Comida> contenido;

    public Carrito() {
        contenido = new ArrayList<Comida>();
    };

    public void agregaComida(Comida c){
        contenido.add(c);
       // System.out.println(c.getPrecio());
    }

    public double getCosto(){
        double total = 0;
        for (Comida p: contenido) {
            total += p.getPrecio();
        }
        return total ;
    }

}
