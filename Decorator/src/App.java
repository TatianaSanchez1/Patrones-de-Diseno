public class App {
    public static void main(String[] args) throws Exception {
        VistaVehiculo vistaVehiculo = new VistaVehiculo();
        ModeloDecorador modeloDecorador = new ModeloDecorador(vistaVehiculo);
        MarcaDecorador marcaDecorador = new MarcaDecorador(modeloDecorador);
        marcaDecorador.visualiza();
    }
}
