
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
public class Ejercicio1_Ciclos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Primera opción.
        int nivel = 10, var1;
        String asterisco = "";

        //Proceso
        for (var1 = 1; var1 <= nivel; var1++) {
            asterisco += "*";
            System.out.println(asterisco);
        }

        //Segunda opción
        int var, var2;

        //Proceso 
        for (var = 1; var <= 10; var++) {
            for (var2 = 1; var2 <= var; var2++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
