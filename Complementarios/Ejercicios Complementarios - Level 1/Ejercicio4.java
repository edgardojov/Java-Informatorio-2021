import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");

        
        int numero = scan.nextInt();
        scan.close();
        
        int factorial = 1;
        for (int i=1; i<=numero; i++) {
            factorial *= i;   
        }
        System.out.println(factorial);
        
    }
}