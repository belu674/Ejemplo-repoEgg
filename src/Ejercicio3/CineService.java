
package ejercicio3;

import java.util.Random;
import java.util.Scanner;


public class CineService {
     Scanner scan= new Scanner(System.in).useDelimiter("\n");
   public void sala(Cine cine){
       String matriz[][] = new String [8][6];
       Integer fila = 8;
       
       
        for (int i = 0; i < 8; i++) {
            char asientos = 'A';
            for (int j = 0; j < 6; j++) {
                
                matriz[i][j]=((String.valueOf(fila)).concat(String.valueOf(asientos)));
                
                System.out.print(matriz[i][j]+"  |  ");
                asientos++;
            }
            
            
                fila--;
            System.out.println("");
        }
        cine.setMatriz(matriz);
    }


public void crearPeli(Cine cine){
       Pelicula pelicula = new Pelicula();
       PeliService peliculaSerive = new PeliService();
       peliculaSerive.crearPelicula(pelicula);
       cine.setPelicula(pelicula);
       System.out.println(cine.getPelicula());
       cine.setpEntrada(11.00);
}

       
public void llenarListaEspectadores(Cine cine){
    Espectador espectadores = new Espectador();
    EspectadorService espectadorService = new EspectadorService();
    cine.setEspectadores(espectadorService.crearEspectadores(espectadores));
    for (Object object : cine.getEspectadores()) {
        System.out.println(object.toString());
    }    
   }


public void llenarSala(Cine cine){
    String matriz [][] = cine.getMatriz();
    for (Espectador espectadore : cine.getEspectadores()) {
        if (espectadore.getDinero()>=cine.getpEntrada()&& espectadore.getEdad()>=cine.getPelicula().getEdadMinima()) {
            Random rd = new Random();
            Integer fila,columna;
            
            do {    
                fila=rd.nextInt(8);
                columna=rd.nextInt(6);
                
                 
                 
                 
            } while (cine.getMatriz()[fila][columna].contains("X"));
                
          
          matriz[fila][columna] = matriz[fila][columna].concat("X");
          
        }
       
    }
     cine.setMatriz(matriz);
    
}

public void mostrarMatriz(Cine cine){
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 6; j++) {
            System.out.print(cine.getMatriz()[i][j]+" | ");
        }
        System.out.println();
    }
    
    
}


}





