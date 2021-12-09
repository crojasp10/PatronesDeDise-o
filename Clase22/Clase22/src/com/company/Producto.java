package com.company;

public class Producto implements Comida{

    private String nombre;
    private double precio;

    @Override
    public double getPrecio(){
        return this.precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
}
