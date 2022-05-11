
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
public class Ejercicio4_VariablesEimpresiones {
    public static void main(String[] args){
        String ciudad, pais;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la ciudad: ");
        ciudad = input.nextLine();
        System.out.println("Ingrese el nombre del pais: ");
        pais = input.nextLine();
        
        System.out.println("La ciudad " + ciudad + " es la capital del pais " + pais);
    }
}
