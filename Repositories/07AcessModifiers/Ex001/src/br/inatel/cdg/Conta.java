package br.inatel.cdg;

public class Conta {

    // Atributos
    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente;

    // Construtor
    public Conta(int numero, float saldo, float limite, Cliente cliente){
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    };

    // Setters
    public void setSaldo(float saldo){
        this.saldo = saldo;
    };

    // Getters
    public int getNumero(){
        return numero;
    };

    public float getSaldo(){
        return saldo;
    };

    public float getLimite(){
        return limite;
    };



    // Métodos
    public void sacar(float quantia){
        if(quantia > getLimite()){
            System.out.println("Valor do saque maior que o limite!");
            System.out.println("Tentou sacar: " + quantia);
            System.out.println("Limite: " + getLimite() + "\n");
        }
        else if(quantia > this.saldo){
            System.out.println("Valor do saque maior que o saldo!");
            System.out.println("Tentou sacar: " + quantia);
            System.out.println("Saldo disponivel: " + this.saldo + "\n");
        }
        else{
            this.saldo -= quantia;
            System.out.println("Sacou: " + quantia);
            System.out.println("Novo saldo: " + this.saldo + "\n");
        };
    };

    public void deposito(float quantia){

        setSaldo(this.saldo += quantia);
        System.out.println("Depositou: " + quantia);
        System.out.println("Novo saldo: " + getSaldo() + "\n");
    };

    public void mostrarInfo(){
        System.out.println("Usuário: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Número da conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Limite: " + getLimite() + "\n");
    };
}
