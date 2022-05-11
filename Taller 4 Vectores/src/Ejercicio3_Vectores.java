
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

//FUNCIONA
public class Ejercicio3_Vectores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, i, cont;
        int vector[] = new int[1000];
        cont = 0;

        for (i = 0; i <= 999; i++) { //Ciclo para recorrer el vector, para asignar los datos a I
            vector[i] = i; //Le asigna los datos de la posición actual del incremento a la posición del vector
        }

        for (i = 1; i < 1000; i++) { //Ciclo para recorrer los datos del vector de 1 a 1000
            for (num1 = 1; num1 < i; num1++) { //Ciclo para 
                if ((vector[i - 1] % num1) == 0) { //Condición que valida si el número es divisile por él mismo y por uno
                    cont = cont + 1;
                }
            }
            if (cont == 2) {
                System.out.println(vector[i - 1] + " es primo");
            }
            cont = 0;
        }
    }

}
//Imprimir los números primos del 1 al 1000, el resultado debe 
//ser buscado de forma matemática.

