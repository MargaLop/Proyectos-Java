package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args){
        Persona persona1 = new Persona("Jacinto",3.00,true);
        System.out.println("nombre: " + persona1.getNombre());
        persona1.setNombre("Sofia");
        System.out.println("persona1: " + persona1);
    }
}
