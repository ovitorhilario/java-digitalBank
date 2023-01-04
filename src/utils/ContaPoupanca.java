package utils;

import utils.Conta;
import model.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente newCliente) {
        super(newCliente);
    }

    @Override
    public String tipoDeConta() {
        return "------ CONTA CORRENTE ------";
    }
}
