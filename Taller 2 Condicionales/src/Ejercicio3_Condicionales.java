
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
public class Ejercicio3_Condicionales {

    public static void main(String[] args) {
        String nombreA;
        int edad;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellidos: ");
        nombreA = input.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();

        if (edad >= 18) {
            System.out.println(nombreA + " usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        } else if (edad <= 18) {
            System.out.println(nombreA + " usted es menor de edad, por lo tanto,"
                    + "no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
    }
}

//Realizar un programa en el cual se solicite el nombre, apellidos y edad de la persona. 
//Si la persona es mayor o igual a 18 años, entonces se deberá imprimir en pantalla 
//[Nombre completo] usted es mayor de edad, por lo tanto puede entrar a la fiesta. 
//Si la edad de la persona es menor que 18 años, entonces, deberá imprimirse el 
//siguiente mensaje:[Nombre completo] usted es menor de edad, por lo tanto, 
//no puede entrar a la fiesta, por favor devuélvase a su casa.
