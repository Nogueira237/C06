public class Brownie {

   // Atributos
   protected String nome;
   protected double preco;
   protected String sabor;

   // Métodos
    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    };

    // Métodos
    public void addCarrinhoDeCompras(){
        System.out.println(this.nome + " foi adicionado ao carrinho.");
    };

    public void calculaValorTotalCompra(){
        System.out.println(this.nome + ": R$" + this.preco);
    };

    public void mostraInfo(){
        System.out.println("Informações do brownie:");
        System.out.println("Nome: " + this.nome);
        System.out.println("preço: " + this.preco);
        System.out.println("Sabor: " + this.sabor);
    };
}
