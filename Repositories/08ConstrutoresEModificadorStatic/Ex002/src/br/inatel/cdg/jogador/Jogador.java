package br.inatel.cdg.jogador;

import br.inatel.cdg.bloco.Bloco;

public class Jogador {

    // Atributos
    private String nome;
    private int pontuacao;

    // Construtor
    public Jogador(String nome, int pontuacao){
        this.nome = nome;
        this.pontuacao = pontuacao;
    };

    // Getter
    public int getPontuacao(){
        return pontuacao;
    };

    // Metodos

    public void aumentarPontuacao(int pontos){
        this.pontuacao += pontos;
    };

}
