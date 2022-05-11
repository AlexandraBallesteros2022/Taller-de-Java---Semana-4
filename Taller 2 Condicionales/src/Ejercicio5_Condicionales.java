
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
public class Ejercicio5_Condicionales {
    public static void main(String[]args){
        String nomCliente, nomProductoD = "", producto1, producto2, producto3, producto4;
        int opcion, valorDevolucion = 0, cantProductos, cantProductos2, cantProductos3, cantProductos4, valorP1, valorP2, valorP3, valorP4, sumTotal, sumTotal2, sumTotal3, sumTotal4;
        boolean devolucion = true;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nomCliente = input.nextLine();
        
        System.out.println(nomCliente +  " Por favor indique qué desea hacer: ");
	System.out.println("1. Ver las opciones de compra por producto.");
	System.out.println("2. Consultar los precios por producto.");
	System.out.println("3. Soliciar una devolución.");
	System.out.println("4. Comprar un producto.");
	opcion = input.nextInt();
        
        switch (opcion){
            case 1: System.out.println("1. Dolex analgésico");
                System.out.println("2. Clorfeniramida sonifero");
                System.out.println("3. Acetaminofén analgésico");
                System.out.println("4. Pentadol analgésico");
                break;
            
            case 2: System.out.println(" Los precios de los productos son:");
                System.out.println("1. Dolex 5.050");
                System.out.println("2. Clorfeniramida 25.430");
                System.out.println("3. Acetaminofén 2.550");
                System.out.println("4. Pentadol 35.450");
                break;
                    
            case 3: System.out.println("¿Está seguro que desea devolver un producto?, indique True para Sí ó False para No.");
                devolucion = input.nextBoolean();
                if (devolucion == true){
                    System.out.println("Ingrese el nombre del producto que desea devolver");
                    nomProductoD = input.next();
                    System.out.println("Ingrese el valor del producto que desea devolver");
                    valorDevolucion = input.nextInt();
                    
                    System.out.println(" Su producto " + nomProductoD + " fue aceptado para devolución, se retornará a su cuenta el valor de: " + valorDevolucion);
                }
                break;
                 
            case 4: System.out.println(" ¿Cuántos productos desea comprar?, máximo cuatro(4)");
                cantProductos = input.nextInt();
                if (cantProductos == 1){
                    System.out.println(" Ingrese el nombre del producto que desea comprar");
                    producto1 = input.next();
                    
                    System.out.println(" Ingrese el valor del producto");
                    valorP1 = input.nextInt();
                    
                    System.out.println(" El producto que usted desea comprar es: " + producto1 + " y cuesta " + valorP1);
                
                }else if (cantProductos == 2){
                    System.out.println(" Ingrese el nombre del primer producto");
                    producto1 = input.next();
                    
                    System.out.println("Nombre del segundo producto");
                    producto2 = input.next();
                    
                    System.out.println(" Ingrese el valor del primer producto");
                    valorP1 = input.nextInt();
                    
                    System.out.println("Valor del segundo producto");
                    valorP2 = input.nextInt();
				
                    sumTotal2 = valorP1 + valorP2;
				
		System.out.println(" El producto que usted desea comprar es: " + producto1 + " y " + producto2 + ", y cuestan " + sumTotal2);			
                
                }else if (cantProductos == 3){
                    System.out.println(" Ingrese el nombre del primer producto");
                    producto1 = input.next();
		
                    System.out.println(" Ingrese el nombre del segundo producto");
                    producto2 = input.next();
				
                    System.out.println(" Ingrese el nombre del tercer producto");
                    producto3 = input.next();
				
                    System.out.println(" Ingrese el valor del primer producto");
                    valorP1 = input.nextInt();
                    
                    System.out.println(" Ingrese el valor del segundo producto");
                    valorP2 = input.nextInt();
                    
                    System.out.println(" Ingrese el valor del cuarto producto");
                    valorP3 = input.nextInt();
				
                    sumTotal3 = valorP1 + valorP2 + valorP3;
				
                    System.out.println(" El producto que usted desea comprar es: " + producto1 + ", " + producto2 + ", " + "y " +  producto3 + ", y cuestan " + sumTotal3);
                    
                }else if (cantProductos == 4){
                    System.out.println(" Ingrese el nombre del primer producto");
                    producto1 = input.next();
				
                    System.out.println(" Ingrese el nombre del segundo producto");
                    producto2 = input.next();
				
                    System.out.println(" Ingrese el nombre del tercer producto");
                    producto3 = input.next();
				
                    System.out.println(" Ingrese el nombre del cuarto producto");
                    producto4 = input.next();
				
                    System.out.println(" Ingrese el valor del primer producto");
                    valorP1 = input.nextInt();
			
                    System.out.println(" Ingrese el valor del segundo producto");
                    valorP2 = input.nextInt();
				
                    System.out.println(" Ingrese el valor del tercer producto");
                    valorP3 = input.nextInt();
			
                    System.out.println(" Ingrese el valor del cuarto producto");
                    valorP4 = input.nextInt();
				
                    sumTotal = valorP1 + valorP2 + valorP3 + valorP4;
				
                    System.out.println(" Los productos que usted desea comprar son: " + producto1 + ", " + producto2 + ", " + producto3 + " y " + producto4 +  ", y cuestan " + sumTotal);				
			
                }else{
                    System.out.println( "Debe ingresar una opción válida");
            }      
        }
    }
}

//La Droguería Mi Salud presta sus servicios en la localidad 
//de Suba y requiere una aplicación para poder 
//facturar los productos que vende a sus clientes y para ello, 
//los productos tienen unas características 
//que deben indicársele al cliente para que pueda escoger 
//el producto a comprar. Para cada cliente, se 
//tienen las opciones de compra de producto, consulta de 
//precios por producto y devoluciones en caso de que se presenten.
