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

package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class CuentaBancariaServicio {
    Scanner input = new Scanner(System.in); 
    
    public CuentaBancaria crearCuenta(){
        //CuentaBancaria cb=new CuentaBancaria();
        System.out.println("Ingrese Numero de Cuenta");
        int numerocuenta=input.nextInt();
        System.out.println("Ingrese DNI");
        long dnicliente=input.nextLong();
        System.out.println("Ingrese Saldo Actual");
        double saldoactual=input.nextDouble();
        System.out.println("Cuenta Creada");
        return new CuentaBancaria(dnicliente, numerocuenta, saldoactual);
    }
    
    public void ingresar (CuentaBancaria cbancaria, double saldoActual){
      double saldoviejo = cbancaria.getSaldoActual();
      cbancaria.setSaldoActual(saldoActual + saldoviejo);
        System.out.println("Su saldo es " + cbancaria.getSaldoActual());
                
    }
    public void retirar (CuentaBancaria cbancariaret, double saldoActual){
        double saldoanterior = cbancariaret.getSaldoActual();
        cbancariaret.setSaldoActual(saldoanterior - saldoActual);
        System.out.println("Su saldo actual es " + cbancariaret.getSaldoActual());
        
    }
    public void extraccionRapida(CuentaBancaria operacionrapida, double saldoretira){
        double disponiblerapido = operacionrapida.getSaldoActual();
        if (disponiblerapido * 0.2 <= saldoretira) {
            System.out.println("No puede retirar esa cantidad");
            
        }else   {
            double saldoanterior = operacionrapida.getSaldoActual();
            operacionrapida.setSaldoActual(saldoanterior - saldoretira);
            System.out.println("La operacion se concreto con exito");
        }
             
    }
    public void consultarSaldo (CuentaBancaria consulta){
        System.out.println("La cuenta actual tiene " + consulta.getSaldoActual());
        
        
    }
    public void consultaDatos (CuentaBancaria info){
        System.out.println("Datos de la cuenta " + info.getNumeroCuenta());
        System.out.println("Datos del Cliente (DNI)" + info.getDniCliente());
        System.out.println("Datos cuenta "); 
        consultarSaldo(info);
      
    }
}



    