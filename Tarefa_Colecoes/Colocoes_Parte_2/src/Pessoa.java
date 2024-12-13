import java.util.Scanner;

public class Pessoa {

    Scanner s = new Scanner(System.in);
    String nome;
    String sexo;
    String pessoa;

    public void pessoa() {
        System.out.print("Digite o nome que deseja adicionar a lista: ");
        nome = s.nextLine();
        System.out.print("Digite o sexo dessa pessoa (M - masculino | F - Feminino): ");
        sexo = s.nextLine();

        pessoa = nome + "-" + sexo.toUpperCase();
    }

    public void mnome(){
        System.out.print("Digite o nome que deseja adicionar a lista: ");
        nome = s.nextLine();
        System.out.println("Nome adicionado com sucesso!");
    }
}
