package br.com.luhf.factory;

import java.util.Scanner;

public class CorolaCar implements TypeVehicle{


    @Override
    public String name() {
        return "Corola";
    }

    @Override
    public Integer horsepower() {
        return 220;
    }

    @Override
    public String color() {
        return "black";
    }

    @Override
    public String getVehicle() {
        return ("Carro "+name()+ " com "+horsepower()+" de cavalos e cor "+color()+" foi criado.");
    }
}
