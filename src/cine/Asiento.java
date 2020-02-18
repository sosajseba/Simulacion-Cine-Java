package cine;

/**
 *
 * @author sosaj
 */
public class Asiento {
    
    private int fila;
    private char columna;
    private Espectador espectador;
    
    public Asiento() {
    }

    public Asiento(char columna,int fila) {
        this.fila = fila;
        this.columna = columna;
        this.espectador = null;
    }

    public Espectador getEspectador() {
        return espectador;
    }
    
    public int getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }
    
}
