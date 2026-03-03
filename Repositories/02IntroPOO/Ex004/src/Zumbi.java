public class Zumbi {

    // Atributos
    public double vida;
    public String nome;

    // Construtor
    public Zumbi(double vida, String nome){
        this.vida = vida;
        this.nome = nome;
    }

    // Metódos
    public double mostraVida(){
        return vida;
    };

    public boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        if (this.vida >= quantia) {
            this.vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }
        else{
            return false;
        }
    };

}
