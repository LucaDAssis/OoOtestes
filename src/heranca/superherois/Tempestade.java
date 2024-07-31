package heranca.superherois;

public class Tempestade extends SuperHeroi implements Avanger{
    public Tempestade(String traje, String[] superPoderes) {
        super(traje, superPoderes);
    }

    @Override
    public void usarSuperPoderes(int index) {
        System.out.println("Controla tempestade!");
        System.out.println("---------------------------------------------");
    }

    @Override
    public boolean isLeader() {
        return false;
    }
}
