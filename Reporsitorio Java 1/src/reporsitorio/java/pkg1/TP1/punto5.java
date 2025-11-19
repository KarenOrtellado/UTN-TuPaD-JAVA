/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reporsitorio.java.pkg1.TP1;

import java.util.Scanner;

/**
 *
 * @author Activity
 */
public class punto5 {
    
    public static void main(String[] args) {
    
    //solicitar dos números enteros y realizar operaciones mat básicas
    
    Scanner input = new Scanner(System.in);
    int num1, num2, suma, resta, multiplicacion;
    double division;
    
    
    
        System.out.println("Ingrese un número entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese otro número entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        resta = num1 - num2;
        suma = num1 + num2;
        multiplicacion = num1 * num2;
        division = ((double)num1 / num2);
       
        
        System.out.println("la suma de los números ingresados es igual a: " + suma);
        System.out.println("la resta de los números ingresados es igual a: " + resta);
        System.out.println("la multiplicación de los números ingresados es igual a: " + multiplicacion);
        System.out.println("la división de los números ingresados es igual a: " + division);
    }
    
    
}
