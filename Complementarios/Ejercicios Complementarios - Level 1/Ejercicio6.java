import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la base: ");
        int num1 = scan.nextInt();
        
        System.out.println("Ingrese el exponente: ");
        int num2 = scan.nextInt();
        int resultado = num1;

        scan.close();

        for (int i = 1 ; i < num2; i ++){
            resultado = resultado * num1;
        }
        System.out.println(num1 + " elevado a " + num2 + " = " + resultado);
    }
}