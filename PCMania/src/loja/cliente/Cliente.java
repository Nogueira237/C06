package loja.cliente;

import loja.pc.Computador;
import util.ProcessarPedido;

public class Cliente {

    // Atributos
    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int j;

    // Construtor
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10];     // no maximo 10, mas pode ser qualquer valor > 2
        this.j = 0;
        // para garantir no minimo 2 pcs
    };

    // Métodos
    public void addComputador(Computador pc1){      // obriga no minimo 2 pcs
        computadores[j] = pc1;
        j++;
    };
    // Getter para o array de computadores

    public Computador[] getComputadores() {
        return computadores;
    };

    public float calculaTotalCompra(){
        float res = 0;
        for(int i = 0;i < j;i++){             // ".lenght" para garantir que não haverá elementos null
            res += computadores[i].getPreco();
        };
        ProcessarPedido.processaPedido(this);
        return res;
    };
}
