package dias.matheus;

public class ItensPedido {

    private Long idItem;

    private Peca peca;

    public ItensPedido(Long idItem, Peca peca) {
        this.idItem = idItem;
        this.peca = peca;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }
}
