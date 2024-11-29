package interfaces;

import model.conta.Conta;

import java.util.List;

public interface RepositorioContas {
    void inserirConta(Conta conta);
    void alterarConta(Conta conta);
    void excluirConta(String numConta);
    Conta buscarContaPorNumConta(String numConta);
    List<Conta> listarContas();
}
