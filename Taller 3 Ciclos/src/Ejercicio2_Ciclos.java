
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
public class Ejercicio2_Ciclos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0, j = 0, k = 0;

        while (k <= 9) {
            while (i <= (8 - k)) {
                i = i + 1;
                System.out.print(" ");
            }
            i = 0;
            while (j <= k) {
                j = j + 1;
                System.out.print("*");
            }
            j = 0;
            System.out.println(" ");
            k = k + 1;
        }
    }

    /*boolean opcion = true;
        int incremento = 1;
        String vacio = "             ";

        while (opcion == true) {
            if (incremento >= 10) {
                opcion = false;
            }
            
            vacio = (vacio + "*");
            vacio.substring(1, 10);
            incremento = incremento + 1;
            System.out.println(vacio);*/
}
