import java.util.ArrayList;
import java.util.List;


public class Ejercicio5 {
    public static void main(String[] args) {
        
        List<Integer> horasTrabajadas = new ArrayList <Integer> ();
        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
        
        List<Integer> valorPorHora = new ArrayList <Integer> ();
        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);

        List<Integer> totales = new ArrayList <Integer> ();

        int total = 0;
        for (int i = 0; i < 5; i ++){
            totales.add(valorPorHora.get(i)*horasTrabajadas.get(i));
            total += totales.get(i);
        }

        System.out.println(totales);

        System.out.println("Total Final: $ " + total);
    }
}