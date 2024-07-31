package polimorfismo;

public class Medico implements Trabalhador{
    @Override
    public void trabalhar() {
        System.out.println("Tratar Pessoas...");
    }
}
