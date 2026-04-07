public class Comprador {

    // Atributos
    private String nome;
    private double saldo;

    // Construtor
    public Comprador(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    };

    // Métodos
    public void efetuarCompra(Brownie brownie){
        if(this.saldo >= brownie.preco){
            System.out.println("Nome do brownie: " + brownie.nome);
            brownie.addCarrinhoDeCompras();
            brownie.calculaValorTotalCompra();
            this.saldo -= brownie.preco;
        }
        else{
            System.out.println("Saldo insuficiente");
        };

    };
}
