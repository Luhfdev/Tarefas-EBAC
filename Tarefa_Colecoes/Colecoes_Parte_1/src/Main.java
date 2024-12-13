import java.util.*;

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        Scanner s = new Scanner(System.in);
        List<String> lista = new ArrayList<String>();
        String con = "sim";

        while (con.equalsIgnoreCase("Sim")) {
            System.out.println("Deseja adicionar um nome na lista?");
            con = s.nextLine();
            if (con.equalsIgnoreCase("sim")) {
                p.mnome();
                lista.add(p.nome);
            }
        }
        Collections.sort(lista, String.CASE_INSENSITIVE_ORDER);
        System.out.println(lista);


    }
}
