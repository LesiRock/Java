import java.util.Scanner;
public class Adinivar{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        String opcion;
        System.out.print("Que nivel quieres jugar FACIL escribe a, DIFICIL escribe b");
        opcion = entrada.nextLine();

        switch(opcion){
            case "a":
            case "A":
                num1 = (int) (Math.random()*10);
                num2 = (int) (Math.random()*10 + 1);
                break;

            case "b":
            case "B":
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
            System.out.print("CORRECTO");
        }else{
            System.out.print("INCORRECTO");
        }
        break;

        case 2: 
        System.out.print(num1 + "-" + num2 + "= ");
        res = entrada.nextDouble();
        entrada.nextLine();
        if(res == num1 - num2){
            System.out.print("CORRECTO");
        }else{
            System.out.print("INCORRECTO");
        }
        break;

        case 3: 
        System.out.print(num1 + "/" + num2 + "= ");
        res = entrada.nextDouble();
        entrada.nextLine();
        if(res == num1 / num2){
            System.out.print("CORRECTO");
        }else{
            System.out.print("INCORRECTO");
        }
        break;

        case 4: 
        System.out.print(num1 + "*" + num2 + "= ");
        res = entrada.nextDouble();
        entrada.nextLine();
        if(res == num1 * num2){
            System.out.print("CORRECTO");
        }else{
            System.out.print("INCORRECTO");
        }
        break;
    }
    }
}