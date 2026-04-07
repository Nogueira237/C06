public class Main {
    static void main(String[] args) {

        // criando instâncias
        Brownie b1 = new BrownieNutella("Brownie de nutella", 10, "Nutella");
        Brownie b2 = new BrownieDoceDeLeite("Brownie de doce de leite", 10, "Doce de leite");
        Brownie b3 = new BrownieCafe("Brownie de café", 10, "Café");

        // Chamando os métodos
        b1.addCarrinhoDeCompras();
        b2.addCarrinhoDeCompras();
        b3.addCarrinhoDeCompras();
    }
}
