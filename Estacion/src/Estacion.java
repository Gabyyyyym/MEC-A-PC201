
public class Estacion {

 
    private String nombre;
    private int capacidadMaxima;
    private int cantidadPasajeros;

    public Estacion(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadPasajeros = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void ingresarPasajeros(int cantidad) {
        if (cantidad + cantidadPasajeros > capacidadMaxima) {
            cantidadPasajeros = capacidadMaxima;
        } else {
            cantidadPasajeros += cantidad;
        }
    }

    public void salirPasajeros(int cantidad) {
        if (cantidad > cantidadPasajeros) {
            cantidadPasajeros = 0;
        } else {
            cantidadPasajeros -= cantidad;
        }
    }
}