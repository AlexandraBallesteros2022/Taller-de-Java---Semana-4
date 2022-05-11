
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
public class Ejercicio6_Ciclos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String tel1="", tel2="", tel3="", nom1="", nom2="", nom3="", orga1="", orga2="", orga3="", nomC="";
        int opcion;
        boolean salirG = true, salir2 = true, salir3 = true;

        do {
            System.out.println("Indique qué desea hacer:");
            System.out.println("1. Añadir 3 números de teléfonos");
            System.out.println("2. Buscar un contacto");
            System.out.println("3. Eliminar un contacto");
            System.out.println("4. Salir del sistema");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("CONTACTO 1");
                    System.out.println("Nombre:");
                    nom1 = input.next();
                    System.out.println("Nombre organización:");
                    orga1 = input.next();
                    System.out.println("Número telefónico:");
                    tel1 = input.next();

                    System.out.println("¡Número almacenado correctamente!");
                    System.out.println("INGRESE EL CONTACTO 2");
                    System.out.println("Nombre:");
                    nom2 = input.next();
                    System.out.println("Nombre organización:");
                    orga2 = input.next();
                    System.out.println("Número telefónico:");
                    tel2 = input.next();

                    do {
                        if (tel1.equals(tel2)) {
                            System.out.println("El segundo número de teléfono no puede ser igual al primero.");
                            System.out.println("Ingrese nuevamente el segundo número de teléfono");
                            tel2 = input.next();
                        } else {
                            System.out.println("¡El segundo número de teléfono fue almacenado correctamente!");
                        }
                        salir2 = false;
                    } 
                    while (salir2 == true);

                    System.out.println("INGRESE EL CONTACTO 3");
                    System.out.println("Nombre:");
                    nom3 = input.next();
                    System.out.println("Nombre organización:");
                    orga3 = input.next();
                    System.out.println("Número de teléfono:");
                    tel3 = input.next();

                    do {
                        if (tel3.equals(tel1) || tel3.equals(tel2)) {
                            System.out.println("El tercer número de teléfono no puede ser igual al primero ni al segundo");
                            System.out.println("Ingrese nuevamente el tercer número de teléfono:");
                            tel3 = input.next();
                        } else {
                            System.out.println("¡El tercer número de teléfono fue almacenado correctamente!");
                        salir3 = false;
                        }
                    } 
                    while (salir3 == true);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del contacto a consultar");
                    nomC = input.next();
                    if (nomC.equals(nom1)) {
                        System.out.println("El contacto consultado es: " + nom1 + ", su organización es " + orga1 + " y su teléfono es " + tel1);

                    } else if (nomC.equals(nom2)) {
                        System.out.println("El contacto consultado es: " + nom2 + ", su organización es " + orga2 + " y su teléfono es " + tel2);
                    } else if (nomC.equals(nom3)) {
                        System.out.println("El contacto consultado es: " + nom3 + ", su organización es " + orga3 + " y su teléfono es " + tel3);
                    } else if (!nomC.equals(nom1) || !nomC.equals(nom2) || !nomC.equals(nom3)) {
                        System.out.println("El contacto ingresado no existe en la base de datos");
                    } 
                        break;

                case 3:
                    System.out.println("Ingrese el nombre del contacto a eliminar:");
                    nomC = input.next();
                    if (nomC.equals(nom1)){
                        System.out.println("El contacto es: nombre: " + nom1 +  " organización: " + orga1 + " teléfono: " + tel1 + " fue eliminado correctamente."); 
                        nom1 = " ";
                        orga1 = " ";
                        tel1 = " ";
                    }else if (nomC.equals(nom2)){
                        System.out.println("El contacto " + nom2 +  ", de organización: " + orga2 + " y teléfono: " + tel2 + " fue eliminado correctamente.");	
                        nom2 = " ";
                        orga2 = " ";
                        tel2 = " ";
                    }else if (nomC.equals(nom3)){
			System.out.println("El contacto es: nombre: " + nom3 +  " organización: " + orga3 + " teléfono: " + tel3 + " fue eliminado correctamente.");
                        nom3 = " ";
                        orga3 = " ";
                        tel3 = " ";
                    }else if (!nomC.equals(nom1) || !nomC.equals(nom2) || !nomC.equals(nom3)){
			System.out.println("El contacto ingresado no existe en la base de datos");
                    }
                    break;
                    
                case 4:
                    System.out.println("Que le vaya bien");
                    break;
                    default:  
                    System.out.println("Opción válida");
                    break;
            }
        }
        while (salirG == true);
    }
}

/*Se está creando una aplicación que va a estar conectada con un 
prototipo que permita almacenar contactos telefónicos en el dispositivo.
Para ello cada contacto debe contener nombre completo, teléfono y organización. 
Se requiere que la aplicación permita añadir 3 contactos verificando que el número no esté 
almacenado, buscar contactos almacenados y eliminar contactos si el usuario lo requiere. 
Recuerde que el sistema debe terminar cuando el usuario así lo indique.*/
