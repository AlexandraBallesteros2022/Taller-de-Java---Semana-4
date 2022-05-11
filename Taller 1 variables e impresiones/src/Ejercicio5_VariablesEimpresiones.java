
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
public class Ejercicio5_VariablesEimpresiones {
    public static void main(String[] args){
        String nomMascota, edadM, tipoM, nomDueno;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de su mascota: ");
        nomMascota = input.nextLine();
        System.out.println("Ingrese la edad de su mascota: ");
        edadM = input.nextLine();
        System.out.println("Ingrese el tipo de mascota: ");
        tipoM = input.nextLine();
        System.out.println("Ingrese su nombre completo: ");
        nomDueno = input.nextLine();
        
        System.out.println(nomMascota + " es un(a) " + tipoM 
                + " el cual, tiene " + edadM + " años de edad y " 
                + nomDueno + " es actualmente su dueño(a)");
    }
}
