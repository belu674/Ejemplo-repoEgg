package Ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Maria", "Rosas", 33, 33452563, new Perro ("Nina", "Ovejero", 2, "Mediano"));
        Persona persona2 = new Persona("Carlos", "Uribe", 25, 35215156, new Perro ("Lola", "Caniche", 1, "Pequeña"));
        
        System.out.println(persona1);
        System.out.println("");
        System.out.println(persona2);
    }
}
