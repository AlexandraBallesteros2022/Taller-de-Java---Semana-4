
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
public class Ejercicio8_Ciclos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user = "";
        boolean ingresoCurso, estadoCurso, result = true, control = true;
        int cantUsers = 0, opcion, i;

        System.out.println("Escuela automovilística El Maestro");
        System.out.println("Menu de opciones");
        System.out.println("1. registrar su ingreso al curso");
        System.out.println("2. Consultar usuarios que hayan presentado el curso");
        System.out.println("3. Resultados de la prueba del curso");
        System.out.println("4. Salir");

        while (control == true) {
            System.out.println("Elija la opcion que desee");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    if (cantUsers <= 8) {
                        System.out.println("Ingrese el usuario al curso");
                        user = input.next();
                        cantUsers = cantUsers + 1;
                        System.out.println(cantUsers);
                    } else {
                        System.out.println("No es posible ingresar mas usuarios");
                    }
                    break;
                case 2:
                    for (i = 1; i <= cantUsers; i++) {
                        System.out.println(user);
                        System.out.println("¿El usurario aprobó? true si aprobo y false si perdió");
                        result = input.nextBoolean();
                    }
                case 3:
                    System.out.println(user);
                    for (i = 1; i <= cantUsers; i++) {
                        if (result == true) {
                            System.out.println(user + " aprobó el curso");
                        } else {
                            System.out.println(user + " perdió el curso");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Que le vaya bien.");
                    control = false;

                    if (opcion != opcion) {
                        System.out.println("La opción ingresada no es válida");
                    }
            }
        }
    }
}

/*Para cada usuario se debe permitir registrar su ingreso al curso, consultar usuarios 
que hayan presentado el curso y resultados de la prueba del curso (si fueron aprobados o no). 
Recuerde que el sistema debe terminar cuando el usuario así lo indique.*/