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
public class punto9 {
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        //Se corrigió el nextInt() que es para enteros por nextLine()
        System.out.println("Hola " + nombre);
    }
    
}
