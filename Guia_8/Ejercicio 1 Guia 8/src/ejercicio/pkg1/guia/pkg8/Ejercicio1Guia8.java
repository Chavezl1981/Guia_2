/*
 Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, 
con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
_Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
_Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
_Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
_Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
_Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */

package ejercicio.pkg1.guia.pkg8;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class Ejercicio1Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancariaServicio cbs= new CuentaBancariaServicio();
        CuentaBancaria cb= cbs.crearCuenta();
        Scanner input = new Scanner(System.in);
        
     
       // cbs.crearCuenta();
         
        System.out.println("Usted esta por ingresar");
        cbs.ingresar(cb, input.nextDouble());
        System.out.println("usted esta por retirar");
        cbs.retirar(cb, input.nextDouble());
         System.out.println("Ingrese extracion rapida a usar");
        double saldoActual = input.nextDouble();
        cbs.extraccionRapida(cb, saldoActual);
        
        cbs.consultaDatos(cb);
    }
    
}
