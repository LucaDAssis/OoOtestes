package abstracao;

public class Tv {
    private Boolean ligada = true;
    private int volume;
    private int canal;

    public void ligarDesligar(){
        this.ligada = !this.ligada;
        System.out.println("A Tv Está " + (ligada ? "Ligada" : "Desligada"));
    }

    public  void aumentarVolume(){
        this.volume++;
        System.out.println("Volume: " + this.volume);
    }

    public void diminuirVolume(){
        this.volume--;
        System.out.println("Volume: " + this.volume);
    }

    public void mudarCanal(Integer novoCanal){
        this.canal = novoCanal;
        System.out.println("Canal Alterado Para: " + novoCanal);
    }
}
