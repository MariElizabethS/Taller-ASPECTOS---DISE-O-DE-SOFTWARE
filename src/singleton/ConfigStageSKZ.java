package singleton;

public class ConfigStageSKZ {

    private static final ConfigStageSKZ objetoUnico = new ConfigStageSKZ();

    private final String nombreAplicacion = "StageSKZ";
    private final String moneda = "USD";
    private final double comisionServicio = 2.50;
    private final int maxEntradasPorCompra = 5;

    private ConfigStageSKZ() {
    }

    public static ConfigStageSKZ getInstancia() {
        return objetoUnico;
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

