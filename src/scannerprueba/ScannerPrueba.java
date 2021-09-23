/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerprueba;

import java.util.Scanner;

/**
 *
 * @author gemam
 */
public class ScannerPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom;
        System.out.println("Introduce el nombre: ");
        Scanner nom1 = new Scanner(System.in); 
        nom = nom1.nextLine();
        System.out.println("El nombre es: "+nom);
    }
    
}
