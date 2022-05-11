
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
public class Ejercicio7_Condicionales {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double imc, estatura;
        int peso;
        String nombre;

        System.out.println("Ingrese su nombre");
        nombre = input.next();

        System.out.println(nombre + ", por favor ingrese su estatura en metros.");
        estatura = input.nextDouble();
        System.out.println("Ahora ingrese su peso en kilogramos");
        peso = input.nextInt();
        imc = peso / (estatura * estatura);

        if (imc < 18.5) {
            System.out.println(nombre + ", usted está bajo peso, busque ayuda médica.");

        } else if (imc >= 18.5 & imc < 25) {
            System.out.println(nombre + ", usted tiene un peso ideal.");

        } else if (imc >= 25 & imc < 30) {
            System.out.println(nombre + ", usted está sobrepeso, busque ayuda médica.");

        } else if (imc >= 30 & imc < 35) {
            System.out.println(nombre + ", usted está obeso, busque ayuda médica.");
        }
    }
}

/*La Secretaría de Salud Municipal requiere de una aplicación que le 
permita calcular el IMC (Índice de masa corporal) 
y requiere los datos peso en kilogramos y estatura en metros 
Para cada persona encuestada adicional a los datos 
suministrados, debe mostrar el resultado para cada uno y 
establecer en qué rango se encuentra (bajo peso, normal, sobrepeso y obeso).*/
