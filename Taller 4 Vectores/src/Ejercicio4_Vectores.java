
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
//ERROR AL MOSTRAR LA MATRIZ
public class Ejercicio4_Vectores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int filas, columnas, filas2, columnas2;
        int matriz[][] = new int[4][5];
        int matriz2[][] = new int[4][5];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[0][4] = 5;
        matriz[1][0] = 6;
        matriz[1][1] = 7;
        matriz[1][2] = 8;
        matriz[1][3] = 9;
        matriz[1][4] = 10;
        matriz[2][0] = 11;
        matriz[2][1] = 12;
        matriz[2][2] = 13;
        matriz[2][3] = 14;
        matriz[2][4] = 15;
        matriz[3][0] = 16;
        matriz[3][1] = 17;
        matriz[3][2] = 18;
        matriz[3][3] = 19;
        matriz[3][4] = 20;

        System.out.println("------- MATRIZ 1 ---------");

        for (filas = 0; filas <= 3; filas++) {
            for (columnas = 0; columnas <= 4; columnas++) {
                System.out.print(matriz[filas][columnas] + " ");
            }
            System.out.println("        ");
        }

        System.out.println(" ");

        System.out.println("-------- MATRIZ 2 --------");

        for (filas2 = 0; filas2 <= 3; filas2++) { //Ciclo para recorrer las filas de la matriz
            for (columnas2 = 0; columnas2 <= 4; columnas2++) { //Ciclo para recorrer las columnas de la matriz
                if ((filas2 % 2) == 0) {
                    System.out.print(matriz[filas2][columnas2] + " ");
                } else {
                    System.out.print(matriz[filas2][4 - columnas2] + " ");
                }
            }
            System.out.println(" ");
        }

    }
}

//Dada la siguiente matriz bidimensional, el cual debe de quemar en el código
//01 02 03 04 05
//06 07 08 09 10
//11 12 13 14 15
//16 17 18 19 20
//Utilizando el conocimiento adquirido, a excepción de hacerlo de forma manual, imprima la siguiente matriz bidimensional.
//01 02 03 04 05
//10 09 08 07 06
//11 12 13 14 15
//20 19 18 17 16
