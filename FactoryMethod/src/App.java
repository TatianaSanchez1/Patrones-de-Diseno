import Cliente.*;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente;

        cliente = new ClienteContado();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);

        cliente = new ClienteCredito();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);
    }
}
