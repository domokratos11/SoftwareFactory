package Encapsulamiento;
// Generated 05-20-2015 03:06:19 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sistema generated by hbm2java
 */
public class Sistema  implements java.io.Serializable {


     private String idSistema;
     private Usuario usuario;
     private String nombreSistema;
     private Date fecha;
     private String estadoSistema;
     private Set detallesistemas = new HashSet(0);

    public Sistema() {
    }

	
    public Sistema(String idSistema, Usuario usuario, String nombreSistema, Date fecha, String estadoSistema) {
        this.idSistema = idSistema;
        this.usuario = usuario;
        this.nombreSistema = nombreSistema;
        this.fecha = fecha;
        this.estadoSistema = estadoSistema;
    }
    public Sistema(String idSistema, Usuario usuario, String nombreSistema, Date fecha, String estadoSistema, Set detallesistemas) {
       this.idSistema = idSistema;
       this.usuario = usuario;
       this.nombreSistema = nombreSistema;
       this.fecha = fecha;
       this.estadoSistema = estadoSistema;
       this.detallesistemas = detallesistemas;
    }
   
    public String getIdSistema() {
        return this.idSistema;
    }
    
    public void setIdSistema(String idSistema) {
        this.idSistema = idSistema;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getNombreSistema() {
        return this.nombreSistema;
    }
    
    public void setNombreSistema(String nombreSistema) {
        this.nombreSistema = nombreSistema;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getEstadoSistema() {
        return this.estadoSistema;
    }
    
    public void setEstadoSistema(String estadoSistema) {
        this.estadoSistema = estadoSistema;
    }
    public Set getDetallesistemas() {
        return this.detallesistemas;
    }
    
    public void setDetallesistemas(Set detallesistemas) {
        this.detallesistemas = detallesistemas;
    }




}


