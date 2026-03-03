public class Main {

    static void main() {

        Zumbi zumbi1 = new Zumbi(7, "Joao");
        Zumbi zumbi2 = new Zumbi(5, "Maria");

        System.out.println("Antes de perder vida:");
        System.out.println("Zumbi 1: " + zumbi1.mostraVida());
        System.out.println("Zumbi 2: " + zumbi2.mostraVida());

        System.out.println("Foi possivel transferir vida? " + zumbi1.transfereVida(zumbi2, 10));
        System.out.println("Depois de perder vida: ");

        System.out.println("Zumbi 1: " + zumbi1.mostraVida());
        System.out.println("Zumbi 2: " + zumbi2.mostraVida());


    }
}
