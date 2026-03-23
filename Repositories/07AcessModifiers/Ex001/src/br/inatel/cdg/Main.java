package br.inatel.cdg;

public class Main {
    static void main(String[] args) {

        Cliente cliente1 = new Cliente("Eduardo", 123456789-10);    // instancia de cliente

        Conta conta1 = new Conta(1, 2500, 2400, cliente1);  // instancia de conta

        conta1.mostrarInfo();           // Mostrar info da conta antes das modificações

        conta1.sacar(3000);     // exemplo de saque maior que o limite
        conta1.sacar(1500);     // exemplo de saque correto
        conta1.deposito(1000);  // exemplo de depósito
        conta1.sacar(2100);     // exemplo de saque falho

        conta1.mostrarInfo();          // Mostrar info da conta depois das modificações
    }
}
