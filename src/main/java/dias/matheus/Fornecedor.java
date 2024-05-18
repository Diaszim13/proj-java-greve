package dias.matheus;

public class Fornecedor extends Pessoa {
    private int idFornecedor;

    public Fornecedor(int idPessoa, String cpf, String nome, String rua, String bairro, String cidade, String telefone, String email, boolean isAdmin) {
        super(idPessoa, cpf, nome, rua, bairro, cidade, telefone, email, isAdmin);
    }
}
