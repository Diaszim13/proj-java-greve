package dias.matheus;

import dias.matheus.Enums.StatusNota;

public class NotaFiscal {

    private Long id;

    private Integer numeroNF;

    private Double valor;
    private StatusNota status;

    private Pagamento pagamento;

    public NotaFiscal() {}

    public NotaFiscal(Long id, Integer numeroNF, Double valor, StatusNota status) {
        this.id = id;
        this.numeroNF = numeroNF;
        this.valor = valor;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(Integer numeroNF) {
        this.numeroNF = numeroNF;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public StatusNota getStatus() {
        return status;
    }

    public void setStatus(StatusNota status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "id=" + id +
                ", numeroNF=" + numeroNF +
                ", valor=" + valor +
                ", status=" + status +
                '}';
    }
}
