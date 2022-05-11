
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
public class Ejercicio10_Condicionales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomTitular;
        int cantidad, ingreso, sum, opcion, retiro;

        System.out.println("DATOS DE SU CUENTA");
        System.out.println("Ingrese el nombre del titular de la cuenta:");
        nomTitular = input.next();
        System.out.println("Ingrese el saldo actual de su cuenta:");
        cantidad = input.nextInt();

        System.out.println(nomTitular + " Escoja en el menú el movimiento que desea hacer");
        System.out.println("1. Realizar un ingreso");
        System.out.println("2. Realizar un retiro");
        System.out.println("3. Consultar el saldo");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Indique el valor que desea ingresar a su cuenta:");
                ingreso = input.nextInt();
                if (ingreso <= 0) {
                    System.out.println("El valor ingresado no puede ser registrado, ingrese un valor mayor.");

                } else {
                    //Proceso 
                    sum = ingreso + cantidad;
                    System.out.println(nomTitular + " El valor ingresado es: " + ingreso + " y la cantidad total de su cuenta suma " + sum);
                }
                break;
            case 2:
                System.out.println("Indique la cantidad que desea retirar");
                retiro = input.nextInt();
                if (cantidad > retiro) {
                    System.out.println("Retiro de: " + retiro + " realizado con éxito.");

                } else {
                    System.out.println("El retiro no puede ser realizado, indique una cantidad menor.");
                }

            case 3:
                System.out.println("Su saldo actual es de: " + cantidad);
        }
    }
}

/*El banco "Su banco fiel" es un banco que inicia sus actividades financieras 
y necesita una aplicación para llevar las cuentas de sus usuarios; por lo tanto, 
se sugiere que la cuenta tenga los atributos titular y cantidad. Para cada 
cliente las cuentas permitirán realizar ingresos, retiros o consultas de valor. 
En los ingresos no se pueden insertar valores negativos y para los retiros 
el valor no puede ser mayor al valor que tiene en la cuenta.*/
