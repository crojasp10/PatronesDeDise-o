package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Carrito car = new Carrito();
        car.agregaComida(ComidaFactory.getComida("papas"));
        car.agregaComida(ComidaFactory.getComida("gaseosa"));
        car.agregaComida(ComidaFactory.getComida("hamburguesa"));
        car.agregaComida(ComidaFactory.getComida("combo1"));
        car.agregaComida(ComidaFactory.getComida("combo2"));
        System.out.println("-----------");
        System.out.println(car.getCosto());
    }
}
