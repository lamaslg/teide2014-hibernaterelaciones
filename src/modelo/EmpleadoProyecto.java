package modelo;
// Generated 10-jul-2014 19:43:41 by Hibernate Tools 3.6.0



/**
 * EmpleadoProyecto generated by hbm2java
 */
public class EmpleadoProyecto  implements java.io.Serializable {


     private EmpleadoProyectoId id;
     private Proyecto proyecto;
     private Empleado empleado;
     private Integer horas;

    public EmpleadoProyecto() {
    }

	
    public EmpleadoProyecto(EmpleadoProyectoId id, Proyecto proyecto, Empleado empleado) {
        this.id = id;
        this.proyecto = proyecto;
        this.empleado = empleado;
    }
    public EmpleadoProyecto(EmpleadoProyectoId id, Proyecto proyecto, Empleado empleado, Integer horas) {
       this.id = id;
       this.proyecto = proyecto;
       this.empleado = empleado;
       this.horas = horas;
    }
   
    public EmpleadoProyectoId getId() {
        return this.id;
    }
    
    public void setId(EmpleadoProyectoId id) {
        this.id = id;
    }
    public Proyecto getProyecto() {
        return this.proyecto;
    }
    
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Integer getHoras() {
        return this.horas;
    }
    
    public void setHoras(Integer horas) {
        this.horas = horas;
    }




}


