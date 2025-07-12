

public class GestorTramitesSingleton {
    private static GestorTramitesSingleton instancia;
    private ListaDoble<Expediente> listaExpedientes;

    private GestorTramitesSingleton() {
        listaExpedientes = new ListaDoble<>();
    }

    public static GestorTramitesSingleton getInstancia() {
        if (instancia == null) {
            instancia = new GestorTramitesSingleton();
        }
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
    public java.util.List<Expediente> obtenerExpedientes() {
    java.util.List<Expediente> lista = new java.util.ArrayList<>();
    Nodo<Expediente> actual = listaExpedientes.getCabeza();
    while (actual != null) {
        lista.add(actual.getDato());
        actual = actual.getSiguiente();
    }
    return lista;
}

    public int obtenerCantidadExpedientes() {
    int contador = 0;
    Nodo<Expediente> actual = listaExpedientes.getCabeza();
    while (actual != null) {
        contador++;
        actual = actual.getSiguiente();
    }
    return contador;
}

}

