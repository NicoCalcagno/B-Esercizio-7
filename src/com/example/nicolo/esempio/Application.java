package com.example.nicolo.esempio;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Auto auto = new Auto();
        System.out.println(auto.getTipoMezzo());

        Camion camion = new Camion();
        System.out.println(camion.getTipoMezzo());

        Punto punto = new Punto();
        System.out.println(punto.getTipoMezzo());

    }
}

