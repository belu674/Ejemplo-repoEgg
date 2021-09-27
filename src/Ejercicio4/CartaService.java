
package ejercicio4;

import java.util.ArrayList;
import java.util.List;


public class CartaService {
    
public List<Carta>crearCarta(){
    
   String numero[]={"1","2","3","4","5","6","7","10","11","12"};
   String palo[]={"Espada","Oro","Copa","Basto"};  
   List<Carta>listaDeCartas= new ArrayList();
   
    for (int i = 0; i < palo.length; i++) {
        for (int j = 0; j < numero.length; j++) {
            
            
            listaDeCartas.add(new Carta(Integer.parseInt(numero[j]), palo[i]));
            
        }
    }
        return listaDeCartas;
   
   
    }  




}
    
    
    
    
