import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {

        // Matriz boolean para o campo minado
        boolean[][] localizacao;
        localizacao = new boolean[2][2];

        // Preenchendo a matriz com false
        for (int i = 0; i < localizacao.length; i++){
            for (int j = 0; j < localizacao.length; j++){
                localizacao[i][j] = false;
            };
        };

        // Gerando mina aleatoria
        Random rand = new Random();
        int x = rand.nextInt(2);
        int y = rand.nextInt(2);
        localizacao[x][y] = true;       // posicao da mina

        Scanner entrada = new Scanner(System.in);
        boolean ganhou = false;

        do{
            for(int i = 0; i < 3; i++) {
                int userX = entrada.nextInt();
                int userY = entrada.nextInt();

                if (localizacao[userX][userY] == true) {
                    System.out.println("Perdeu!");
                    break;
                } else {
                    System.out.println("Digite a próxima localização");
                };

            }
            System.out.println("Ganhou!");
            ganhou = true;
        }while(ganhou == false);
    }

}
