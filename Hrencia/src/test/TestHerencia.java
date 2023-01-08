package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;


public class TestHerencia {
   public static void main(String[] args){
//       Empleado empleado1 = new Empleado("Pipo",3000.0);
//       System.out.println("empleado1 = " + empleado1);
        var fecha = new Date();
        Cliente cliente1 = new Cliente (fecha, true, "Paco", 'M', 23,"dererere");
        System.out.println("cliente1 = " + cliente1);
   }
}
