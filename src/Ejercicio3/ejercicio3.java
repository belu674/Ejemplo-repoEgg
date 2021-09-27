
package ejercicio3;

import java.util.Scanner;


public class ejercicio3 {

    Scanner scan= new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
      
        Cine cine = new Cine();
       CineService cineService = new CineService();
       
       

       cineService.sala(cine);
       cineService.crearPeli(cine);
       cineService.llenarListaEspectadores(cine);
       cineService.llenarSala(cine);
       cineService.mostrarMatriz(cine);
        
        
        
    }
    
}
