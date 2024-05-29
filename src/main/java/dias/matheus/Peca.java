package dias.matheus;

import java.math.BigDecimal;

public class Peca {

    private int idPeca;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Fornecedor fornecedor;

    public Peca(int idPeca, String nome, String descricao, BigDecimal preco, Fornecedor fornecedorId) {
        this.idPeca = idPeca;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.fornecedor = fornecedorId;
    }

    public int getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(int idPeca) {
        this.idPeca = idPeca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedorId() {
        return fornecedor;
    }

    public void setFornecedorId(Fornecedor fornecedorId) {
        this.fornecedor = fornecedorId;
    }

    @Override
    public String toString() {
        return "Peca{" +
                "idPeca=" + idPeca +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", fornecedorId=" + fornecedor +
                '}';
    }
}
