package dias.matheus;

import java.math.BigDecimal;

public class Peca {

    private int idPeca;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private int fornecedorId;

    public Peca(int idPeca, String nome, String descricao, BigDecimal preco, int fornecedorId) {
        this.idPeca = idPeca;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.fornecedorId = fornecedorId;
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

    public int getFornecedorId() {
        return fornecedorId;
    }

    public void setFornecedorId(int fornecedorId) {
        this.fornecedorId = fornecedorId;
    }

    @Override
    public String toString() {
        return "Peca{" +
                "idPeca=" + idPeca +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", fornecedorId=" + fornecedorId +
                '}';
    }
}
