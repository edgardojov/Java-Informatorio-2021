
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una palabra en minuscula: ");
        String entrada = scan.nextLine();
        char[] caracteres = entrada.toCharArray();
        scan.close();

        for (int i = 0; i < caracteres.length; i++){
            if (caracteres[i] >= 'a' && caracteres[i] <= 'z') {
                caracteres[i] = (char)(caracteres[i] - (int) 'a' + (int) 'A');
            }
            System.out.print(caracteres[i]);
        }

        System.out.println();
       
    }
}

