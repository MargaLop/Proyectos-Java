package test;

import domain.Persona;
public class TestArregloObject {
    public static void main(String[] args) {
        Persona personas [] = new Persona[2];
        
        personas[0] = new Persona("Juan");
        personas[1]= new Persona("Marta");
        
        for(int i=0; i<personas.length; i++ ){
            System.out.println("persona " + i + " = " + personas[i]);
        }
    }
}
