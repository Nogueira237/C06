import loja.cliente.Cliente;
import loja.pc.Computador;
import loja.pc.componentes.HardwareBasico;
import loja.pc.componentes.MemoriaUSB;
import loja.pc.componentes.SistemaOperacional;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

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


        // cliente teste
        Cliente cliente1 = new Cliente("Tester", "123.456.789-10");

        // contadores
        int cont = 0, comp1 = 0, comp2 = 0, comp3 = 0;
        Scanner entrada = new Scanner(System.in);

        // interface de compra
        System.out.println("-----Computadores disponíveis-----");
        System.out.println("Computador 1: R$597");
        System.out.println("Computador 2: R$1831");
        System.out.println("Computador 3: R$6275");
        System.out.println("-----Para escolher digite [1], [2] ou [3]-----");
        System.out.println("-----Para finalizar digite [0]-----");

        // lógica de compra
        int op;
        do{
            op = entrada.nextInt();     // seleciona pc 1,2,3 ou finaliza o pedido (0)

            if(op == 1){
                cliente1.addComputador(computador1);
                cont++;     // contador para comprar no minimo 2 computadores
                comp1++;    // contador para controle de quantos pcs do tipo 1 foram comprados pelo cliente
            }
            else if(op == 2){
                cliente1.addComputador(computador2);
                cont++;
                comp2++;
            }
            else if(op == 3){
                cliente1.addComputador(computador3);
                cont++;
                comp3++;
            }
            else if(op == 0 && cont < 2){
                System.out.println("É necessário comprar no mínimo 2 computadores!");   // tenta finalizar sem ter comprado 2 pcs
            }
            else if(op == 0 && cont >= 2){                      // compra deu certo
                System.out.println("Finalizando pedido...");
                System.out.println("Você comprou um total de " + comp1 + " computadores do tipo 1, " + comp2 + " computadores do tipo 2 e " +
                        comp3 + " computadores do tipo 3.");
                System.out.println("Preço final: R$" + cliente1.calculaTotalCompra());
            }
            else{
                System.out.println("Erro! Número digitado fora do intervalo aceito [0-3]");
            };

        }while(op != 0 || cont < 2);

    entrada.close();
    }
}
