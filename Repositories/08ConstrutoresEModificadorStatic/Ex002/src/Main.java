import br.inatel.cdg.bloco.Bloco;
import br.inatel.cdg.jogador.Jogador;
import util.Conversor;

public class Main {
    static void main(String[] args) {

        Jogador j1 = new Jogador("Eduardo", 0);
        Bloco b1 = new Bloco();
        Bloco b3 = new Bloco();
        Bloco b2 = new Bloco();

        System.out.println("Número de blocos criados: " + Bloco.getNumBlocos());       // aplicação do static

        System.out.println("Pontuação inicial do jogador: " + j1.getPontuacao());    // mostra pontuacao antes de destruir blocos

        b1.destruir(j1);        // 5 pontos
        b2.destruir(j1);        // 5 pontos

        System.out.println("Número de blocos restantes: " + Bloco.getNumBlocos());
        System.out.println("Pontuação final do jogador: " + j1.getPontuacao());

        System.out.println("Número de moedas: " + Conversor.converterMoeda(j1.getPontuacao())); // Transforma em moedas

    }
}
