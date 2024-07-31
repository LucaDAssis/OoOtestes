package heranca.superherois;

public class HomemDeFerro extends SuperHeroi implements Avanger{
    public HomemDeFerro(String traje, String[] superPoderes) {
        super(traje, superPoderes);
    }

    public void usarSuperPoderes(int index){
        System.out.println("Falar com Jarvis");
        System.out.println("---------------------------------------------");
    }

    @Override
    public boolean isLeader() {
        return true;
    }
}
