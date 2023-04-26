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

package Entidades;

/**
 *
 * @author arLuChavez
 */
public class CuentaBancaria {
    
    private long dniCliente;
    private int numeroCuenta;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(long dniCliente, int numeroCuenta, double saldoActual) {
        this.dniCliente = dniCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
}
