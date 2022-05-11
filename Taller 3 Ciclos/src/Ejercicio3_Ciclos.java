/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio3_Ciclos {

    public static void main(String[] args) {

        //Primer arbol
        /*int max = 20;
        int j = 1, k = 0;

        System.out.println();
        for (int i = 0; i <= max; i += 2) {
            int spc = (5 + (int) Math.ceil(max / 2) - j);
            String spaces = new String(new char[spc]).replace("\0", " ");
            String asteri = new String(new char[i + 1]).replace("\0", "*");
            System.out.println(spaces + asteri);
            j++;
        }

        // tronco
        if (max >= 10) {
            int spc = (5 + (int) Math.ceil(max / 2) - 2);
            String spaces = new String(new char[spc]).replace("\0", " ");
            String asteri = new String(new char[2]).replace("\0", "*");
            String spaces1 = new String(new char[spc]).replace("\0", " ");
            String asteri1 = new String(new char[4]).replace("\0", "*");
            String spaces2 = new String(new char[spc]).replace("\0", " ");
            String asteri2 = new String(new char[6]).replace( "\0", "*");
            System.out.println(spaces + asteri);
            System.out.println(spaces1 + asteri1);
            System.out.println(spaces2 + asteri2);
        }
        System.out.println();*/
        int k = 1, i = 1, j = 1, l = 1, m = 1, n = 0, z = 0, x = 10, t = 7;
        
        do {
            //Ciclo para pintar el arbol
            do {
                System.out.print(" ");
                i = i + 1;
            } while (i <= 12 - k);
            i = 1;

            if (k < 12) {
                do {
                    System.out.print("*");
                    j = j + 1;
                } while (j <= 2 * k - 1);
                
            }else {
                //Ciclos para pintar el tronco
                if (k >= 12 & k <= 13) {
                    do {
                        System.out.print(" ");
                        m = m + 1;
                    } while (m <= 9);
                    m = 1;
                    do {
                        System.out.print("*");
                        m = m + 1;
                    } while (m < 4);
                
                } else {
                    do {
                        System.out.print(" ");
                        m = m + 1;
                    } while (m != x - 1);
                    x = x - 1;
                    m = 1;

                    do {
                        System.out.print("*");
                        m = m + 1;
                    } while (m != t - 1);
                    t = t + 2;
                    m = 1;
                }
            }
           
            m = 1;
            i = 1;
            j = 1;
            System.out.println(" ");
            k = k + 1;
        
        }while (k < 16);
    }  
}



