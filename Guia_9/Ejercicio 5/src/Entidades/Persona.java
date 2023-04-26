/*
 Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set.
 */

package Entidades;

import java.util.Date;

/**
 *
 * @author arLuChavez
 */
public class Persona {
    public String nombre;
    public Date nacimiento;
//Constructor Vacio
    public Persona() {
    }
//Constructor Parametrizado
    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }
//Get and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
}
