public class Main {

    static void main() {

        Zumbi zumbi1 = new Zumbi(10, "Joao");
        Zumbi zumbi2 = new Zumbi(5, "Maria");

        System.out.println("Antes de transferir vida:");
        System.out.println("Zumbi 1: " + zumbi1.mostraVida());
        System.out.println("Zumbi 2: " + zumbi2.mostraVida());

        zumbi1.transfereVida(zumbi2, 2);
        System.out.println("Depois de transferir vida: ");

        System.out.println("Zumbi 1: " + zumbi1.mostraVida());
        System.out.println("Zumbi 2: " + zumbi2.mostraVida());
    }
}
