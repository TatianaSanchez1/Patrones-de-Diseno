public class App {
    public static void main(String[] args) throws Exception {
        // inicializacion de la documentacion en blanco
        DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
        documentacionEnBlanco.incluye(new OrdenDePedido());
        documentacionEnBlanco.incluye(new CertificadoSesion());
        documentacionEnBlanco.incluye(new SolicitudMatriculacion());
        
        // creacion de documentacion nueva para dos clientes
        DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Martin");
        DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Simon");
        documentacionCliente1.visualiza();
        documentacionCliente2.visualiza();
    }
}
