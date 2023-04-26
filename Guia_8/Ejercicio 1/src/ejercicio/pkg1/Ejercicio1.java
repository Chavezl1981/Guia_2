/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg1;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;



/**
 *
 * @author arLuChavez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria c1 = cbs.crearCuenta();
        cbs.ingresar(c1);
        cbs.retirar(c1);
        cbs.extraccionRapida(c1);
        cbs.consultarSaldo(c1);
        cbs.consultarDatos(c1);

    }
}
