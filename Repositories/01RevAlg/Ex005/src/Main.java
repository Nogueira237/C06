import java.util.Random;
import java.util.Scanner;

public class Main {

    static void main() {

        boolean acertou = false;
        Scanner entrada = new Scanner(System.in);

        int numGerado, numAdivinhado;

        Random rand = new Random();
        numGerado = rand.nextInt(10) + 1;
        do {
            System.out.print("Adivinhe o número: ");
            numAdivinhado = entrada.nextInt();

            if (numAdivinhado == numGerado) {
                System.out.println("Acertou");
                acertou = true;
                break;
            }

        }while(!acertou);

        //entrada.close();
    }
}
