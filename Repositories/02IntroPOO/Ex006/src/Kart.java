public class Kart {

    // Atributos
    public String nome;
    public Motor motor;

    // Construtor
    public Kart(String nome){
        this.nome = nome;
        motor = new Motor();
    }

}
