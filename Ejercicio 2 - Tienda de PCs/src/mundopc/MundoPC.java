package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado ("bluetooth","HP");
        Raton ratonHP = new Raton("bluetooth","HP");
        Ordenador ordenadorHP = new Ordenador("Ordenador HP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 13);
        Teclado tecladoGamer = new Teclado ("bluetooth","Gamer");
        Raton ratonGamer = new Raton("bluetooth","Gamer");
        Ordenador ordenadorGamer = new Ordenador("ordenador Gamer ", monitorGamer, tecladoGamer, ratonGamer);
        
        Orden orden1 = new Orden();
        orden1.agregarOrdenador(ordenadorHP);
        orden1.agregarOrdenador(ordenadorGamer);
        orden1.mostrarOrden();
    }
}
