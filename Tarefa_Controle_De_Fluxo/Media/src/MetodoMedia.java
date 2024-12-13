import java.util.Scanner;
public class MetodoMedia {

    Scanner s = new Scanner(System.in);

    private double n1;
    private double n2;
    private double n3;
    private double n4;

    private double mediaT;

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double getN3() {
        return n3;
    }

    public double getN4() {
        return n4;
    }

    public void Nota() {
        System.out.print("Digite a primeira nota: ");
        n1 = s.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = s.nextDouble();
        System.out.print("Digite a terceira nota: ");
        n3 = s.nextDouble();
        System.out.print("Digite a quarta nota: ");
        n4 = s.nextDouble();
    }

    public void Calcmedia(double num1, double num2, double num3, double num4){
        double media = (num1 + num2 + num3 + num4) / 4;
        System.out.printf("%.2f %n", media);
        mediaT = media;
    }

    public void Medi() {
        if(mediaT >= 7) {
            System.out.println("Aprovado!!!");
        }
        else if(mediaT < 7 && mediaT >= 5){
            System.out.println("Recuperação!");
        }
        else if(mediaT < 5) {
            System.out.println("Reprovado!");
        }
    }
}
