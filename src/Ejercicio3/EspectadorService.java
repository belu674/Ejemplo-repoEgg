
package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class EspectadorService {
    
    public List<Espectador> crearEspectadores(Espectador espectador){
       List<Espectador>espectadores= new ArrayList();
        for (int i = 0; i < 5; i++) {
            String nombre="pepe";
            Double dinero=12.50;
            espectador.setNombre(nombre);
            espectador.setEdad(20);
            espectador.setDinero(dinero);
            espectadores.add(espectador);
           
        }   
        return espectadores;
    }
   
}
