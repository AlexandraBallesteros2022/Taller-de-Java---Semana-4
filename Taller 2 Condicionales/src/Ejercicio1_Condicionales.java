
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
public class Ejercicio1_Condicionales {
    
    public static void main(String[]args){
    int edad;
    edad = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese su edad: ");
    edad = input.nextInt();
    if (edad >= 18){
       System.out.println("Usted es mayor de edad."); 
    }else{
       System.out.println("Ejecución finalizada"); 
    }
}
}
/*Realizar un programa en el cual se solicite la edad de una persona. 
Si la persona es mayor o igual a 18 años, deberá mostrar en pantalla: 
Usted es mayor de edad.*/