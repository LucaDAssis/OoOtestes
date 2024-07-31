package polimorfismo;
//usando sobre carga, estou usando dois metodos soma um com int e um com double mas usando soma
//sem essa de somaInteiros ou somaDoubles
public class CalculadoraExemploSobrecarga {
    public static void main(String[] args) {
        System.out.println(soma(1, 2));
        System.out.println(soma(2.0, 2.0));
    }


    public static int soma(int a, int b){
        return a + b;
    }

    static double soma(double a, double b){
        return a + b;
    }
}
