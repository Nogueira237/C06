public class Kart {

    // Atributos
    public String nome;
    public Piloto piloto;
    public Motor motor;

    // Construtor
    public Kart(){
        motor = new Motor();
    };

    // Métodos
    void pular(){
        System.out.println("Pulando...");
    };

    void soltarTurbo(){
        System.out.println("Soltando turbo...");
    };

    void fazerDrift(){
        System.out.println("Fazendo drift...");
    };
}
