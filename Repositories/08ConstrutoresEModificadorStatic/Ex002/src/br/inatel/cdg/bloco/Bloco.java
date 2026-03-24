package br.inatel.cdg.bloco;

import br.inatel.cdg.jogador.Jogador;

public class Bloco {

    // Atributos
    private static int numBlocos = 0;

    // Construtor
    public Bloco(){
        numBlocos++;
    };

    // Getter
    public static int getNumBlocos(){
        return numBlocos;
    };

    // Métodos
    public void destruir(Jogador jogador){
        numBlocos--;
        jogador.aumentarPontuacao(5);
    };
}
