package Encapsulamiento;
// Generated 05-20-2015 03:06:19 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tiporequerimiento generated by hbm2java
 */
public class Tiporequerimiento  implements java.io.Serializable {


     private String idTipoRequerimiento;
     private String descripcion;
     private Set requerimientos = new HashSet(0);

    public Tiporequerimiento() {
    }

	
    public Tiporequerimiento(String idTipoRequerimiento, String descripcion) {
        this.idTipoRequerimiento = idTipoRequerimiento;
        this.descripcion = descripcion;
    }
    public Tiporequerimiento(String idTipoRequerimiento, String descripcion, Set requerimientos) {
       this.idTipoRequerimiento = idTipoRequerimiento;
       this.descripcion = descripcion;
       this.requerimientos = requerimientos;
    }
   
    public String getIdTipoRequerimiento() {
        return this.idTipoRequerimiento;
    }
    
    public void setIdTipoRequerimiento(String idTipoRequerimiento) {
        this.idTipoRequerimiento = idTipoRequerimiento;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getRequerimientos() {
        return this.requerimientos;
    }
    
    public void setRequerimientos(Set requerimientos) {
        this.requerimientos = requerimientos;
    }




}


