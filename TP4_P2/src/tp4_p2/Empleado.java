/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_p2;

/**
 *
 * @author Activity
 */
public class Empleado {
    
     private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático para contar empleados
    private static int totalEmpleados = 0;
    private static int siguienteId = 1; // Para asignar ID automático

    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = siguienteId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000; // Salario por defecto
        totalEmpleados++;
    }

    // Métodos sobrecargados para actualizar salario

    // Aumento por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }

    // Aumento por monto fijo
    public void actualizarSalario(int monto) {
        this.salario += monto;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // toString() para representar el estado del objeto
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + ", Salario=" + salario + "]";
    }

    // static para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
}
