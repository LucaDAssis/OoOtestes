package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Trabalhador cozinheiro = new Cozinheiro();
        Trabalhador programador = new Programador();
        Trabalhador medico = new Medico();

        cozinheiro.trabalhar();
        programador.trabalhar();
        medico.trabalhar();
    }
}
