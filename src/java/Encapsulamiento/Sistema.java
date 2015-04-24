package Encapsulamiento;
// Generated 04-15-2015 08:45:35 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sistema generated by hbm2java
 */
public class Sistema  implements java.io.Serializable {


     private String idSistema;
     private Usuario usuario;
     private Date fecha;
     private String estadoSistema;
     private Set detallesistemas = new HashSet(0);

    public Sistema() {
    }

	
    public Sistema(String idSistema, Usuario usuario, Date fecha, String estadoSistema) {
        this.idSistema = idSistema;
        this.usuario = usuario;
        this.fecha = fecha;
        this.estadoSistema = estadoSistema;
    }
    public Sistema(String idSistema, Usuario usuario, Date fecha, String estadoSistema, Set detallesistemas) {
       this.idSistema = idSistema;
       this.usuario = usuario;
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

