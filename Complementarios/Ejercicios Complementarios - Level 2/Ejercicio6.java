import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Map<Integer, Integer> dicc = new HashMap<Integer, Integer>();
        
        
        Set<Empleado> listaEmpleados = new HashSet<>();
        listaEmpleados.add(new Empleado("Juan Román", " Riquelme", 29053673, 12, 500));
        listaEmpleados.add(new Empleado("Martín", "Palermo", 25677953, 4, 200));
        listaEmpleados.add(new Empleado("Carlos", "Tevez", 20534455, 8, 450));
        listaEmpleados.add(new Empleado("Rolando", "Schiavi", 33677240, 8, 450));
        listaEmpleados.add(new Empleado("Guillermo", "Schelotto", 22265475, 4, 200)); 

        for (Empleado empleado : listaEmpleados) {
            
            int sueldoCalculado = empleado.getHorasTrabajadas() * empleado.getValoPorHora();
            dicc.put(empleado.getDni(), sueldoCalculado);
            
            
            
        }
        System.out.print(dicc);
        
    }

    
}

class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private int horasTrabajadas;
    private int valoPorHora;

    public Empleado( String nombre, String apellido, int dni, int horasTrabajadas, int valorPorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valoPorHora = valorPorHora;
    }
    public int getDni() {
        return dni;
    }
    public int getValoPorHora() {
        return valoPorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

        
}