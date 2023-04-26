/*
 Crear una clase PersonaService,
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

package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class PersonaService {
    Scanner input = new Scanner(System.in);    
    /*
    a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
    */
    public Persona crearPersona(){
        System.out.println("Ingrese su Nombre"); 
        String nombre=input.nextLine();
        System.out.println("Ingrese la fecha de nacimiento (Año/Mes/Dia");
        int anio= input.nextInt()-1900;
        int mes=input.nextInt()-1;
        int dia= input.nextInt();
        Date nacimiento=new Date(anio,mes,dia);
        
        return new Persona(nombre, nacimiento);
    }
    
    /*
    b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
    */
    public int diferencia(Date fechaActual, Date nacimiento){
        int dif;
        dif=fechaActual.getYear()-nacimiento.getYear();
        
        return dif;
    }
    
    /*
    c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
    */
    public boolean menorQue(Persona persona, Date edadConsultada){
        return persona.getNacimiento().compareTo(edadConsultada)>=0;
        
    }
    
    /*
    d) Método mostrarPersona que muestra la información de la persona
deseada.
    */
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre de la Persona: " + persona.getNombre() + "\n" + "Fecha de Nacimiento: " + persona.getNacimiento());
    }
    
}
