import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        Scanner s = new Scanner(System.in);
        List<String> listaM = new ArrayList<String>();
        List<String> listaF = new ArrayList<String>();
        String con = "sim";

        while (con.equalsIgnoreCase("Sim")) {
            System.out.println("Deseja adicionar um nome na lista?");
            con = s.nextLine();
            if (con.equalsIgnoreCase("sim")) {
                p.pessoa();
                System.out.println("Adicionado com sucesso!");
                String[] partes = p.pessoa.split("-");
                if (partes.length == 2) {
                    String nome = partes[0];
                    String genero = partes[1];
                    if (genero.equalsIgnoreCase("M")) {
                        listaM.add(nome);
                    } else if (genero.equalsIgnoreCase("F")) {
                        listaF.add(nome);
                    }
                }
            }
        }
        Collections.sort(listaM, String.CASE_INSENSITIVE_ORDER);
        Collections.sort(listaF, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Lista dos Homens:");
        System.out.println(listaM);
        System.out.println("Lista das Mulheres:");
        System.out.println(listaF);
    }
}
