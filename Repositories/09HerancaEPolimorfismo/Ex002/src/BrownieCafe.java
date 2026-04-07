public class BrownieCafe extends Brownie{


    // Métodos
    public BrownieCafe(String nome, double preco, String sabor){
        super(nome,preco,sabor);
    };

    public void adicionaCafe(){
        System.out.println("Café foi adicionado no brownie.");
    };

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de café adicionado ao carrinho");
    };
}
