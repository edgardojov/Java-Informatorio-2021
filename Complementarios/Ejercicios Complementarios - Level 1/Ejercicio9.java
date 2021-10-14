import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese una frase, texto, etc: ");
        String entrada = scan.nextLine();

        System.out.println("Ingrese la letra que desea contar: ");
        char caracter = scan.next().charAt(0);
        
        scan.close();

        char[] letras = entrada.toCharArray();
        int cantidad = 0;

        for (int i = 0; i < letras.length; i++){
            if (letras[i] == caracter){
                cantidad++;
            }

        }

        System.out.println("Cantidad de veces que aparece la letra " + caracter + ": " + cantidad);
        

    }
}