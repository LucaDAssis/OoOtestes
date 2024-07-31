package heranca.superherois;

public class ViuvaNegra extends SuperHeroi implements Avanger{
    public ViuvaNegra(String traje, String[] superPoderes) {
        super(traje, superPoderes);
    }

    @Override
    public void usarSuperPoderes(int index) {
        System.out.println("Espiã");
        System.out.println("---------------------------------------------");
    }

    @Override
    public boolean isLeader() {
        return false;
    }
}
