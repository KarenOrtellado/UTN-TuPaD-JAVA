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
public class punto4 {

    public static void main(String[] args) {
    
        //programa que solicita al usuario ingresar sus datos y mostrarlos por pantalla
        
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Tu nombre es: " + nombre + " y tenés " + edad + " años");
        
        
        
    }    
}
