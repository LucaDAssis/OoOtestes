package heranca.superherois;
//usei abstrato para ser usado no mesmo pacote
public abstract class SuperHeroi {
    private String traje;
    private String superPoderes[];

    public SuperHeroi(String traje, String[] superPoderes) {
        this.traje = traje;
        this.superPoderes = superPoderes;
    }
    //aqui eu uso abstrato para sempre que alguem criar um objeto. e com isso por já seu poder junto!
    public abstract void usarSuperPoderes(int index);

    public String getTraje(){
        return traje;
    }
}
