package com.gm.mundopc;

public class Ordenador {
    private int idOrdenador;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorOrdenadores;
    
    public Ordenador(){
        this.idOrdenador =++ Ordenador.contadorOrdenadores;
    }
    
    public Ordenador(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public int getIdOrdenador() {
        return idOrdenador;
    }

    public void setIdOrdenador(int idOrdenador) {
        this.idOrdenador = idOrdenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "idOrdenador=" + idOrdenador + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
    
    
}
