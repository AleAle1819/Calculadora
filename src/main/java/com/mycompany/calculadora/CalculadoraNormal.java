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
public class CalculadoraNormal {
    private int numero1;
    private int numero2;

    public CalculadoraNormal(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public double sumarEnteros(){   
        ////JOptionPane.showConfirmDialog(null, this.numero1+this.numero2,"La suma es igual a: ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        return this.numero1+this.numero2;
                
    }
    public double restarEnteros(){        
        ////JOptionPane.showConfirmDialog(null, this.numero1-this.numero2, "La resta es igual a: ",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        return this.numero1-this.numero2;
    }
    public double multiplicarEnteros(){       
        ////JOptionPane.showConfirmDialog(null, this.numero1*this.numero2, "La multiplicación es igual a: ",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        return this.numero1*this.numero2;
    }
    public double dividirEnteros(){
        /*if (this.numero2!=0){
            JOptionPane.showConfirmDialog(null, this.numero1/this.numero2, "La división es igual a: ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);           
        }else{
            JOptionPane.showMessageDialog(null, "\"No se puede dividir\"");            
        }*/
        if (this.numero2==0)
            JOptionPane.showMessageDialog(null, "\"No se puede dividir\"");
        else            
            return this.numero1/this.numero2;
        return 0;
    }
    public double calcularRaizCuadrada(){        
        ////JOptionPane.showConfirmDialog(null,Math.sqrt(this.numero1), "La raiz cuadrada del primer entero es: ",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);                
        return Math.sqrt(this.numero1);
    }   

    
   
    public void Imprimir(int numero1, int numero2){
        JOptionPane.showConfirmDialog(null, this.numero1+this.numero2,"La suma es igual a: ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showConfirmDialog(null, this.numero1-this.numero2, "La resta es igual a: ",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showConfirmDialog(null, this.numero1*this.numero2, "La multiplicación es igual a: ",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showConfirmDialog(null, this.numero1/this.numero2, "La multiplicación es igual a: ",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showConfirmDialog(null, Math.sqrt(this.numero1), "La raiz cuadrada del primer entero es: ",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    }
}
