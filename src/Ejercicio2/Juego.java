
package Ejercicio2;

import java.util.List;


public class Juego {
    private RevolverAgua r1;
    private List<Jugador> jug1;

    @Override
    public String toString() {
        return "Juego{" + "r1=" + r1 + ", jug1=" + jug1 + '}';
    }

    public RevolverAgua getR1() {
        return r1;
    }

    public void setR1(RevolverAgua r1) {
        this.r1 = r1;
    }

    public List<Jugador> getJug1() {
        return jug1;
    }

    public void setJug1(List<Jugador> jug1) {
        this.jug1 = jug1;
    }

    public Juego(RevolverAgua r1, List<Jugador> jug1) {
        this.r1 = r1;
        this.jug1 = jug1;
    }

    public Juego() {
    }
}
