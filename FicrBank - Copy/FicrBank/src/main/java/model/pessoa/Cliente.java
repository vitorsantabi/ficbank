package model.pessoa;

public class Cliente extends Pessoa {
    private String cpf;

    public Cliente(String nome, Integer telefone, String email, String endereco) {
        super(nome, telefone, email, endereco);
    }

    public Cliente(){
        super();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
