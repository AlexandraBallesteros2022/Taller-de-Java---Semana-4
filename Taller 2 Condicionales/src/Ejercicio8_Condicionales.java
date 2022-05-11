
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
public class Ejercicio8_Condicionales {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nomP, saborTorta, porciones, decor;
        int opcion, cantPedidos;
        Boolean registroTortas = true, registroVtas = true;

        System.out.println("Indique ¿qué desea hacer?");
        System.out.println("1. Realizar un pedido");
        System.out.println("2. Ingreso tortas disponibles");
        System.out.println("3. Registrar una venta");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¿Cuántos pedidos desea ingresar?, máximo 2 artículos");
                cantPedidos = input.nextInt();
                if (cantPedidos == 1) {
                    System.out.println("Ingrese el nombre del primer artículo");
                    nomP = input.next();
                    System.out.println("Su pedido " + nomP + " ha sido registrado con éxito.");

                } else if (cantPedidos == 2) {
                    System.out.println("Ingrese el nombre del primer artículo");
                    nomP = input.next();
                    System.out.println("Ingrese el nombre del segundo artículo");
                    nomP = input.next();
                    System.out.println("Su pedido " + nomP + " ha sido registrado con éxito.");

                } else {
                    System.out.println("La cantidad de pedidos ingresada no válida");
                }
                break;

            case 2:
                System.out.println("¿Está seguro que desea registrar una torta?, indique true para Sí ó False para No");
                registroTortas = input.nextBoolean();
                if (registroTortas == true) {
                    System.out.println("Ingrese el sabor de la torta");
                    saborTorta = input.next();
                    System.out.println("Indique las porciones de la torta");
                    porciones = input.next();
                    System.out.println("Especifique la decoración de la torta");
                    decor = input.next();
                    System.out.println("La torta con sabor a " + saborTorta + " de " + porciones + " y decoración " + decor + " se ha registrado con éxito.");

                } else {
                    System.out.println("Para realizar el registo confirme la operación");
                }
                break;

            case 3:
                System.out.println("¿Está seguro que desea registrar una venta, indique true para Sí ó false para No");
                registroVtas = input.nextBoolean();
                if (registroVtas == true) {
                    System.out.println("Ingrese el sabor de la torta");
                    saborTorta = input.next();
                    System.out.println("Indique las porciones de la torta");
                    porciones = input.next();
                    System.out.println("Especifique la decoración de la torta");
                    decor = input.next();
                    System.out.println("La  venta de la torta con sabor a " + saborTorta
                            + " de " + porciones + " y decoración " + decor + " se ha registrado con éxito.");
                } else {
                    System.out.println("Para registrar una venta confirme la operación");
                }
                break;
        }

    }
}

/*El pastelero Don Carlos es el mejor pastelero de la ciudad y 
requiere una aplicación que le permita registrar 
los pedidos de los clientes en cuanto a las tortas que realiza. 
Cada torta tiene unas características propias como sabor, 
cantidad (porciones) y decoraciones). Se requiere que la aplicación 
permita registrar los pedidos, las tortas disponibles y 
las ventas que se registren diariamente.*/
