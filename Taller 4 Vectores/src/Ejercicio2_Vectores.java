
import java.util.Random;
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

//ERROR EN LA IMPRESION DE LA MATRIZ
//ERROR EN EL RESULTADO DE NÚMEROS PARES E IMPARES
public class Ejercicio2_Vectores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriz[] = new int[20];
        int j = 0;

        //Ciclo que permite recorrer y mostrar los números en pantalla
        for (j = 0; j < 20; j++) {
            matriz[j] = (int) (Math.random() * 100);
            System.out.println("[" + j + "] = " + matriz[j]);
        }
        int contador;
        contador = 0;
        matriz[contador] = 1;
        System.out.print("Los números pares son: ");

    //Ciclo para recorrer el vector que imprime los numero pares
        while (contador < 20) {
            if ((matriz[contador]%2) == 0) {
                System.out.print(matriz[contador] + ", ");
            }
            contador = contador + 1;
        }

        System.out.println("");
        int contador2;
        contador2 = 0;
        matriz[contador2] = 1;
        System.out.print("Los números impares son: ");

    //Ciclo para recorrer el vector que imprime los numero impares
        while (contador2 < 20) {
            if ((matriz[contador2]%2) != 0) {
                System.out.print(matriz[contador2] + ", ");
            }
            contador2 = contador2 + 1;
        }
        System.out.println("");

    }
}

//Crear un arreglo de números enteros de 20 posiciones, el cual, debe ser llenado con números aleatorios 
//entre 1 y 100; después de haber llenado dicho arreglo, se debe volver a recorrer utilizando un ciclo 
//diferente al que se usó para llenarse e imprimir los números pares e impares. Ejemplo
//Números pares: 2, 4, 6, 8, 10
//Números impares: 1, 3, 5, 7, 9
