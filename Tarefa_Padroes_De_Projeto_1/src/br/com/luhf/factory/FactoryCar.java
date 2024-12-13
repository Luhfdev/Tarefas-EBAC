package br.com.luhf.factory;

public class FactoryCar {

    public static TypeVehicle createVehicle(int num) {
        if(num==1){
            return new EtiosCar();
        }
        else if(num==2){
            return new CorolaCar();
        }
        else if(num==3){
            return new YarisCar();
        }
        return null;
    }

}
