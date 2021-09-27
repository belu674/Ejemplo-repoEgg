
package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class MazoService {
    
    private Mazo mazo = new Mazo();
    Scanner scan= new Scanner(System.in).useDelimiter("\n");
     
    public Mazo crearMazo(CartaService cartaService){
        mazo.setMazoDeCartas(cartaService.crearCarta()); 
        return mazo;
    }
   
    public void mostrarBarajaCompleta(){
        for (Carta carta : mazo.getMazoDeCartas()) {
            System.out.println(carta.toString());
        }
    }
    
    public void barajar(){
        Collections.shuffle(mazo.getMazoDeCartas());
    }
    
   public void siguienteCarta(List<Carta>monton){
       if (mazo.getMazoDeCartas().isEmpty()) {
               System.out.println("no hay mas cartas");
        }else{
       
         
           
          System.out.println(mazo.getMazoDeCartas().get(0));
          monton.add(mazo.getMazoDeCartas().get(0));
          mazo.getMazoDeCartas().remove(0);
            
        }  
   } 
    
    
   public void cartasMonton(List<Carta>monton){
       if (monton.isEmpty()){
               System.out.println("no ha salido ninguna carta");
           }
       for (Carta carta : monton) {
           
           System.out.println(carta.toString());
       }
   }
   
   public void darCartas(List<Carta>monton){
       int cantCartas=0;
       System.out.println("ingrese el numero de cartas que desea dar");
       cantCartas= scan.nextInt();
       
       if (cantCartas>mazo.getMazoDeCartas().size()) {
           System.out.println("no hay tantas cartas en el mazo");
           
       }else{
           
            for (int i = 0; i < cantCartas; i++) {
               System.out.println(mazo.getMazoDeCartas().get(0));
               monton.add(mazo.getMazoDeCartas().get(0));
               mazo.getMazoDeCartas().remove(0); 
            }
       }
   }
   
   public void cartasDisponibles(List<Carta>monton){
       int cartasDispon=0;
       cartasDispon=mazo.getMazoDeCartas().size();
       System.out.println(cartasDispon);
   }
    
    
}
