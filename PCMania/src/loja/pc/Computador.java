package loja.pc;

import loja.pc.componentes.HardwareBasico;
import loja.pc.componentes.MemoriaUSB;
import loja.pc.componentes.SistemaOperacional;

public class Computador {

    // Atributos
    private String marca;
    private float preco;
    private MemoriaUSB memoriaUSB;                      // Agregação memoriaUSB
    private SistemaOperacional sistemaOperacional;      // Composição S.O
    private HardwareBasico[] hardwareBasico;            // COmposição Hardware básico

    // Construtor
    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional){
        this.marca = marca;
        this.preco = preco;
        this.memoriaUSB = null;                             // pode ser 0 (no naso, null)
        this.sistemaOperacional =   sistemaOperacional;     // obrigatório
        this.hardwareBasico = new HardwareBasico[3];        // obrigatório

    };

    // Métodos

    // setter para adicionar uma memória se necessário
    public void setMemoriaUSB(MemoriaUSB memoria){
        this.memoriaUSB = memoria;
    };
    // nenhum
};

