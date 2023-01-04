package utils;

import utils.Conta;
import model.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente newCliente) {
        super(newCliente);
    }

    @Override
    public String tipoDeConta() {
        return "------ CONTA POUPANCA ------";
    }
}
