package heranca;

import heranca.superherois.*;

public class Main {
    public static void main(String[] args) {
        SuperHeroi[] superHerois = new SuperHeroi[]{
                new HomemAranha("Traje Vermelho e Azul com Teias", new String[]{"Lançar Teia"}),
                new HomemDeFerro("Traje Vermelho e Amarelo", new String[] {"Lasers"}),
                new Tempestade("Traje Branco", new String[] {"Controlar o Tempo"}),
                new ViuvaNegra("Traje Cinza e Preto", new String[] {"Espiã"})
        };


        //usei um forEach para percorrer o array e imprimo o traje antes do poder
        for (SuperHeroi superHeroi : superHerois){
            System.out.println(superHeroi.getTraje());
            superHeroi.usarSuperPoderes(0);
        }


    }
}
