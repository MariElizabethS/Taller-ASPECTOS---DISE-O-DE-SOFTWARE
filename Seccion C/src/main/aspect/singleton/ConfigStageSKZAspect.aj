package singleton;

/**
 * Implementacion AOP del Singleton.
 * privileged permite llamar al constructor privado de ConfigStageSKZ.
 */
public privileged aspect ConfigStageSKZAspect {

    // El aspecto (no ConfigStageSKZ) administra la instancia unica.
    private static final ConfigStageSKZ instanciaUnica = new ConfigStageSKZ();

    // Declaracion intertipo: agrega getInstancia() a ConfigStageSKZ.
    public static ConfigStageSKZ ConfigStageSKZ.getInstancia() {
        return ConfigStageSKZAspect.instanciaUnica;
    }
}
