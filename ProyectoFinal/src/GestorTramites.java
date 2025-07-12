


public class GestorTramites {
    private static GestorTramites instancia;
    private ListaDoble<Expediente> listaExpedientes;

    private GestorTramites() {
        listaExpedientes = new ListaDoble<>();
    }

    public static GestorTramites getInstancia() {
        if (instancia == null)
            instancia = new GestorTramites();
        return instancia;
    }

    public void registrarExpediente(Expediente e) {
        listaExpedientes.insertar(e);
        System.out.println("Expediente registrado: " + e);
    }

    public void mostrarExpedientes() {
        System.out.println("Lista de expedientes:");
        listaExpedientes.mostrar();
    }

    public boolean estaVacio() {
        return listaExpedientes.estaVacia();
    }
}


