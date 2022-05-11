
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
public class Ejercicio6_Condicionales {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nombreMecanico, marca, cilindraje, observacion, nomRepuestos, nomRepuestos2;
        int cantSalida, cantRepuestos, opcion;
        boolean caracMotocicleta = true;

        System.out.println("Ingrese su nombre");
        nombreMecanico = input.nextLine();

        System.out.println(nombreMecanico + " Por favor indique qué desea hacer");
        System.out.println("1. Ingresar motocicleta al sistema");
        System.out.println("2. Dar salida a una motocicleta");
        System.out.println("3. Arreglos por mecánico");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(" ¿Desea especificar las caracteristicas de la moto?, escriba true para sí o false para no");
                caracMotocicleta = input.nextBoolean();
                if (caracMotocicleta == true) {
                    System.out.println("- Marca de la motocicleta");
                    marca = input.next();
                    System.out.println("- Cilindraje de la moto");
                    cilindraje = input.next();
                    System.out.println("Ingrese las observaciones del cliente para la motocicleta 1");
                    observacion = input.next();
                    System.out.println("La motocicleta " + marca + " con cilindraje " + cilindraje + " se ha registrado correctamente");
                } else {
                    System.out.println("No es posible registrar las caracteristicas de la moto");
                }
                break;

            case 2:
                System.out.println("¿Está seguro que desea dar salida a una moto?, escriba true para sí o false para no");
                caracMotocicleta = input.nextBoolean();
                if (caracMotocicleta == true) {
                    System.out.println("Ingrese la marca de la motocicleta");
                    marca = input.next();
                    System.out.println("- Cilindraje de la moto");
                    cilindraje = input.next();
                    System.out.println("Ingrese las observaciones de salida");
                    observacion = input.next();
                    System.out.println("Se dió salida exitosa a la motocicleta " + marca + " con cilindraje " + cilindraje + " con la siguiente observación: " + observacion);
                } else {
                    System.out.println("No es posible dar salida a una moto no especificada");
                }
                break;
            case 3:
                System.out.println("Ingrese la marca de la motocicleta:");
                marca = input.next();
                System.out.println("¿Cuantos repuestos utilizó?, ingrese máximo dos");
                cantRepuestos = input.nextInt();
                if (cantRepuestos == 1) {
                    System.out.println("Ingrese los nombres repuesto que utilizó:");
                    nomRepuestos = input.next();
                    System.out.println("Es mecánico " + nombreMecanico + " utilizó " + cantRepuestos + " repuestos: " + nomRepuestos + " para el arreglo de la moto " + marca);

                } else if (cantRepuestos == 2) {
                    System.out.println("Ingrese los nombres repuesto que utilizó:");
                    nomRepuestos = input.next();
                    nomRepuestos2 = input.next();
                    System.out.println("Es mecánico " + nombreMecanico + " utilizó " + cantRepuestos + " repuestos: " + nomRepuestos + " y " + nomRepuestos2 + " para el arreglo de la moto " + marca);
                } else {
                    System.out.println("El máximo de repuestos a ingresar permitidos es dos.");
                }

                if (cantRepuestos > 2) {
                    System.out.println("Ingrese una opción válida");
                }
        }
    }
}

//El taller de motos "El Maquinista" recibe motocicletas de alto 
//cilindraje para realizar las respectivas revisiones y requiere 
//una aplicación que le permita registrar los servicios generados a sus clientes. 
//Para cada motocicleta se debe tener registro del ingreso al 
//taller y las observaciones por parte del cliente. También debe existir 
//registro de salida del taller con las novedades y otra de arreglos hechos por el 
//mecánico en caso de que se requiera inventariar cambios 
//repuestos en la motocicleta al entregarla.
