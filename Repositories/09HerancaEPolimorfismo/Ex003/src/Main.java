public class Main {
    static void main(String[] args) {

        // criando instâncias
        Brownie b1 = new BrownieNutella("Brownie de nutella", 10, "Nutella");
        Brownie b2 = new BrownieDoceDeLeite("Brownie de doce de leite", 10, "Doce de leite");
        Brownie b3 = new BrownieCafe("Brownie de café", 10, "Café");

        // Criando compradores
        Comprador c1 = new Comprador("Eduardo", 100);
        Comprador c2 = new Comprador("Eduardo", 5);   // comprador sem saldo

        // Chamando os métodos do comprador
        c1.efetuarCompra(b1);       // comprador compra um brownie de nutella
        c2.efetuarCompra(b3);       // comprador sem saldo para comprar brownie de café

    }
}
