package intefaces;
import utils.Conta;
public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta toConta, double valor);
}
