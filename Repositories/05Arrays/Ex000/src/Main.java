public class Main {
    static void main() {

        // Cria cantina
        Cantina cantina1 = new Cantina("Cantina do Inatel");

        // Cria instancias de salgado
        Salgado salgado1 = new Salgado("Coxinha");
        Salgado salgado2 = new Salgado("Kibe");
        Salgado salgado3 = new Salgado("Esfirra");

        // Adiciona as instancias de salgado na cantina
        cantina1.addSalgado(salgado1);
        cantina1.addSalgado(salgado2);
        cantina1.addSalgado(salgado3);

        // Mostra os salgados adicionados
        cantina1.mostraInfo();
    }
}
