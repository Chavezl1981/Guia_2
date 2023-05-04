/*
 Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
examen final. La escuela nos ha pedido que calculemos el promedio de notas
final de todos sus alumnos y saber qué alumnos han recibido una nota por
encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
 */

package ejerciciopractico;

import entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class EjercicioPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Estudiante[]estudiantes = new Estudiante[8];
        System.out.println("Para analizar el resultado del curso, deberá Ingresar el nombre y la nota de 8 estudiantes");
        System.out.println("");
        
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese el nombre del estudiante");
            String nombre = input.next();
            System.out.println("Ingrese la nota del estudiante");
            double nota = input.nextDouble();
            estudiantes[i] = new Estudiante(nombre, nota);
            
        }
      
        double sumaNotas = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            sumaNotas += estudiantes[i].getNota();
            
        }
        double promedioNotas = sumaNotas / estudiantes.length;
        System.out.println("El promedio de todas las notas es: " + promedioNotas);
        int contador=0;
        
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota()>promedioNotas) {
                contador++;
                                
            }
            
        }
        String[] nombresEstudiantes = new String[contador];
        contador=0;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota()>promedioNotas) {
                nombresEstudiantes[contador]=estudiantes[i].getNombre();
                 contador++;               
            }
            
        }
        
        for (int i = 0; i < nombresEstudiantes.length; i++) {
            System.out.println("El estudiante " + nombresEstudiantes[i] + " supera el promedio.");
             
            
        }
        
    }
    
}
