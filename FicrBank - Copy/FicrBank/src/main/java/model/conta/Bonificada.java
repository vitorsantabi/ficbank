package model.conta;

public class Bonificada extends Conta {
    private double bonus;

    public Bonificada(String numeroConta, int agencia, double saldo, double chequeEspecial ) {
        super(numeroConta, agencia, saldo, chequeEspecial);
    }

    public double getBonus() {
        return bonus;
    }

    public void renderBonus(){
//        super.creditar(this.bonus);
        setSaldo(this.bonus);
        this.bonus = 0;
    }

    public void creditar(double valor){
        this.bonus = this.bonus + (valor * 0.5);
//        super.creditar(valor);
        setSaldo(valor);
    }

}
