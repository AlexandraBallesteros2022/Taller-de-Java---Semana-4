
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
public class Ejercicio4_Condicionales {

    public static void main(String[] args) {
        String nombPelicula1 ="", nombPelicula2 = "", nomUsuario, anotacionPelicula="";
        int opcion = 0;
        boolean pelicula = true, anotacion = true, salir = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario: ");
        nomUsuario = input.nextLine();

        System.out.println(nomUsuario + " indique qué desea gacer");
        System.out.println("1. Quiero ver las películas disponibles");
        System.out.println("2. Deseo alquilar una película");
        System.out.println("3. Quiero recoger una película en la videotienda");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¿Está seguro que desea ver las películas disponibles?, indique true para Sí ó false para No");
                pelicula = input.nextBoolean();
                if (pelicula == true) {
                    System.out.println(" Las películas disponibles son:");
                    System.out.println("1. La noche del lobo");
                    System.out.println("2. La furia del león");
                    System.out.println("3. El amanecer");
                    System.out.println("4. Kinkong");
                    System.out.println("5. La princesa Diana");
                } else {
                    System.out.println("No es posible mostrar las películas disponibles");
                }
                 break;

            case 2:
                System.out.println("¿Está seguro que desea alquilar una película?, indique true para Sí ó false para No");
                pelicula = input.nextBoolean();
                if (pelicula == true) {
                    System.out.println(" Ingrese el nombre de la película");
                    nombPelicula1 = input.next();

                    System.out.println(" Usted ha alquilado la película " + nombPelicula1);

                } else {
                    System.out.println("Ingrese datos para alquilar una película");    
                }
                break;
                
            case 3:
                System.out.println("¿Está seguro que desea recoger su película en la videotienda?, indique true para Sí ó false para No");
                pelicula = input.nextBoolean();
                if (pelicula == true) {
                    System.out.println(" Ingrese el nombre de la película que desea recoger");
                    nombPelicula2 = input.next();
                    System.out.println("¿Desea colocar una anotación?, indique true para Sí ó false para No");
                    anotacionPelicula = input.next();
                } else if (anotacion == true) {
                    System.out.println("Ingrese la anotación");
                    anotacionPelicula = input.next();
                    System.out.println("La anotación fue agregada correctamente");
                    System.out.println("Su película " + nombPelicula2 + " está disponible, puede pasar a recogerla.");
                } else {
                    System.out.println("Ingrese una opción válida");
                }
                break;
        }
    }
}

/*La video tienda que presta sus servicios de alquiler 
de películas a los usuarios del barrio el Porvenir, 
requiere de una aplicación que permita registrar el 
alquiler de las películas que adquieren sus usuarios. 
Para cada usuario se debe permitir la opción de alquilar 
película, consultar películas disponibles y recibir 
película en la video tienda con la opción de realizar anotaciones 
sobre estas si se llegan a presentar 
daños u otra novedad sobre la película.*/
