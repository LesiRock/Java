import java.util.Scanner;

public class Taller1{
    public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

      String nombre;
      int anio_nac;
      int anio_actual;
      int edad;
      System.out.println("Ingresa tu nombre");
      nombre = entrada.nextLine();
      System.out.println("Ingresa tu año de nacimiento");
      anio_nac = entrada.nextInt();
      System.out.println("Ingresa el año actual");
      anio_actual = entrada.nextInt();
      System.out.println("Ingresa tu edad");
      edad = entrada.nextInt();
      boolean cdmx = true;
      char sexo = 'h';
      double peso = 69.9;
      double talla = 27.5;
      double calzado = 32;
      double aux;
      /*talla = aux;
      talla = calzado;
      calzado = aux;*/
//imprimo datos
      System.out.println("Nombre; " + nombre);
      System.out.println("Año actual; " + anio_actual);
      System.out.println("Año de nacimiento; " + anio_nac);
      System.out.println("Edad; " + (anio_actual - anio_nac));
      System.out.println("Tu edad en 5 años sera; " + (edad + 5));
      System.out.println("Tu edad en en meses es; " + (edad * 12));
      peso = 70;
      System.out.println(peso);
      System.out.print("Mayor de edad:" +(edad > 18)+"\n");

//condicional simple
      /*if(edad>= 18){
	System.out.print("Eres mayor de edad");
	}else{System.out.println("Eres menor de edad");
	}*/

//condicional añadida
      if(edad>= 18){
	  if(edad < 26){
                System.out.print("Estas en la juventud");
	  }else if (edad < 59){
                System.out.println("Estas en la adultez");
          }else if (edad < 60){
                System.out.println("Estas en la vejez");
	  }
      }else{
         if (edad < 5){
           System.out.print("Estas en la primera infancia");
         }else if (edad < 11){
           System.out.print("Estas en la infancia");
         }else if (edad > 11){
           System.out.print("Estas en la adolescencia");
         }   
      }          
 } 
}