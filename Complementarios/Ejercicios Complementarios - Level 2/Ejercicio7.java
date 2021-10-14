import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Ingresar un numero: ");
        numero1 = scan.nextInt();
        System.out.println("Ingresar un numero mayor al anterior: ");
    

        while (true) {
            numero2 = scan.nextInt();
            if (numero2 > numero1) {
                break;
            }
            System.out.println("Ingresar el numero nuevamente (debe ser mayor al anterior)");
        }
        
        scan.close();

        String[] lista = crearLista(numero1, numero2);

        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
        }
       
    }



    public static String[] crearLista (int numero1, int numero2){
        int longitud = numero2 - numero1;

        String[] lista2 = new String[longitud];
        int j = 0;

        for (int i = numero1; i < numero2; i++ ) {
            lista2[j] = determinarElto(i);
            j++;
        }
        return lista2;
    }



    public static String determinarElto (int numero) {
        String resultado = String.valueOf(numero);

        if (numero % 2 == 0 && numero % 3 == 0){
            resultado = " FizzBuzz ";
        }else if (numero % 3 == 0){
            resultado = " Buzz ";
        }else if (numero % 2 == 0){
            resultado = " Fizz ";
        }
        return resultado;
    }
}

