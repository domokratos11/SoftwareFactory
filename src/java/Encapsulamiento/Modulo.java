package Encapsulamiento;
// Generated 05-20-2015 03:06:19 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Modulo generated by hbm2java
 */
public class Modulo  implements java.io.Serializable {


     private String idModulo;
     private String nombre;
     private Set detallepermisos = new HashSet(0);

    public Modulo() {
    }

	
    public Modulo(String idModulo, String nombre) {
        this.idModulo = idModulo;
        this.nombre = nombre;
    }
    public Modulo(String idModulo, String nombre, Set detallepermisos) {
       this.idModulo = idModulo;
       this.nombre = nombre;
       this.detallepermisos = detallepermisos;
    }
   
    public String getIdModulo() {
        return this.idModulo;
    }
    
    public void setIdModulo(String idModulo) {
        this.idModulo = idModulo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getDetallepermisos() {
        return this.detallepermisos;
    }
    
    public void setDetallepermisos(Set detallepermisos) {
        this.detallepermisos = detallepermisos;
    }




}


