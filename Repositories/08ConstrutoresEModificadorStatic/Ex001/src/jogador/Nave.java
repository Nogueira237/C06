package jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {

    // Atributos
    private String nome;
    private double vida;
    private String tipoTiro;

    // Construtor
    public Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    };

    // Métodos
    public void atirar(Asteroide ast){
        if(ast.getTipoAsteroide().equals("Grande") && this.tipoTiro.equals("Explosivo")){
            System.out.println("Você quebrou o asteroide grande com um tiro explosivo!");
            ast.destruir();
        }
        else if(ast.getTipoAsteroide() == "Grande" && this.tipoTiro == "Normal"){
            System.out.println("O tiro normal não quebra o asteroide!");
        }
        else{
            System.out.println("Voce quebrou o asteroide pequeno com seu tiro normal/explosivo!");
            ast.destruir();
        };
    };

}
