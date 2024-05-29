package dias.matheus;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Pedido {

    private int idPedido;
    private Cliente cliente;
    private Funcionario funcionario;
    private Timestamp dataPedido;
    private Timestamp dataEntrega;
    private BigDecimal valorTotal;
    private String status;

    private ArrayList<ItensPedido> itens;

    public Pedido(int idPedido, Cliente cliente, Funcionario funcionario, Timestamp dataPedido, Timestamp dataEntrega, BigDecimal valorTotal, String status, ArrayList<ItensPedido> itens) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Timestamp getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Timestamp dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Timestamp getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Timestamp dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", cliente=" + cliente +
                ", funcionario=" + funcionario +
                ", dataPedido=" + dataPedido +
                ", dataEntrega=" + dataEntrega +
                ", valorTotal=" + valorTotal +
                ", status='" + status + '\'' +
                '}';
    }
}
