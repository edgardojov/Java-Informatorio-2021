import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {

        ArrayList<String> estudiantes = new ArrayList <String>();
        String [] datos = {"Javier","Roberto","Juan","Martin","Sebastian","Rocio","Mario","Romina","Florencia","Lucia","Jorge","Mariana"};
        

        for(int i=0; i < datos.length; i++){
            estudiantes.add(i,datos[i]);
        }
        
        List<String> primerCurso = estudiantes.subList(0, 4);
        List<String> segundoCurso = estudiantes.subList(4, 8);
        List<String> tercerCurso = estudiantes.subList(8, 12);

    

        System.out.println("Primer curso: "+ primerCurso);
        System.out.println("Segundo curso: "+ segundoCurso);
        System.out.println("Tercer curso: "+ tercerCurso);
    }
}
