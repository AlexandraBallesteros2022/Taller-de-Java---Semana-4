
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
public class Ejercicio3_VariablesEimpresiones {

    public static void main(String[] args) {
        String nombreA, nombreP, nombreM;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellidos: ");
        nombreA = input.nextLine();
        System.out.println("Ingrese el nombre y los apellidos de su padre: ");
        nombreP = input.nextLine();
        System.out.println("Ingrese el nombre y los apellidos de su madre: ");
        nombreM = input.nextLine();
        System.out.println("Yo " + nombreA + " soy hijo de " + nombreP + " y " + nombreM);

    }
}
