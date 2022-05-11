
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
public class Ejercicio9_Condicionales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcion, area, alturaRect, alturaTriang, alturaTrape, baseRect, baseTriang, baseTrape1, baseTrape2;
        area = 0;

        System.out.println("Indique cuál de estas operaciones desea hacer");
        System.out.println("1. Calcular el área de un rectángulo.");
        System.out.println("2. Calcular el área de un triángulo.");
        System.out.println("3. Calcular el área de un trapecio.");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Base del rectágulo, ingrese un número no superior a 100");
                baseRect = input.nextInt();
                System.out.println("Altura del rectángulo, ingrese un número no superior a 100");
                alturaRect = input.nextInt();

                //Proceso 
                if (baseRect <= 100 & alturaRect <= 100) {
                    area = baseRect * alturaRect;
                    System.out.println("El área del rectángulo es: " + area + " unidades cuadradas");
                } else {
                    System.out.println("Debe ingresar un número menor a 100");
                }
                break;

            case 2:
                System.out.println("Base del triángulo, ingrese un número no superior a 100");
                baseTriang = input.nextInt();
                System.out.println("Altura del triángulo, ingrese un número no superior a 100");
                alturaTriang = input.nextInt();

                //Proceso 
                if (baseTriang <= 100 & alturaTriang <= 100) {
                    area = (baseTriang * alturaTriang) / 2;
                    System.out.println("El área del triángulo es: " + area + " cm^2");
                } else {
                    System.out.println("Debe ingresar un número menor a 100");
                }
                break;

            case 3:
                System.out.println("Ingrese la altura del trapecio. Indique un número no superior a 100");
                alturaTrape = input.nextInt();

                System.out.println("Ingrese la base 1 del trapecio. Indique un número no superior a 100");
                baseTrape1 = input.nextInt();

                System.out.println("Ingrese la base 2 del trapecio. Indique un número no superior a 100");
                baseTrape2 = input.nextInt();

                //Proceso 
                if (alturaTrape <= 100 & baseTrape1 <= 100 & baseTrape2 <= 100) {
                    area = alturaTrape * (baseTrape1 + baseTrape2) / 2;
                    System.out.println("El área del trapecio es: " + area + " cm^2.");

                } else {
                    System.out.println("Debe ingresar un número menor a 100");
                }
                break;
        }
    }
}

/*El profesor de geometría está explicando a sus estudiantes las fórmulas para 
calcular el área de diferentes figuras geométricas, para ello requiere una 
aplicación que le facilite el ejercicio solicitándole los valores al estudiante. 
La aplicación debe permitir que el estudiante seleccione si desea calcular 
el área de un rectángulo, triángulo o trapecio. No olvide solicitar los datos 
necesarios para realizar cada cálculo y mostrar su respectivo resultado.*/
