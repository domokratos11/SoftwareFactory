package Encapsulamiento;
// Generated 04-15-2015 08:45:35 AM by Hibernate Tools 4.3.1



/**
 * Detallesistema generated by hbm2java
 */
public class Detallesistema  implements java.io.Serializable {


     private String idDetalleSistema;
     private Requerimiento requerimiento;
     private Responsable responsable;
     private Sistema sistema;
     private String estadoRequerimiento;

    public Detallesistema() {
    }

    public Detallesistema(String idDetalleSistema, Requerimiento requerimiento, Responsable responsable, Sistema sistema, String estadoRequerimiento) {
       this.idDetalleSistema = idDetalleSistema;
       this.requerimiento = requerimiento;
       this.responsable = responsable;
       this.sistema = sistema;
       this.estadoRequerimiento = estadoRequerimiento;
    }
   
    public String getIdDetalleSistema() {
        return this.idDetalleSistema;
    }
    
    public void setIdDetalleSistema(String idDetalleSistema) {
        this.idDetalleSistema = idDetalleSistema;
    }
    public Requerimiento getRequerimiento() {
        return this.requerimiento;
    }
    
    public void setRequerimiento(Requerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }
    public Responsable getResponsable() {
        return this.responsable;
    }
    
    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }
    public Sistema getSistema() {
        return this.sistema;
    }
    
    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
    public String getEstadoRequerimiento() {
        return this.estadoRequerimiento;
    }
    
    public void setEstadoRequerimiento(String estadoRequerimiento) {
        this.estadoRequerimiento = estadoRequerimiento;
    }




}


