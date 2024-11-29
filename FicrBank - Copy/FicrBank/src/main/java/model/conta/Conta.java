package model.conta;

import jakarta.persistence.*;

@Entity
@Table(name="conta")
@MappedSuperclass
public class Conta {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="numero_conta")
    private String numeroConta;
    @Column(name="agencia")
    private int agencia;
    @Column(name="saldo")
    private double saldo;
    @Column(name="cheque_especial")
    private double chequeEspecial;

    public Conta (String numeroConta, int agencia, double saldo, double chequeEspecial) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public Conta (double saldo, double chequeEspecial) {
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public Conta(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void debitar( double valor){
        this.saldo -= valor;
    }

    public String toString(){
        return "[Conta: " + this.getNumeroConta() + " - "
                + "Agencia: " + this.getAgencia() + " - "
                + "Saldo: " + this.getSaldo() + " - "
                + "ChequeEspecial: " + this.getChequeEspecial() + "]";
    }
}
