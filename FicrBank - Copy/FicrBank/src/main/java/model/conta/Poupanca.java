package model.conta;

public class Poupanca extends Conta{

    public Poupanca(String numeroConta, int agencia, double saldo, double chequeEspecial){
        super(numeroConta, agencia, saldo, chequeEspecial);
    }

    public Poupanca(double saldo, double chequeEspecial){
        super(saldo, chequeEspecial);
    }

    public Poupanca(){
        super();
    }


    public void creditar(double valor) {
        setSaldo(getSaldo() + (valor * 0.02));
    }

    public void renderJuros(double taxa){
        double saldoAtual = getSaldo();
        creditar(saldoAtual * taxa);
    }

    public String toString(){
        return super.toString();
    }
}
