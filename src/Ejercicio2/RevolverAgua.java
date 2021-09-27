
package Ejercicio2;


public class RevolverAgua {

    @Override
    public String toString() {
        return "Revolver de Agua" + "\nPosición actual = " + pActual + "\nPosición del agua = " + pAgua;
    }

    private Integer pActual;
    private Integer pAgua;

    public RevolverAgua() {
    }

    public RevolverAgua(Integer pActual, Integer pAgua) {
        this.pActual = pActual;
        this.pAgua = pAgua;
    }

    public Integer getpActual() {
        return pActual;
    }

    public void setpActual(Integer pActual) {
        this.pActual = pActual;
    }

    public Integer getpAgua() {
        return pAgua;
    }

    public void setpAgua(Integer pAgua) {
        this.pAgua = pAgua;
    }
}
