package Encapsulamiento;
// Generated 05-20-2015 03:06:19 PM by Hibernate Tools 4.3.1



/**
 * Detallepermiso generated by hbm2java
 */
public class Detallepermiso  implements java.io.Serializable {


     private Integer idDetallePermiso;
     private Modulo modulo;
     private Tipousuario tipousuario;

    public Detallepermiso() {
    }

    public Detallepermiso(Modulo modulo, Tipousuario tipousuario) {
       this.modulo = modulo;
       this.tipousuario = tipousuario;
    }
   
    public Integer getIdDetallePermiso() {
        return this.idDetallePermiso;
    }
    
    public void setIdDetallePermiso(Integer idDetallePermiso) {
        this.idDetallePermiso = idDetallePermiso;
    }
    public Modulo getModulo() {
        return this.modulo;
    }
    
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    public Tipousuario getTipousuario() {
        return this.tipousuario;
    }
    
    public void setTipousuario(Tipousuario tipousuario) {
        this.tipousuario = tipousuario;
    }




}


