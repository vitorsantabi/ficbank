package model.pessoa;

public class Funcionario extends Pessoa {
    private String cnpj;
    private String nomeFantasia;

    public Funcionario(String nome, Integer telefone, String email, String endereco) {
        super(nome, telefone, email, endereco);
    }

    public Funcionario(){
        super();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}
