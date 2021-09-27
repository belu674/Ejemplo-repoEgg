package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuegoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    JugadorService jugador1 = new JugadorService();
    RevolverAguaService ras = new RevolverAguaService();
    Juego juego1 = new Juego();

    public List<Jugador> llenarJuego() {
        juego1.setR1(ras.llenarRevolver());
        System.out.println(juego1.getR1());
        List<Jugador> listaJugadores = new ArrayList();
        listaJugadores.add(new Jugador (1,"Jugador 1",false));
        listaJugadores.add(new Jugador (2,"Jugador 2",false));
        listaJugadores.add(new Jugador (3,"Jugador 3",false));
        listaJugadores.add(new Jugador (4,"Jugador 4",false));
        listaJugadores.add(new Jugador (5,"Jugador 5",false));
        listaJugadores.add(new Jugador (6,"Jugador 6",false));
        juego1.setJug1(listaJugadores);
        return listaJugadores;
    }

    public void ronda(List<Jugador> listaJugadores) {
        for (Jugador listaJugadore : listaJugadores) {
            if (jugador1.disparo(listaJugadore, juego1.getR1())) {
                listaJugadore.setMojado(true);
                System.out.println("El jugador se mojó");
                break;
            } else {
                System.out.println("Continúa el juego");
            }
        }
    }

}
