package cuentas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author rufis
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCuenta cuenta1= null;
        double saldoActual= 0;
        operativa_cuenta(cuenta1, saldoActual);
    }

    public static void operativa_cuenta(CCuenta cuen, double saldo) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1= new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual= cuenta1.estado();
        System.out.println("El saldo actual es" +saldoActual);
        try {
            cuenta1.retirarSaldo(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresarSaldo(695);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}
