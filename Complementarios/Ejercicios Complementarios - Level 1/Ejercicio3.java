import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");

        int numero = scan.nextInt();
        scan.close();
 

        for (int i=1; i <=numero; i++) {

            for (int n=1; n <=i; n++) {
                System.out.print(n + " ");
            }
          
            System.out.println();
        }
        
    }
}