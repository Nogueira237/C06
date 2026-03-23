package br.inatel.cdg.inimigo;

public class Asteroide {

    // Atributos
    private String nome;
    private String tipoAsteroide;

    // Construtor
    public Asteroide(String nome, String tipoAsteroide){
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    };

    // Getters

    public String getTipoAsteroide() {
        return tipoAsteroide;
    };

    // Métodos
    public void destruir(){
        System.out.println(this.nome + " foi destruído!");
    };
}
