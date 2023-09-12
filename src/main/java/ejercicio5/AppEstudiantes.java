package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class AppEstudiantes {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Ernesto Garcia", "C/ Alvarado #34", 24, "5A3C");
        Estudiante e2 = new Estudiante("Maria Julia", "C/ San Fernando #88", 26, "5A8F");

        System.out.println(e1);
        System.out.println(e2);

        System.out.println();

        List<EstudianteInt> estudiantesInternacionales = new ArrayList<>();

        estudiantesInternacionales.add(new EstudianteInt("Juan Antonio", "C/ Fernando de Sayaz #353", 23, "1I14", true, Nacionalidad.INGLES.toString() ));
        estudiantesInternacionales.add(new EstudianteInt("Amador Lopez", "C/ Avellaneda #11", 21, "1I15", true, Nacionalidad.FRANCES.toString() ));
        estudiantesInternacionales.add(new EstudianteInt("Juan Antonio", "C/ Fernando de Sayaz #353", 20, "1I16", false, Nacionalidad.AMERICANO.toString() ));

        for (EstudianteInt ei : estudiantesInternacionales) {
            if (ei.esEuropeo() && ei.descuentosParaJovenes()) {
                System.out.println(ei);
            }
        }
    }
}
