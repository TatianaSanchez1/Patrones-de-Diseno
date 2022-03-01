package Cliente;
import Pedido.Pedido;
import Pedido.PedidoContado;

public class ClienteContado extends Cliente {
    protected Pedido creaPedido(double importe) {
        return new PedidoContado(importe);
    }
}
