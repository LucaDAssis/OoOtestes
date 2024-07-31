package encapsulamento;

public class Carro {
    public Motor motor;
    public String volante;
    public String pedais;
    public String airbag;

    public void ligarCarro(){
        System.out.println("Ligar encapsulamento.Carro....");
    }

    public void acelerar(){
        System.out.println("Acelerar....");
    }

    public void frear(){
        System.out.println("Frear....");
    }
}
