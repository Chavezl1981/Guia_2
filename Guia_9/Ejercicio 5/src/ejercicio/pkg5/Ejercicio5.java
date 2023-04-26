/*
 5. Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
 */

package ejercicio.pkg5;

import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        PersonaService perSer = new PersonaService();
        Persona persona = perSer.crearPersona();
        Date hoy = new Date();
        
        perSer.diferencia(persona.getNacimiento(), hoy);
        
        System.out.println("Ingrese una fecha de nacimiento de otra persona");
        int anio=input.nextInt()-1900;
        int mes=input.nextInt()-1;
        int dia=input.nextInt();
        Date nuevo=new Date (anio,mes,dia);
        System.out.println(persona.getNombre()+ " es usted menor que la persona ingresada? " + perSer.menorQue(persona, nuevo));
        perSer.mostrarPersona(persona);
        
        /*
         Scanner leer = new Scanner(System.in);
        PersonaServicio perSer = new PersonaServicio();
        Persona per = perSer.crearPersona();
        Date hoy = new Date();
        
        perSer.calcularEdad(per.getFechaNac(), hoy);
        
        System.out.println("Ingrese una fecha de nacimiento de otra persona");
        int anio = leer.nextInt() - 1900;
        int mes = leer.nextInt() - 1;
        int dia = leer.nextInt();
        Date nuevo = new Date (anio, mes ,dia);
        System.out.println(per.getNombre() + " es usted menor que la persona ingresada? " + perSer.menorQue(per, nuevo));
        
        perSer.mostrarPersona(per);
        */
        
    }
    
}
