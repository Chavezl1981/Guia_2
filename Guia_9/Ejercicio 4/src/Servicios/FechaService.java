/*
 4. Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion
Oracle
 */

package Servicios;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class FechaService {
 
    /*
    a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
    */
    
    public Date fechaNacimiento(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese dia de Nacimiento");
        int dia = input.nextInt();
        System.out.println("Ingrese mes de Nacimiento");
        int mes = input.nextInt()-1;
        System.out.println("Ingrese año de Nacimiento");
        int anio = input.nextInt() - 1900;
        
        return new Date(anio,mes,dia);
        
    }
    
    /*
    b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
    */
    public Date fechaActual(){
        
        
        return new Date();
    }
    
    /*
    c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion
Oracle
    */
    public int diferencia(Date fechaActual, Date fechaNacimiento){
        int dif;
        dif=fechaActual.getYear()-fechaNacimiento.getYear();
        
        return dif;
    }
}



