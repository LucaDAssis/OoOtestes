package heranca.superherois;

//homemAranha ta exendendo a Classe Pai que é a SuperHeroi
public class HomemAranha extends SuperHeroi implements Avanger {
    public HomemAranha(String traje, String[] superPoderes) {
        super(traje, superPoderes);
    }

    @Override
    public void usarSuperPoderes(int index) {
        System.out.println("Usar teia");
        System.out.println("---------------------------------------------");
    }

    @Override
    public boolean isLeader() {
        return false;
    }
}
