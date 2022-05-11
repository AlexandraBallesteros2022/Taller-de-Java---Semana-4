
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
public class Ejercicio2_Condicionales {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        int edad;
        
        System.out.println("Ingrese su edad");
        edad = input.nextInt();
        if (edad <= 18 ){
            System.out.println("Usted aún es un niño");
            
        }else{
            System.out.println("Ejecución finalizada");
        }
    }
}

//Realizar un programa en el cual se solicite la edad de una persona. Si 
//la persona es menor a 18 años, deberá mostrar en pantalla: Usted aún es un niño(a).