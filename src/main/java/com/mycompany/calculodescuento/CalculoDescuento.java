/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculodescuento;

import java.util.Scanner;

/**
 *
 * @author MAU PALACIOS
 */
public class CalculoDescuento { 


    //descuento por defecto (10%)
    public static double calcularDescuento(double montoTotal) {
        return calcularDescuento(montoTotal, 10.0);
    }
    
    //sobrecargado con descuento personalizado
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100);
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Primera llamada descuento 10%
        double monto1 = 1000.0;
        double descuento1 = calcularDescuento(monto1);
        double montoFinal1 = monto1 - descuento1;
        
        System.out.println("Compra con 10% de descuento:");
        System.out.println("Monto original: $" + monto1);
        System.out.println("Descuento: $" + descuento1);
        System.out.println("Monto final: $" + montoFinal1);
        
        // Segunda llamada pedir porcentaje de descuento
        double monto2 = 1000.0;
        System.out.print("Ingrese el porcentaje de descuento personalizado: ");
        double porcentajeDescuento = scanner.nextDouble();
        double descuento2 = calcularDescuento(monto2, porcentajeDescuento);
        double montoFinal2 = monto2 - descuento2;
        
        System.out.println("Compra con " + porcentajeDescuento + "% de descuento:");
        System.out.println("Monto original: $" + monto2);
        System.out.println("Descuento: $" + descuento2);
        System.out.println("Monto final: $" + montoFinal2);
        
        scanner.close();
    }
}
