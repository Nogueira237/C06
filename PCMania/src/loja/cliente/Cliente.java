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
    public float calculaTotalCompra(){
        float res = 0;
        for(int i = 0;i < computadores.length;i++){             // ".lenght" para garantir que não haverá elementos null
            res += computadores[i].getPreco();
        };
        return res;
    };
}
