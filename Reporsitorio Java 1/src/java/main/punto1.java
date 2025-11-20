
package java.main;


public class punto1 {
    
    public static void main(String[] args) {
        Empleado p1 = new Empleado ("Karen", "Analista");
        Empleado p2 = new Empleado(1,"Alma","Repositora",1000);
        
        System.out.println("p1");
        System.out.println(p2);
        System.out.println("-----------------------------");
        p1.actualizarSalario(15);
        p2.actualizarSalario(859.2);
        System.out.println("-----------------------------");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("-----------------------------");
        System.out.println(Empleado.mostrarTotalEmpleados());
        
    
    }
    
}
