package dias.matheus;

public class Funcionario extends Pessoa {

    private Boolean isAdmin;

    public Funcionario(int idPessoa, String cpf, String nome, String rua, String bairro, String cidade, String telefone, String email, boolean isAdmin) {
        super(idPessoa, cpf, nome, rua, bairro, cidade, telefone, email);
    }


    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "isAdmin=" + isAdmin +
                '}';
    }
}
