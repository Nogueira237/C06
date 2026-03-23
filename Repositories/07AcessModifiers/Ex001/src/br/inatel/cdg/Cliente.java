package br.inatel.cdg;

public class Cliente {

    // Atributos
    private String nome;
    private long cpf;

    // Construtor
    public Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    };

    // Getters
    public String getNome() {
        return nome;
    };
    public long getCpf(){
        return cpf;
    };

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    };
    public void setCpf(long cpf) {
        this.cpf = cpf;
    };
}
