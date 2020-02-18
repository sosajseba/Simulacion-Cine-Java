package cine;

/**
 *
 * @author sosaj
 */
public class Sala {

    private double precio;
    private Pelicula pelicula;
    private Asiento[][] asientos;

    public Sala(int filas, int columnas, double precio, Pelicula pelicula) {

        this.asientos = new Asiento[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        llenarSala();

    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    private void llenarSala() {

        int fila = asientos.length;
        for (Asiento[] asiento : asientos) {
            for (int j = 0; j < asientos[0].length; j++) {
                asiento[j] = new Asiento((char) ('A' + j), fila);
                fila--;
            }
        }

    }

    public boolean estaLibre(Asiento a) {

        return a.getEspectador() == null;

    }

    public void mostrarEspectadores() {

        System.out.println("Lista de espectadores con dinero suficiente: ");
        System.out.println("");
        
        for (Asiento[] asiento : asientos) {
            for (int j = 0; j < asientos[0].length; j++) {
                System.out.println(asiento[j].getEspectador());
            }
        }

    }
    
}
