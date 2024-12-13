package br.com.luhf.factory;

public class EtiosCar implements TypeVehicle{

    @Override
    public String name() {
        return "Etios";
    }

    @Override
    public Integer horsepower() {
        return 120;
    }


    @Override
    public String color() {
        return "chumbo";
    }

    public String getVehicle() {
        return ("Carro "+name()+ " com "+horsepower()+" de cavalos e cor "+color()+" foi criado.");
    }



}
