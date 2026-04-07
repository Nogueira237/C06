public class BrownieDoceDeLeite extends Brownie{


    // Métodos
    public BrownieDoceDeLeite(String nome, double preco, String sabor){
        super(nome,preco,sabor);
    };

    public void adicionaDoceDeLeite(){
        System.out.println("Doce de leite foi adicionado no brownie.");
    };

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de doce de leite adicionado ao carrinho");
    };
}
