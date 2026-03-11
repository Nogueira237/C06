import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        while(true){
            // Matriz int para o campo minado
            int[][] localizacao;
            localizacao = new int[2][2];

            // Preenchendo a matriz com false
            for (int i = 0; i < localizacao.length; i++){
                for (int j = 0; j < localizacao[i].length; j++){
                    localizacao[i][j] = 0;
                };
            };

            // Gerando mina aleatoria
            int x = rand.nextInt(2);
            int y = rand.nextInt(2);
            localizacao[x][y] = -1;       // posicao da mina


            boolean perdeu = false;


            for(int i = 0;i < 3; i++){

                System.out.println("Digite X e Y: ");
                int userX = entrada.nextInt();
                int userY = entrada.nextInt();
                if (localizacao[userX][userY] == -1) {
                    System.out.println("Perdeu!");
                    perdeu = true;
                    break;
                }
                else {
                    System.out.println("Seguro!");
                    localizacao[userX][userY] = 1;
                };
            }

            if (!perdeu) {
                System.out.println("Ganhou!");
                break;
            };


        }
        entrada.close();
    }

}
