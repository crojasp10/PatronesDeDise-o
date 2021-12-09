package com.company;

public class ComidaFactory {
    public static Comida getComida(String cual){
        Comida resulta=null;
        if (cual.equals("papas")){
            resulta = new Producto("Papas Baston", 150);;
        }
        if (cual.equals("gaseosa")){
            resulta = new Producto("Coca", 140);;
        }
        if (cual.equals("hamburguesa")) {
            resulta = new Producto("Hamburguesa", 200);
        }
        if (cual.equals("combo1")) {
            resulta = new Combo("hamburguesa completa", 60);
            ((Combo) resulta).agregarComida(ComidaFactory.getComida("gaseosa"));
            ((Combo) resulta).agregarComida(ComidaFactory.getComida("hamburguesa"));
            ((Combo) resulta).agregarComida(ComidaFactory.getComida("papas"));
        }
        if (cual.equals("combo2")) {
            resulta = new Combo("pack 2 hamburguesa completa", 200);
            ((Combo) resulta).agregarComida(ComidaFactory.getComida("combo1"));
            ((Combo) resulta).agregarComida(ComidaFactory.getComida("combo1"));
        }
        if (cual.equals("helado")){
            resulta = new Producto("Helado de crema", 40);
        }
        return resulta;
    }
}
