public class Motor {

    // Atributos
    public String cilindradas;
    public float velocidadeMaxima;

    // Construtor
    /*public Motor(String cilindradas, float velocidadeMaxima){
        this.cilindradas = cilindradas;
        this.velocidadeMaxima = velocidadeMaxima;
    }*/

    // Metodo
    public void mostraInfo(){
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Velocidade maxima: " + velocidadeMaxima);
    }
}
