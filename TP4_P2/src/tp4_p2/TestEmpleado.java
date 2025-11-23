/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_p2;

/**
 *
 * @author Activity
 */
public class TestEmpleado {
    public static void main(String[] args) {
          // Crear empleados con constructor completo
        Empleado emp1 = new Empleado(101, "Marcos Perez", "Analista", 45000);
        Empleado emp2 = new Empleado(102, "María López", "Desarrolladora", 50000);

        // Crear empleados con constructor solo nombre y puesto
        Empleado emp3 = new Empleado("Marcelo García", "Tester");
        Empleado emp4 = new Empleado("Ana Fernández", "Diseñadora");

        // Aplicar métodos actualizarSalario
        emp1.actualizarSalario(10); 
        emp2.actualizarSalario(5000); 
        emp3.actualizarSalario(15); 
        emp4.actualizarSalario(3000); 

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
