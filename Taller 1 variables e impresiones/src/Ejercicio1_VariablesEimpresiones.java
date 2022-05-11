
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio1_VariablesEimpresiones {
    
    public static void main(String[] args){
        String nombre, apellidos;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre = input.nextLine();
        System.out.println("Ingrese sus apellidos:");
        apellidos = input.nextLine();
        System.out.println("Su nombre es: " + nombre + "" + apellidos);
    }
}

