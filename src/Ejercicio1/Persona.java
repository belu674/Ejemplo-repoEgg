
package Ejercicio1;


public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private Perro p1;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer dni, Perro p1) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.p1 = p1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Perro getP1() {
        return p1;
    }

    public void setP1(Perro p1) {
        this.p1 = p1;
    }

    @Override
    public String toString() {
        return "Persona" + "\nNombre y Apellido = " + nombre + " " + apellido + ", Edad = " + edad + ", Dni = " + dni + "\nMascota" + p1;
    }
    
}
