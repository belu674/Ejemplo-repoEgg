
package ejercicio4;

import java.util.ArrayList;
import java.util.List;


public class ejercicio4 {

    public static void main(String[] args) {
        
   CartaService cartaService = new CartaService();
   MazoService mazoService = new MazoService();
   List<Carta>monton = new ArrayList();
   mazoService.crearMazo(cartaService);
   mazoService.mostrarBarajaCompleta();
        
   System.out.println("\n\n\n\n-------Cartas Mezcladas--------");
   
   mazoService.barajar();
   mazoService.mostrarBarajaCompleta();
   
   System.out.println("--------Siguiente carta--------");
   mazoService.siguienteCarta(monton);
   mazoService.cartasDisponibles(monton);
   mazoService.siguienteCarta(monton);
   mazoService.cartasDisponibles(monton);
   System.out.println("--------MONTON DE CARTAS--------");
   mazoService.cartasMonton(monton);
   System.out.println("--------DAR CARTAS--------");
   mazoService.darCartas(monton);
   System.out.println("--------MONTON DE CARTAS--------");
   mazoService.cartasMonton(monton);
   System.out.println("--------CARTAS EN LA BARAJA--------");
   mazoService.mostrarBarajaCompleta();
   System.out.println("--------DAR CARTAS--------");
   mazoService.darCartas(monton);
   mazoService.cartasDisponibles(monton);
   
    }
    
}
