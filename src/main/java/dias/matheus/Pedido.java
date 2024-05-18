package dias.matheus;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Pedido {

    private int idPedido;
    private int clienteId;
    private int funcionarioId;
    private Timestamp dataPedido;
    private Timestamp dataEntrega;
    private BigDecimal valorTotal;
    private String status;
}
