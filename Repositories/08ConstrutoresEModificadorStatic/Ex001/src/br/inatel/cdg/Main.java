package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import jogador.Nave;

public class Main {
    static void main(String[] args) {

        Asteroide ast1 = new Asteroide("AsteroGrande", "Grande");
        Asteroide ast2 = new Asteroide("AsteroPequeno", "Pequeno");

        Nave nave1 = new Nave("naveExplosivo", 150, "Explosivo");
        Nave nave2 = new Nave("naveNormal", 150, "Normal");

        nave1.atirar(ast1);
        nave1.atirar(ast2);

        nave2.atirar(ast1);
        nave2.atirar(ast2);
    }

}
