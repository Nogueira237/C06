public class Main {

    static void main() {

        Arma arma1 = new Arma("Pistola", 100, 50, "Da tiro");
        Personagem perso1 = new Personagem("Eduardo", 80, arma1);

        arma1.mostraInfoArma();
        perso1.mostrarInfoPerso();

        perso1.usarArma();
        perso1.mostrarInfoPerso();

    }
}
