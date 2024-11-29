package model.conta;

public class Salario extends Conta{

    public Salario() {
        super();
    }

    public void creditar(double valor) {
        setSaldo(getSaldo() + valor);
    }
}
