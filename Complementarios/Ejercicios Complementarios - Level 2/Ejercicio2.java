import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio2{
    public static void main(String[] args) {

        int [] numeros = {2,3,4,5};
        int tamanioInicial = numeros.length;
        
        int tamanioPost = tamanioInicial + 2;
        int [] lista = new int [tamanioPost];
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero al principio de la lista: ");
        int antes = scan.nextInt();

        System.out.println("Ingrese un numero al final de la lista: ");
        int despues = scan.nextInt();

        lista[0] = antes;
        
        for (int i = 0; i < numeros.length; i++){
           lista[i+1] = numeros[i];
        }

        lista[tamanioInicial+1] = despues;

        System.out.println("Tamaño antes: "+ tamanioInicial);
        System.out.println("Tamaño despues: "+ tamanioPost);
        System.out.println("Array nuevo:\n"+ Arrays.toString(lista));
        scan.close();
    }
}
