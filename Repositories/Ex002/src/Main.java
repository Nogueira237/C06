    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.print("Insira a NPA: ");
            int NPA = entrada.nextInt();

            if(NPA >= 60){
                System.out.println("Passou | NFA = " + NPA);
            }
            else if(NPA < 30){
                System.out.println("Reprovado direto | NFA = " + NPA);
            }
            else{
                System.out.print("Não passou, insira a NP3: ");
                int NP3 = entrada.nextInt();
                int NFA = (NPA + NP3)/2;
                if (NFA >= 50) {
                    System.out.println("Passou | NFA = " + NFA);
                }
                else{
                    System.out.println("Reprovado | NFA = " + NFA);
                }
            }
            entrada.close();
        }
    }
