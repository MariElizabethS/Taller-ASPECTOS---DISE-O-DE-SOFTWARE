import singleton.ConfigStageSKZ;

public class Main {
    public static void main(String[] args) {
        ConfigStageSKZ config1 = ConfigStageSKZ.getInstancia();
        ConfigStageSKZ config2 = ConfigStageSKZ.getInstancia();
        ConfigStageSKZ config3 = ConfigStageSKZ.getInstancia();

        System.out.println("--- Seccion C: Singleton con AspectJ ---");
        System.out.println("Nombre de la aplicacion: " + config1.getNombreAplicacion());
        System.out.println("Moneda: " + config1.getMoneda());
        System.out.println("Comision por servicio: $" + config1.getComisionServicio());
        System.out.println("Maximo de entradas por compra: " + config1.getMaxEntradasPorCompra());
        System.out.println("config1 == config2: " + (config1 == config2));
        System.out.println("config2 == config3: " + (config2 == config3));
    }
}
