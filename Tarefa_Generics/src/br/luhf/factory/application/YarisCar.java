package br.luhf.factory.application;

public class YarisCar implements TypeVehicle{

    @Override
    public String name() {
        return "Yaris";
    }

    @Override
    public Integer horsepower() {
        return 160;
    }

    @Override
    public String color() {
        return "branca";
    }

    @Override
    public String getVehicle() {
        return ("Carro "+name()+ " com "+horsepower()+" de cavalos e cor "+color()+" foi criado.");
    }
}
