public class Main {
    static void main() {

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        p1.nome = "Chris";
        p2.nome = "Pizzoni";

        // Agregação
        kart1.piloto = p2;
        kart2.piloto = p1;

        // Composição
        kart1.motor.cilindradas = "100";        // Motor só existe no kart


    }
}
