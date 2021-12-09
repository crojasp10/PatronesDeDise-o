package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Comida{

    private List<Comida> productos;
    private String nombre;
    private double descuento;

    @Override
    public double getPrecio(){
        double total = 0;
        for (Comida p: productos) {
            total += p.getPrecio();
        }
        return total - this.descuento;
    }

    public Combo(String nombre, double descuento){
        this.nombre = nombre;
        this.descuento = descuento;
        this.productos = new ArrayList<Comida>();
    }

    public void agregarComida(Comida c){
        this.productos.add(c);
    }
}
