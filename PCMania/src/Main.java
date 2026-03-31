import loja.cliente.Cliente;
import loja.pc.Computador;
import loja.pc.componentes.HardwareBasico;
import loja.pc.componentes.MemoriaUSB;
import loja.pc.componentes.SistemaOperacional;

public class Main {
    static void main(String[] args) {

        // -------- Criando os computadores ----------
        // ----- Promoção 1

        // componentes
        MemoriaUSB memoriaUSB1 =  new MemoriaUSB("Pen-drive", 16);
        SistemaOperacional sistemaOperacional1 = new SistemaOperacional("macOS Sequoia", 64);
        HardwareBasico hardwareBasico11 = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico hardwareBasico12 = new HardwareBasico("Memoria RAM", 8);
        HardwareBasico hardwareBasico13 = new HardwareBasico("HD", 500);

        HardwareBasico[] hardwareBasico1 = {hardwareBasico11, hardwareBasico12, hardwareBasico13};    // junta todos os hardwares em um array

        Computador computador1 = new Computador("Apple", 597, sistemaOperacional1, hardwareBasico1);  // primeiro computador

        computador1.setMemoriaUSB(memoriaUSB1);     // adiciona a memoriaUSB depois, pois pode ter 0 ou 1 memorias no computador

        // ----- Promoção 2

        // componentes
        MemoriaUSB memoriaUSB2 =  new MemoriaUSB("Pen-drive", 32);
        SistemaOperacional sistemaOperacional2 = new SistemaOperacional("Windows 8", 64);
        HardwareBasico hardwareBasico21 = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico hardwareBasico22 = new HardwareBasico("Memoria RAM", 16);
        HardwareBasico hardwareBasico23 = new HardwareBasico("HD", 1000);       // a capacidade está em GB para padronizar nos 3 computadores

        HardwareBasico[] hardwareBasico2 = {hardwareBasico21, hardwareBasico22, hardwareBasico23};    // junta todos os hardwares em um array

        Computador computador2 = new Computador("Samsung", 597+1234, sistemaOperacional2, hardwareBasico2);  // segundo computador

        computador2.setMemoriaUSB(memoriaUSB2);     // adiciona a memoriaUSB depois, pois pode ter 0 ou 1 memorias no computador

        // ----- Promoção 3

        // componentes
        MemoriaUSB memoriaUSB3 =  new MemoriaUSB("HD Externo", 1000);       // Em GB para padronizar
        SistemaOperacional sistemaOperacional3 = new SistemaOperacional("Windows 10", 64);
        HardwareBasico hardwareBasico31 = new HardwareBasico("Core i7", 4500);
        HardwareBasico hardwareBasico32 = new HardwareBasico("Memoria RAM", 32);
        HardwareBasico hardwareBasico33 = new HardwareBasico("HD", 2000);       // a capacidade está em GB para padronizar nos 3 computadores

        HardwareBasico[] hardwareBasico3 = {hardwareBasico31, hardwareBasico32, hardwareBasico33};    // junta todos os hardwares em um array

        Computador computador3 = new Computador("Dell", 597+5678, sistemaOperacional3, hardwareBasico3);  // terceiro computador

        computador3.setMemoriaUSB(memoriaUSB3);     // adiciona a memoriaUSB depois, pois pode ter 0 ou 1 memorias no computador


        // Criando pedido do cliente 1
        Computador[] computadores1 = {computador1, computador2};
        Computador[] computadores2 = {computador1, computador3};
        Computador[] computadores3 = {computador2, computador3};
        Computador[] computadores4 = {computador1, computador2, computador3};

        Cliente cliente1 = new Cliente("Eduardo", "123.456.789-10");
        Cliente cliente2 = new Cliente("Joao", "456.789.123-09");
        Cliente cliente3 = new Cliente("Pedro", "789.123.456-08");
        Cliente cliente4 = new Cliente("Felipe", "123.123.123-07");

        cliente1.addComputador(computador1);
        cliente1.addComputador(computador2);

        cliente2.addComputador(computador1);
        cliente2.addComputador(computador2);
        cliente2.addComputador(computador3);

        cliente3.addComputador(computador2);
        cliente3.addComputador(computador3);

        System.out.println(cliente1.calculaTotalCompra());
        System.out.println(cliente2.calculaTotalCompra());
        System.out.println(cliente3.calculaTotalCompra());
    }
}
