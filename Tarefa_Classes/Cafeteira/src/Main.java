
public class Main {
    public static void main(String[] args) {

        Energia ligar = new Energia();
        ligar.setEnergia(true);
        if (ligar.isEnergia()) {
            CompartimentoDeAgua agua = new CompartimentoDeAgua();
            agua.setCapacidadeA(300);
            CompartimentoDeCafé cafe = new CompartimentoDeCafé();
            cafe.setCapacidadeC(100);

            ligar.Funcionando(cafe.getCapacidadeC(), agua.getCapacidadeA());
            ligar.setEnergia(false);
        }

        else {
            System.out.println("A maquina não está ligada. Por favor, ligue a maquina.");
        }
    }
}