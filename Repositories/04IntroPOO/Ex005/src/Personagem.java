public class Personagem {

    // Atributos
    public String nome;
    public int pontos;
    public Arma arma;

    // Contrutor
    public Personagem(String nome, int pontos, Arma arma){
        this.nome = nome;
        this.pontos = pontos;
        this.arma = arma;
    }

    // Metodos
    public void usarArma(){
        this.pontos -= 5;
        this.arma.resistencia -= 2;
        System.out.println("Usou a arma 1 vez");
    }

    public void mostrarInfoPerso(){
        System.out.println("--INFO PERSONAGEM--");
        System.out.println("Nome: " + this.nome);
        System.out.println("HP: " + this.pontos);
    }
}
