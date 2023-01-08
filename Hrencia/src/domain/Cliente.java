package domain;

import java.util.Date;

public class Cliente {
    private int idCliente;
    private Date fechaReqistro;
    private boolean vip;
    private static int contadorCliente;
    
    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++ Cliente.contadorCliente;
        this.fechaReqistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaReqistro() {
        return this.fechaReqistro;
    }

    public void setFechaReqistro(Date fechaReqistro) {
        this.fechaReqistro = fechaReqistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public static void setContadorCliente(int contadorCliente) {
        Cliente.contadorCliente = contadorCliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaReqistro=").append(fechaReqistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());     
        sb.append('}');
        return sb.toString();
    }


    
    
}
