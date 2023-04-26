/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
//Crea un  objeto de tipo cuenta bancaria
    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el numero de cuenta");
        int numeroCuenta = input.nextInt();       //Atributo
        System.out.println("Ingrese DNI del cliente");
        Long dniCliente = input.nextLong();
        System.out.println("Ingrese el saldo inicial");
        double saldoActual = input.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);

    }

    //Crea un metodo que recibe una cuenta bancaria por parametro y permite ingresar dinero
    public void ingresar(CuentaBancaria c) {
        System.out.println("Cuanto dinero desea ingresar?");
        c.setSaldoActual(c.getSaldoActual() + input.nextDouble());
        System.out.println("Dinero ingresado, su saldo actual es " + c.getSaldoActual());
    }

    public void retirar(CuentaBancaria c) {
        System.out.println("Cuanto dinero desea retirar?");
        double retiro = input.nextDouble();

        if (retiro > c.getSaldoActual()) {
            System.out.println("Saldo Insuficiente. Se retirará lo que haya en cuenta");
            System.out.println("Se retiro " + c.getSaldoActual() + " y la cuenta quedo en 0");
            c.setSaldoActual(0);

        } else {
            c.setSaldoActual(c.getSaldoActual() - retiro);
            System.out.println("Su saldo actual es " + c.getSaldoActual());
        }
        

    }
    public void extraccionRapida(CuentaBancaria c) {
        if (c.getSaldoActual() >= 1000) {
            c.setSaldoActual(c.getSaldoActual() - (c.getSaldoActual() * 0.2));
            System.out.println("Tu saldo restante es " + c.getSaldoActual());

        } else {
            System.out.println("Fondos Insuficientes");
        }
    }

    public void consultarSaldo(CuentaBancaria c) {
        System.out.println("Su saldo es " + c.getSaldoActual());

    }

    public void consultarDatos(CuentaBancaria c) {
        System.out.println(c.toString());

    }

}
