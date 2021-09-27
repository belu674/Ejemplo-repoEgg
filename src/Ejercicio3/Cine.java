
package ejercicio3;

import java.util.List;


public class Cine {
    private Pelicula pelicula;
    private String [][] matriz = new String[8][6];
    private Double pEntrada;
    private List <Espectador> espectadores;

    public Cine(List<Espectador> espectadores) {
        this.espectadores = espectadores;
    }
    
    public Cine(Pelicula pelicula, Double pEntrada) {
        this.pelicula = pelicula;
        this.pEntrada = pEntrada;
    }

    public Cine() {
    }

    public List<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(List<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

   
    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public Double getpEntrada() {
        return pEntrada;
    }

    public void setpEntrada(Double pEntrada) {
        this.pEntrada = pEntrada;
    }
    
    
    
    
    
}
