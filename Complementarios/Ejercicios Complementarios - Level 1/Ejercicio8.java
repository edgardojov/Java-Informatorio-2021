import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args) {
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese Nombre y Apellido: ");
        String nombreYApellido = scan.nextLine();

        System.out.println("Ingrese Edad: ");
        String edad = scan.nextLine();
        
        System.out.println("Ingrese Direccion: ");
        String direccion = scan.nextLine();
        
        System.out.println("Ingrese Ciudad: ");
        String ciudad = scan.nextLine();

        scan.close();


        String datos = ciudad + " - " + direccion + " - " + edad + " - " + nombreYApellido;


        System.out.println(datos);
    }
}