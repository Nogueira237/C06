public class Arma {

    // Atributos
    public String nome;
    public int poder;
    public int resistencia;
    public String descricao;

    // Contrutor
    public Arma(String nome, int poder, int resistencia, String descricao){
        this.nome = nome;
        this.poder = poder;
        this.resistencia = resistencia;
        this.descricao = descricao;
    }

    // Metodos
    public void mostraInfoArma(){
        System.out.println("--INFO ARMA--");
        System.out.println("Nome: " + this.nome);
        System.out.println("Poder: " + this.poder);
        System.out.println("Resistencia: " + this.resistencia);
        System.out.println("descricao: " + this.descricao);
    };
}
