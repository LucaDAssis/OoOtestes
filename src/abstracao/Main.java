package abstracao;

public class Main {
    public static void main(String[] args) {
        Tv minhaTv = new Tv();
        minhaTv.ligarDesligar();
        minhaTv.aumentarVolume();
        minhaTv.diminuirVolume();
        minhaTv.mudarCanal(122);
    }
}
