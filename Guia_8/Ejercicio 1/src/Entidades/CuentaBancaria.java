/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

/**
 *
 * @author arLuChavez
 */
public class CuentaBancaria {
    private int numeroCuenta;       //Atributo
    private Long dniCliente;        
    private double saldoActual;

    public CuentaBancaria() {           //Primero pongo Constructor y los dejo vacios
    }

    public CuentaBancaria(int numeroCuenta, Long dniCliente, double saldoActual) {      //Pongo de nuevo Constructor y selecciono todos
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {          //Aca puse Getter and Setter y seleccione todos
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
    }

}
