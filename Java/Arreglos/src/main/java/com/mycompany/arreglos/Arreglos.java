/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglos;

import java.util.Scanner;

/**
 *
 * @author PILARES
 */
public class Arreglos {

    public static void main(String[] args) {
        /*int años[]={2019,2020,2021,2022,2023};
        for(int i=0; i < 5;i++ ){
            System.out.println("indice" + i);
            System.out.println("valor" +años[i]);
        }*/
            
        /*for(int i=0; i < años.lenght;i++ ){
            System.out.println("indice" + i);
            System.out.println("valor" +años[i]);
        }*/
        
        Scanner entrada = new Scanner(System.in);
        int lista[]= new int[10];
        int pares[];
        int impares[];
        int contador = 0;
        
        for(int i=0; i <lista.length;i++){
            System.out.println("Ingresa un numero para la lista" );
            lista[i]=entrada.nextInt();
        }
        
        for(int i=0;i<lista.length;i++){
            if(lista[i] % 2 == 0){
                contador=contador+1;
            }
        }
        System.out.println("Total de pares : " + contador);
        
        for(int i=0;i<lista.length;i++){
            if(lista[i] % 2 != 0){
                contador=contador+1;
            }
        }
        System.out.println("Total de impares : " + contador);
    }
}
