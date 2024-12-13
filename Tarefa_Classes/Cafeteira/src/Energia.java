public class Energia {
    private boolean energia;

    public boolean isEnergia() {
        return energia;
    }

    public void setEnergia(boolean energia) {
        this.energia = energia;
    }

    public void Funcionando(int cafe, int agua) {
        System.out.println("Adicionando " + cafe + "g de pó de café");
        System.out.println("Adicionando " + agua + "ml de água");
        System.out.println("Fervendo a água. Por favor espere!");
        System.out.println("Liberando o Café");
        System.out.println("Café pronto, desligando a maquina.");
    }
}
