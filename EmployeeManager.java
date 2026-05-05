package ra4entorno;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
public class EmployeeManager {
    private List<Employee> empleados;
    // Inicializa la lista de empleados.   
    public EmployeeManager() {
        this.empleados = new ArrayList<>();
    }
    //Añade un empleado al sistema,nombre nombre del empleado,añosEmpresa años en la empresa   
    public void addEmployee(String nombre, int añosEmpresa) {
        Employee empleado = new Employee(nombre, añosEmpresa);
        empleados.add(empleado);
        System.out.println(nombre + " añadido al sistema.");
    }
    //Muestra todos los empleados del sistema.
    public void printEmployees() {
        System.out.println("Lista de empleados:");
        for (Employee empleado : empleados) {
            System.out.println(
                empleado.getNombre() + ", Años en la empresa: " + empleado.getAñosEmpresa()
            );
        }
    }
    //Método principal de prueba.
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee("Juan Pérez", 5);
        manager.addEmployee("Ana López", 2);
        manager.printEmployees();
    }
}