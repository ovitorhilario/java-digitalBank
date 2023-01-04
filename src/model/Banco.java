package model;// banco com contas corrente e poupanca que possuam entr si ->><
// deposito, saque, transferencia (cc e pp)

import utils.Conta;
import utils.ContaCorrente;
import utils.ContaPoupanca;

public class Banco {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[10];

        clientes[0] = new Cliente("Geraldo", 43);
        clientes[1] = new Cliente("Raissa", 18);
        clientes[2] = new Cliente("Tulio", 24);
        clientes[3] = new Cliente("Marcelo", 54);

        Conta conta0 = new ContaCorrente(clientes[0]);
        Conta conta1 = new ContaPoupanca(clientes[1]);
        Conta conta2 = new ContaCorrente(clientes[2]);
        Conta conta3 = new ContaPoupanca(clientes[3]);
        Conta conta4 = new ContaCorrente(clientes[4]);

        conta0.depositar(1250.50);
        conta0.sacar(250.50);

        conta0.transferir(conta1, 350.0);

        conta0.imprimirDadosDaConta();
        conta1.imprimirDadosDaConta();
    }

}
