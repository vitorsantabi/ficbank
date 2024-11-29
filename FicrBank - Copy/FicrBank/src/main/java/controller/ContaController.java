package controller;

import interfaces.RepositorioContas;
import model.conta.Conta;
import model.conta.Poupanca;
import repository.RepositorioContasList;
import repository_jpa.ContasRepository;

import java.util.List;
import java.util.Scanner;

public class ContaController {
    RepositorioContas contas;
    Conta conta = new Conta();
    Scanner input = new Scanner(System.in);
    String numConta;
    int id, agencia;

    public void criarConta() {
        contas = new RepositorioContasList();
        System.out.print("Digite o numero da conta: ");
        numConta = input.next();
        conta.setNumeroConta(numConta);
        System.out.print("Digite o numero da agencia: ");
        agencia = input.nextInt();
        conta.setAgencia(agencia)   ;
        conta.setSaldo(0.00);
        conta.setChequeEspecial(100.00);
        //contas.inserirConta(conta);
        ContasRepository.saveAccount(conta);
    }

    public void buscarContaPorNumero(){
        System.out.print("Digite a conta a ser procurada: ");
        numConta = input.next();
        System.out.println("Informações da conta: "
                + contas.buscarContaPorNumConta(numConta));
    }

    public void buscarContaPorId(){
        System.out.print("Digite o Id da conta a ser procurada: ");
        id = input.nextInt();
        System.out.println("Conta: " + ContasRepository.getById(id));

    }

    public void removerContaPorId(){
        System.out.print("Digite o ID da conta a ser procurada: ");
        id = input.nextInt();
        ContasRepository.removeAccountById(id);
        System.out.println("Conta removida com sucesso!");
    }

    public void removerContaPorNumero(){
        System.out.print("Digite a conta a ser removida: ");
        numConta = input.next();
        contas.excluirConta(numConta);
        System.out.println("Conta removida com sucesso!");
    }

    public void listarTodasContas() {
//        System.out.println("Contas: " + contas.listarContas());
        System.out.println("Lista de Contas: ");
        for (Conta contas: ContasRepository.listAll()){
            System.out.println(contas);
        }
    }


}
