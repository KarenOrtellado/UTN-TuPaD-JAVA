/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reporsitorio.java.pkg1;

import java.util.Scanner;

/**
 *
 * @author Activity
 */
public class punto8 {
    
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int num1, num2;
    double division;
    
        System.out.println("Ingrese un número entero: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese otro número entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        division = ((double)num1 / num2);
        
        System.out.println("El resultado de dividir ambos números es: " + division);

            
    }
    
}
