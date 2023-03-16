/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Ale
 */
public class CalculadoraEspecial extends CalculadoraNormal {
    
    public CalculadoraEspecial(int numero1, int numero2) {
        super(numero1, numero2);
    }

    /**
     *
     * @return
     */
    @Override
    public double sumarEnteros(){
        return super.sumarEnteros()/2;
    }    
    @Override
    public double restarEnteros(){
        return super.restarEnteros()/2;
        }
    @Override
    public double multiplicarEnteros(){
        return super.multiplicarEnteros()/2;  
        }
    @Override
    public double dividirEnteros(){
        return super.dividirEnteros()/2;
    }
    
    @Override
    public double calcularRaizCuadrada(){        
        return super.calcularRaizCuadrada()/2;                        
    }   
}
