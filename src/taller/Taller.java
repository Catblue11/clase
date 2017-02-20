
package taller;
import java.util.Scanner;

public class Taller {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    
     /// CREAMOS UNAA CUENTAS BANCARIAS LAS CUALES LUEGO MODIFICAREMOS 
     
     CuentaBancaria b1 = new CuentaBancaria("pedro", 1224, 5000, 2);
     CuentaBancaria b2 = new CuentaBancaria("Sara", 3452, 8000, 1.5);
     CuentaBancaria b3 = new CuentaBancaria("Rosa", 9867, 6500, 3.5);
     CuentaBancaria b4 = new CuentaBancaria("Daniel", 7645, 1000, 1);
     CuentaBancaria b5 = new CuentaBancaria("Tati", 7646, 3419, 1.3);
     
    
     System.out.println("Bienvenido a DMG BANK su banco amigo");
     
        System.out.println(b1.imprimirSaldo());
     
     b1.calcularInteres();
     
        System.out.println(b1.imprimirSaldo());
             

    
}}
