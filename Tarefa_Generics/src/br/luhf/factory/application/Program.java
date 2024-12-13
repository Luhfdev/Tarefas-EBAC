package br.luhf.factory.application;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<TypeVehicle> cars = new ArrayList<>();

        for(int i = 0 ; i < 3 ; i++) {
            System.out.println("Escolha o carro que deseja criar: \n 1 - Etios \n 2 - Corola \n 3 - Yaris \n Digite o número de sua escolha: ");
            Integer num = s.nextInt();

            TypeVehicle car = FactoryCar.createVehicle(num);
            System.out.println(car.getVehicle());
            cars.add(car);
        }

        for(int u = 0 ; u < 3 ; u++){
            System.out.println(cars.get(u).getVehicle());
        }
    }
}
