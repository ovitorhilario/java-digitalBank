package utils;
import intefaces.IConta;
import model.Cliente;

public abstract class Conta implements IConta {
    private final String agencia = "007";
    private static int COUNT_NUMERO = 0;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente newCliente){
        this.cliente = newCliente;
        this.numero = COUNT_NUMERO++;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta toConta, double valor) {
        this.saldo -= valor;
        toConta.depositar(valor);
    }

    public abstract String tipoDeConta();

    public void imprimirDadosDaConta(){

        System.out.println(
                tipoDeConta() + "\n" +
                "Name: " + this.cliente.getName() + "\n" +
                "Age: " + this.cliente.getAge() + "\n" +
                "Agencia: " + this.agencia + "\n" +
                "Numero da Conta: " + this.numero + "\n" +
                "Saldo: " + this.saldo
        );
    }

}
