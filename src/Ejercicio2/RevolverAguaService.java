package Ejercicio2;

public class RevolverAguaService {

    RevolverAgua revolver1 = new RevolverAgua();

    public RevolverAgua llenarRevolver() {
        Integer pActual = (int) (Math.random() * 6+1);
        Integer pAgua = (int) (Math.random() * 6+1);
        revolver1.setpActual(pActual);
        revolver1.setpAgua(pAgua);
        return revolver1;
    }

    public boolean mojar(RevolverAgua revolver1) {
        return revolver1.getpAgua() == revolver1.getpActual();
    }

    public void siguienteChorro(RevolverAgua revolver1) {
        if (revolver1.getpActual() < 6) {
            revolver1.setpActual(revolver1.getpActual() + 1);
        } else {
            revolver1.setpActual(1);
        }
    }

    public void mostrarRevolver() {
        System.out.println(revolver1.toString());
    }
}
