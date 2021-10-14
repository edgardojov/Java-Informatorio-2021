
public class Ejercicio1 {
    public static void main(String[] args) {
        String [] ciudadesFavoritas = {"Bariloche", "Córdoba", "Resistencia"};

        for (int i = 1; i < ciudadesFavoritas.length+1; i++ ){
            System.out.println("#"+i+" - "+ciudadesFavoritas[i-1]);
        }
    }
}