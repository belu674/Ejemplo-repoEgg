package Ejercicio2;

import java.util.Scanner;

public class JugadorService {

    RevolverAguaService ras = new RevolverAguaService();

    public boolean disparo(Jugador jugador1, RevolverAgua r) {
        if (ras.mojar(r)) {
            jugador1.setMojado(true);
            return true;
        } else {
            jugador1.setMojado(false);
            ras.siguienteChorro(r);
            return false;
        }
    }

}
