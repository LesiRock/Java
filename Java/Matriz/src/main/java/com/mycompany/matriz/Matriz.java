/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz;

import java.util.Scanner;

/**
 *
 * @author PILARES
 */
public class Matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros [] [] = new int [2] [2];
        
        numeros [0] [0] = 5;
        numeros [0] [1] = 3;
        numeros [1] [0] = 2;
        numeros [1] [1] = 1;
        
        System.out.print("[" + numeros [0] [0] + "]");//sin ln
        System.out.println("[" + numeros [0] [1] + "]");//con ln
        System.out.print("[" + numeros [1] [0] + "]");
        System.out.print("[" + numeros [1] [1] + "]");
        
        System.out.println(" ");
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2;j++){
                System.out.print(numeros[i][j]);
            }
            System.out.println(" ");
        }
        
        System.out.println("Cuantas filas quieres que tenga el arreglo");
        int filas = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Cuantas columnas deseas que tenga el arreglo");
        int columnas = entrada.nextInt();
        entrada.nextLine();
        
        int numeros1 [] [] = new int [filas][columnas];
        
        //entrada
        for(int j = 0; j<filas; j++){//i y j son locales
            for(int i = 0; i<columnas; i++){
                System.out.println("Ingresa el valor de la posicion [" + i + "][" + j + "]");
                numeros1[i][j]=entrada.nextInt();
            }
        }
        
        //recorrido
        for(int j = 0; j < filas; j++){// i y j son locales
            for(int i = 0; i < columnas; i++){
                System.out.println("El valor de la posicion[" + i + "][" + j + "]");
                System.out.println("es de " + numeros1[i][j]);
            }
        }
        
        for(int j = 0; j < filas; j++){//i y j locales
            for(int i = 0; i < columnas; i++){
                System.out.print("[" + numeros1[j][i]+ "]");
            }
            System.out.println("");
        }/*
        
        
        /*
        int[][] matrizA = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrizB = {{9,8,7}, {6,5,4}, {3,2,1}};
        
        int filas = matrizA.length;
        int columnas = matrizB.length;
        
        int[][] matrizSuma = new int[filas][columnas];
        
        //Calcular la suma de las matrices
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < filas; j++){
                System.out.print("[" + matrizSuma[i][j] + "]");
            }
            System.out.println("");
        }*/
    }
}
