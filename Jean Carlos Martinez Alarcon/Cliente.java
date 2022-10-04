
package domain;

import java.util.Date;


public class cliente extends persona
{
    private int idCliente;
    private Date fecharegistro;
    private boolean vip;
    private static int  contadorCliente;
    
    public cliente(Date fechaRegistro, boolean vip, String nombre, 
                int edad, String direccion, char genero ){
        super("nombre, genero, edad, direccion");   
        this.idCliente = ++cliente.contadorCliente;
        this.fecharegistro = fecharegistro;
        this.vip = vip; 
    }

    public cliente(Date date, boolean b, String carlos, int i, String av_siempre_viva_123) {
    }

    public int getIdCliente() {
        return idCliente;
    }

        public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
        public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cliente(idCliente=").append(this.idCliente);
        sb.append(", fecharegistro=").append(this.fecharegistro);
        sb.append(", vip=").append(this.vip);
        sb.append(", ").append(super.toString());
        StringBuilder append = sb.append('}');
        return sb.toString();
    
    
    
    
    
}
        
}