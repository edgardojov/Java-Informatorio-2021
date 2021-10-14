import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        List<String> barajaFrancesa = new ArrayList<>();
        
        cargarCartas(barajaFrancesa);

        System.out.println("Numeros de la baraja francesa:");

        for (int a = 0; a < barajaFrancesa.size(); a++){
        System.out.println(barajaFrancesa.get(a));
        }


        System.out.println("Numeros de forma inversa:");
        Collections.reverse(barajaFrancesa);

        for (int b = 0; b < barajaFrancesa.size(); b++ ){
            System.out.println(barajaFrancesa.get(b));
        }
    
        System.out.println("Baraja mezclada");
        Collections.shuffle(barajaFrancesa);

        for (int c = 0; c < barajaFrancesa.size(); c++) {
            System.out.println(barajaFrancesa.get(c));
        }

    }

    public static void cargarCartas (List<String> baraja) {
        baraja.add ("A");   
        baraja.add ("2");
        baraja.add ("3");
        baraja.add ("4");
        baraja.add ("5");
        baraja.add ("6");
        baraja.add ("7");
        baraja.add ("8");
        baraja.add ("9");
        baraja.add ("10");
        baraja.add ("J");
        baraja.add ("Q");
        baraja.add ("K");
    }

}