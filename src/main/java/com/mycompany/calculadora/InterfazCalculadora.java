/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Ale
 */
public class InterfazCalculadora {

    public static void main(String[] args) {
        
        CalculadoraNormal ClienteCalculadoraNormal= new CalculadoraNormal(48,20);
        System.out.println("Cliente 1:\n");
        double suma = ClienteCalculadoraNormal.sumarEnteros();
        double resta = ClienteCalculadoraNormal.restarEnteros();
        double multiplicacion= ClienteCalculadoraNormal.multiplicarEnteros();
        double division= ClienteCalculadoraNormal.dividirEnteros();
        double raizCuad= ClienteCalculadoraNormal.calcularRaizCuadrada();
        
        System.out.println("Suma: "+suma+"\nResta: "+resta+"\nMultiplicacion: "+multiplicacion+
                "\nDivisión: "+division+"\nraiz Cuadrada: "+raizCuad);
        
        CalculadoraEspecial ClienteCalculadoraEspecial= new CalculadoraEspecial(300,50);
        System.out.println("\nCliente 2\n");
        System.out.println("Suma dividida en 2: "+ClienteCalculadoraEspecial.sumarEnteros());
        System.out.println("Resta dividida en 2: "+ClienteCalculadoraEspecial.restarEnteros());
        System.out.println("Multiplicación dividido en 2: "+ClienteCalculadoraEspecial.multiplicarEnteros());
        System.out.println("División dividida en 2: "+ClienteCalculadoraEspecial.dividirEnteros());
        System.out.println("Radical dividido en 2: "+ClienteCalculadoraEspecial.calcularRaizCuadrada());
        
    }
}
