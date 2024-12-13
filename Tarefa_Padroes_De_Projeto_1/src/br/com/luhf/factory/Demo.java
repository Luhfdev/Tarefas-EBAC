package br.com.luhf.factory;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escolha o carro que deseja criar: \n 1 - Etios \n 2 - Corola \n 3 - Yaris \n Digite o número de sua escolha: ");
        Integer num = s.nextInt();

        TypeVehicle car = FactoryCar.createVehicle(num);
        System.out.println(car.getVehicle());
    }
}
