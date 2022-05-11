
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
public class Ejercicio4_Ciclos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador, num, resultado;

        System.out.println("Por favor ingrese un número");
        num = input.nextInt();

        contador = 1;
        for (contador = 1; contador < 11; contador++) {
            resultado = num * contador;
            System.out.println(contador + " x " + num + " = " + resultado);
        }
    }
}
/*Se requiere un programa que pueda crear la tabla de multiplicar del número que 
el usuario indique por medio del ciclo Para; esta debe ser impresa del 1 al 10.*/