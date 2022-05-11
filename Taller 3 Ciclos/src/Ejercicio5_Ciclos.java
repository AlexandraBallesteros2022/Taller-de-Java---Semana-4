
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
public class Ejercicio5_Ciclos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcion;
        boolean salir = false;
        String nombre, repet;
        
        System.out.println("Ingresa tu nombre");
        nombre = input.next();

        do {
            System.out.println(nombre + " elija la opción que desee:");
            System.out.println("1. Quiero que el programa me salude");
            System.out.println("2. Recibir una frase célebre");
            System.out.println("3. Salir del sistema");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola " + nombre);
                    break;
                case 2:
                    System.out.println("Un día sin risa es un día perdido. - Charlie Chaplin.");
                    break;
                case 3:
                    System.out.println("Que le vaya bien.");
                    salir = true;
                    break;
                default:  
                    System.out.println("Opción válida");
                     break;
            } 
        } 
        while (salir == false);
    }
}

//Utilizando el ciclo que usted desee, crear un menú de ejecución infinita 
//hasta que el usuario desee terminar dicho ciclo.
