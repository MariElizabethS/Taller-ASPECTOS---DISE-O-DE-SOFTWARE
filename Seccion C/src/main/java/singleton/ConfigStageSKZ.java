package singleton;

//Configuracion compartida de StageSKZ. No contiene logica Singleton.
public class ConfigStageSKZ {
    private final String nombreAplicacion = "StageSKZ";
    private final String moneda = "USD";
    private final double comisionServicio = 2.50;
    private final int maxEntradasPorCompra = 5;

    // El constructor privado impide que los clientes creen otras instancias.
    private ConfigStageSKZ() {
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    public String getMoneda() {
        return moneda;
    }

    public double getComisionServicio() {
        return comisionServicio;
    }

    public int getMaxEntradasPorCompra() {
        return maxEntradasPorCompra;
    }
}
