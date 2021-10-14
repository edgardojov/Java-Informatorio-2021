import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = scan.nextInt();
        scan.close();

        for (int i = 0; i < num2; i++) {
                suma = suma+num1;
        }
        
        System.out.println(num1+ " x " + num2 + " = " + suma);
        

    }
}