package cine;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sosaj
 */
public class Main {

    public static void main(String[] args) {

        Pelicula pelicula = new Pelicula("Avengers", "Director 1", 200, 16);

        List<Espectador> espectadores = new ArrayList<>();

        Sala sala = new Sala(8, 9, 300, pelicula);

        llenarEspectadores(espectadores);

        llenarSala(espectadores, sala);

        sala.mostrarEspectadores();

    }

    private static void llenarEspectadores(List<Espectador> espectadores) {

        int edad;
        int dinero;

        System.out.println("Lista de 200 espectadores aleatoria,"
                + " con edad y dinero aleatorios:");
        System.out.println("");
        
        for (int i = 0; i < 200; i++) {

            edad = (int) (Math.random() * (50 - 5 + 1) + 5);
            dinero = (int) (Math.random() * (600 - 200 + 1) + 200);
            Espectador e = new Espectador(("Espectador " + i), edad, dinero);
            espectadores.add(e);
            System.out.println(e);

        }
        
        System.out.println("------------------------------------ ------------");

    }

    private static void llenarSala(List<Espectador> espectadores, Sala sala) {

        while (faltaLlenar(sala)) {

            for (int k = 0; k < espectadores.size(); k++) {

                int f = (int) (Math.random() * (7 - 0 + 1) + 0);
                int c = (int) (Math.random() * (8 - 0 + 1) + 0);

                if (sala.estaLibre(sala.getAsientos()[f][c]) 
                        && espectadores.get(k).tieneDinero(300)
                        && espectadores.get(k).tieneEdad(16)) {

                    sala.getAsientos()[f][c].setEspectador(espectadores.get(k));
                    k++;

                }

            }
        }

    }

    private static boolean faltaLlenar(Sala sala) {

        int cont = 0;

        for (Asiento[] asiento : sala.getAsientos()) {
            for (int j = 0; j < sala.getAsientos()[0].length; j++) {
                if (sala.estaLibre(asiento[j])) {

                    cont++;

                }
            }
        }

        return cont > 0;

    }

}
