import adapter.VentaEntradas;
import adapter.TicketGo;
import adapter.TicketGoAdapter;
import singleton.ConfigStageSKZ;

public class Main {
    public static void main(String[] args) {

        // Para la implemetación de ADAPTER
        TicketGo plataforma = new TicketGo();
        VentaEntradas venta = new TicketGoAdapter(plataforma);

        venta.comprarEntrada("Stray Kids");
        venta.comprarEntrada("Taylor Swift");
        venta.comprarEntrada("One Direction");
        System.out.println();

        //Para la implementación de Singleton
        
        ConfigStageSKZ config1 = ConfigStageSKZ.getInstancia();
        ConfigStageSKZ config2 = ConfigStageSKZ.getInstancia();

        System.out.println("Nombre de la aplicación: " + config1.getNombreAplicacion());
        System.out.println("Moneda: " + config1.getMoneda());
        System.out.println("Comisión por servicio: $" + config1.getComisionServicio());
        System.out.println("Máximo de entradas por compra: " + config1.getMaxEntradasPorCompra());

        System.out.println("¿Ambas son el mismo objeto? " + (config1 == config2));

    }
}
