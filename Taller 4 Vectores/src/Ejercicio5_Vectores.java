
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
//FUNCIONA
public class Ejercicio5_Vectores {
  public static void main(String[]args){
      Scanner teclado = new Scanner(System.in);
      
      int f, c, filaC, columnaC, fila, columna, vector1, vectorIn,  vectorInF, vector2;
      int matriz[][] = new int [10][10];
	
	for (vectorIn = 0; vectorIn< 9; vectorIn++){
        vector1 = vectorIn;
            System.out.print("       " + vectorIn);
        }
	
      System.out.println(" ");
	
	for (f = 0; f<9; f++){//Ciclo para recorrer las filas
		for (c = 0; c<9; c++){//Ciclo para recorrer las columnas
                    matriz[f][c] = (c+1) * (f+1);
                }
        }
		
		for (fila = 1; fila<10; fila++){
			for (columna = 1; columna< 10; columna++){
				if (columna ==1){
                                    System.out.print(fila - 1 + "   ");
                                }
				
				if (fila != 10){
                                    System.out.print(columna + " x " + fila + "   ");
                                }else{
                                    System.out.print(columna + " x " + fila + "  ");
                                }
                        }
			System.out.println(" ");
                }

	System.out.println(" ");
	
	System.out.println("Ingrese la fila  y la columna de la matriz para ver el resultado");
	System.out.print("Fila ");
	filaC = teclado.nextInt();
	System.out.print("Columna ");
	columnaC = teclado.nextInt();
	System.out.println("El resultado de la multiplicación es: " + matriz[filaC] [columnaC]);	
  }  
}

//Se debe de imprimir el siguiente cuadro
//El usuario deberá insertar la fila y columna de la cual desea ver el resultado, 
//el resultado de cada celda debe estar previamente calculado en una matriz bidimensional 
//la cual cada resultado obedecerá a la fila y columna insertada por el usuario.
