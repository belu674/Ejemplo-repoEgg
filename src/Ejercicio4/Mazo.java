
package ejercicio4;

import java.util.List;


public class Mazo {
    private List <Carta> mazoDeCartas;

    public Mazo() {
    }

    public Mazo(List<Carta> mazoDeCartas) {
        this.mazoDeCartas = mazoDeCartas;
    }

    public List<Carta> getMazoDeCartas() {
        return mazoDeCartas;
    }

    public void setMazoDeCartas(List<Carta> mazoDeCartas) {
        this.mazoDeCartas = mazoDeCartas;
    }

    @Override
    public String toString() {
        return "Mazo{" + "mazoDeCartas=" + mazoDeCartas + '}';
    }
    
}
