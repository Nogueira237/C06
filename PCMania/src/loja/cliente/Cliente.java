package loja.cliente;

import loja.pc.Computador;

public class Cliente {

    // Atributos
    private String nome;
    private String cpf;
    private Computador[] computadores;

    // Construtor
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[3];
    };

    // Métodos
    public float calcucaTotalCompra(){

    };
}
