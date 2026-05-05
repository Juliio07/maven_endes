package ra4entorno;

/**
 * Representa un empleado del sistema.
 */
public class Employee {

    private String nombre;
    private int añosEmpresa;

    /** Constructor del empleado. 
     nombre nombre del empleado
     añosEmpresa años en la empresa
     */
    public Employee(String nombre, int añosEmpresa) {
        this.nombre = nombre;
        this.añosEmpresa = añosEmpresa;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñosEmpresa() {
        return añosEmpresa;
    }
    public void setAñosEmpresa(int añosEmpresa) {
        this.añosEmpresa = añosEmpresa;
    }
}
