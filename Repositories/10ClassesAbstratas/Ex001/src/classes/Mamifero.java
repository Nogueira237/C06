package classes;

public abstract class Mamifero {

    // Atributos
    protected String nome;
    protected double vida;

    // Construtor
    public Mamifero(String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    };

    // Métodos
    public abstract void emitirSom();       // metodo abstrato

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida + "\n");
    };


}
