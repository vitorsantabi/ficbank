package repository;

import interfaces.RepositorioContas;
import model.conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class RepositorioContasList implements RepositorioContas {
    private List<Conta> contas;

    public RepositorioContasList() {
        contas = new ArrayList<Conta>();
    }

    @Override
    public void inserirConta(Conta conta) {
            contas.add(conta);
    }

    @Override
    public void alterarConta(Conta conta) {

    }

    @Override
    public void excluirConta(String numConta) {
        int posicao = -1;
        for (Conta conta: contas) {
            if(conta.getNumeroConta().equals(numConta)) {
                posicao = contas.indexOf(conta);
            }
        }
        if (posicao != -1){
            contas.remove(posicao);
        }
    }

    @Override
    public Conta buscarContaPorNumConta(String numConta) {
        Conta contaProcurada = null;
        for (Conta conta : contas) {
            if(conta.getNumeroConta().equals(numConta)){
                contaProcurada = conta;
            }
        }
        return contaProcurada;
    }

    @Override
    public List<Conta> listarContas() {
        return this.contas;
    }
}
