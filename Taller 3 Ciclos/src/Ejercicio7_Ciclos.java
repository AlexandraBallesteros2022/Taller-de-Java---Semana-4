
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
public class Ejercicio7_Ciclos {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        String placa="", marca="", nom="", tel="", repet="", placaC="";
	int opcion, cantVeh=0;
	boolean salir = false;
	
        do{
		
	System.out.println("De acuerdo al menú ¿qué desea hacer?");
	System.out.println("1. Ingresar vehículo al parqueadero");
	System.out.println("2. Consultar vehículo en parqueadero");
	System.out.println("3. Retirar vehículo del parqueadero");
	System.out.println("4. Salir del sistema");
	opcion = input.nextInt();
	
	switch (opcion){
		
            case 1:
		if (cantVeh <= 5){
                    System.out.println( "Ingrese la placa del vehículo");
                    placa = input.next();
                    System.out.println("Ingrese la marca del vehículo");
                    marca = input.next();
                    System.out.println("Ingrese el teléfono del cliente");
                    tel = input.next();
                    System.out.println("Ingrese el nombre del cliente");
                    nom = input.next();
                    System.out.println("Vehículo de marca " + marca + " con placa " + placa + " fue ingresado al parqueadero por el cliente, " + nom + " teléfono de contacto " + tel);
                    cantVeh = cantVeh + 1;
                }else{
		    System.out.println("No es posible ingresar más vehículos");
                    System.out.println("Qué opción desea");
                    opcion = input.nextInt();
                }
                break;
            
            case 2:
		System.out.println("Ingrese la placa del vehículo que desea consultar");
		placaC = input.next();
		if (placaC.equals(placa)){
			System.out.println("El vehículo de placa: " + placa + " marca " + marca + ", se encuentra en el parqueadero");
                }else{
                    System.out.println( "El vehículo consultado no se encuentra en el parqueadero");
                }
                break;
                
            case 3:
		System.out.println("Ingrese la placa del vehículo que desea retirar");
		placaC = input.next();
		if (placaC.equals(placa)){
                    System.out.println("El vehículo de placa " + placa + " marca " + marca + ", ha sido retirado del parqueadero.");
                    placa = ""; 
                    marca = ""; 
                    nom = "";
                    tel = "";
                }else{
                    System.out.println("El vehículo de placa " + placa + " marca " + marca + " ya ha sido retirado del parqueadero");	
                }
                break;
                
            case 4:
                System.out.println("Que le vaya bien.");   
                salir = true;
                break; 
                default:  
                    System.out.println("Opción válida");
                     break;
                }
        } 
        while(salir == false);
    }
}

//Se sugiere que el parqueadero tenga los atributos del vehículo como son, placa y marca, 
//y los datos del cliente como son nombre completo y número de teléfono. 
//Para cada vehículo se debe permitir la opción de ingresar al parqueadero, 
//retirar del parqueadero y consultar si un vehículo se encuentra en el parqueadero. 
