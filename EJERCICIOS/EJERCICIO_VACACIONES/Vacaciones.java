import java.util.Scanner;

public class Vacaciones{
    public static void main(String [] args){
        String nombre;
	int clave;
	int antiguedad;

	Scanner sc = new Scanner(System.in);

	System.out.println("----\nBIENVENIDO AL SISTEMA\n----");
	System.out.println("Ingresa el nombre del trabajador");
	nombre = sc.nextLine();

        System.out.println("Cuantos años tiene de servicio el trabajador");
	antiguedad = sc.nextInt();
	sc.nextLine();

	System.out.println("Cual es el departamento al que pertenece " + nombre);
	clave = sc.nextInt();
	sc.nextLine();

	if(clave == 1){
	    if(antiguedad == 1){
	    	System.out.println(nombre + ", Tienes derecho a 6 días de vacaciones");
	    }else if(antiguedad >= 2 && antiguedad <= 6){
	   	System.out.println(nombre + ", Tienes derecho a 14 días de vacaciones");
	    }else if(antiguedad >= 7){
	    	System.out.println(nombre + ", Tienes derecho a 20 días de vacaciones");
	    }else{
	    	System.out.println(nombre + ", No tienes derecho a vacaciones");
	    }

	}else if(clave == 2){
 	    if(antiguedad == 1){
	    	System.out.println(nombre + ", Tienes derecho a 7 días de vacaciones");
	    }else if(antiguedad >= 2 && antiguedad <= 6){
	   	System.out.println(nombre + ", Tienes derecho a 15 días de vacaciones");
	    }else if(antiguedad >= 7){
	    	System.out.println(nombre + ", Tienes derecho a 22 días de vacaciones");
	    }else{
	    	System.out.println(nombre + ", No tienes derecho a vacaciones");
	    }

	}else if(clave == 3){
	    if(antiguedad == 1){
	    	System.out.println(nombre + ", Tienes derecho a 10 días de vacaciones");
	    }else if(antiguedad >= 2 && antiguedad <= 6){
	   	System.out.println(nombre + ", Tienes derecho a 20 días de vacaciones");
	    }else if(antiguedad >= 7){
	    	System.out.println(nombre + ", Tienes derecho a 30 días de vacaciones");
	    }else{
	    	System.out.println(nombre + ", No tienes derecho a vacaciones");
	    }

	}else{
	    System.out.println("Clave Invalida");
	}
 }
}