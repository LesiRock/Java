import java.util.Scanner;

public class AdivinarWhileFor{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        boolean jugar = true;

        long inicio = System.currentTimeMillis();//Milis son minisegundos
        long fin = inicio + 120000; //120000 milisegundos es igual a 2 minutos
        int atinadas = 0;

        while (jugar = true && System.currentTimeMillis() < fin){ //Mientras quiera jugar y el tiempo sea menor a 2 segundo
            int num1 = 0;
            int num2 = 0;
            String clase;
            System.out.print("Que nivel quieres jugar FACIL escribe a, DIFICIL escribe b");
            clase = entrada.nextLine();

            switch (clase.toLowerCase()){
                case "a":
                    num1 = (int) (Math.random()*10);
                    num2 = (int) (Math.random()*10 + 1);
                    break;

                case "b":
                    num1 = (int) (Math.random()*100);
                    num2 = (int) (Math.random()*99 + 1);
                    break;

                default:
                    System.out.print("OPCION INVALIDA");
            }

            int opcion1;
            double res;

        System.out.println("Selecciona la opcion de la operacion que quieres adivinar : \n 1.- SUMA\n 2.- RESTA\n 3.- DIVISION\n 4.- MULTIPLICACION");
        opcion1 = entrada.nextInt();
        entrada.nextLine();

        switch(opcion1){
            case 1: 
            System.out.print(num1  + " + " + num2 + "= ");
            res = entrada.nextDouble();
            entrada.nextLine();
            if(res == num1 + num2){
                System.out.print("CORRECTO ");
                atinadas++; //le sume cada vez que le atine
            }else{
                System.out.print("INCORRECTO ");
            }
            break;

            case 2: 
            System.out.print(num1 + "-" + num2 + "= ");
            res = entrada.nextDouble();
            entrada.nextLine();
            if(res == num1 - num2){
                System.out.print("CORRECTO ");
                atinadas++; 
            }else{
                System.out.print("INCORRECTO ");
            }
            break;

            case 3: 
            System.out.print(num1 + "/" + num2 + "= ");
            res = entrada.nextDouble();
            entrada.nextLine();
            if(res == num1 / num2){
                System.out.print("CORRECTO ");
                atinadas++; 
            }else{
                System.out.print("INCORRECTO");
            }
            break;

            case 4: 
            System.out.print(num1 + "*" + num2 + "= ");
            res = entrada.nextDouble();
            entrada.nextLine();
            if(res == num1 * num2){
                System.out.print("CORRECTO ");
                atinadas++; 
            }else{
                System.out.print("INCORRECTO");
            }
            break;

            default:
                System.out.println("Opcion inválida");
            }

            System.out.print("Quieres jugar de nuevo? (Si: 's' , No: 'n'): ");
            String respuesta = entrada.nextLine();
            jugar = respuesta.equalsIgnoreCase("s");
            //evalua si en mayuscula o minuscula se puso s, checar con un if
        }
        System.out.println("Gracias por participar!");
        entrada.close();
    }
}


