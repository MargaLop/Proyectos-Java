package com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private Ordenador ordenadores[];
    private static int ContadorOrdenes;
    private static int ContadorOrdenadores;
    private static final int MAX_ORDENADORES = 10;
    
    public Orden(){
        this.idOrden =++ Orden.ContadorOrdenes;
        this.ordenadores = new Ordenador[Orden.MAX_ORDENADORES];    
    }
   
    public void agregarOrdenador(Ordenador ordenador){
        if(this.ContadorOrdenadores < Orden.MAX_ORDENADORES){
            this.ordenadores[this.ContadorOrdenadores++] = ordenador;
        }
        else{
            System.out.println("HAS SUPERADO EL LIMITE" + Orden.MAX_ORDENADORES);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Orden#:" + this.idOrden);
        System.out.println("Ordenadoe de la orden#:" + this.idOrden);
        for (int i = 0; i < this.ContadorOrdenadores; i++) {
            System.out.println(this.ordenadores[i]);
        }
    }
}
