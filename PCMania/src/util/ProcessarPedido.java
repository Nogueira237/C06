package util;

import loja.cliente.Cliente;

public class ProcessarPedido {

    // Atributos
    // nenhum

    // Construtor
    // nao tem

    // Metodos
    public static void processaPedido(Cliente cliente){
        cliente.getComputadores();          // recebe o array de computadores do cliente
        System.out.println("Pedido enviado...");
    };
}
