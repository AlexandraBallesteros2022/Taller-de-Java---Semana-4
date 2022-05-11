
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
public class Ejercicio2_VariablesEimpresiones {
    public static void main(String[] args){
        String nombre, apellidos, edad;
        double estatura;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese sus apellidos: ");
        apellidos = input.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = input.nextLine();
        System.out.println("Ingrese su estatura: ");
        estatura = input.nextDouble();
        
        System.out.println("Su nombre es: " + nombre + "" + apellidos + " usted tiene " +
                edad + " años de edad " + " y su estatura es: " + estatura);
    }
}
