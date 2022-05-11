
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
public class Ejercicio1_Vectores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vector1[] = new int[5], contador = 0;
        int i;

        System.out.println("Ingrese cinco números:");
        for (i = 0; i < 5; i++) { //Ciclo que solicita el número
            vector1[i] = input.nextInt();
        }
        System.out.println("El ídice con sus posiciones y sus valores son las siguientes: ");
        for (i = 0; i < 5; i++) {
            System.out.println("[" + i + "] = " + vector1[i]);
        }

    }
}

//Crear un vector de tipo Entero con 5 posiciones, llenarlo con información solicitada al usuario. 
//Después de recoger toda la información, se requiere imprimir el índice de cada posición en el arreglo con su valor 

