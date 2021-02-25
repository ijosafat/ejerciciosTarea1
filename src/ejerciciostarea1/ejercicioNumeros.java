/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostarea1;

import javax.swing.JOptionPane;

/**
 *
 * @author Myke
 */
public class ejercicioNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String primernumero;
        String segundonumero;
        int numero1;
        int numero2;
        int suma;
        primernumero = JOptionPane.showInputDialog("Digite el primer numero");
        numero1 = Integer.parseInt(primernumero);
        if(numero1>0)
        {
            segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");
            numero2 = Integer.parseInt(segundonumero);
            if(numero2>0)
            {
                suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "La suma es: " +
                suma,"Resultado",JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error, los numeros deben ser positivos" , "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error, los numeros deben ser positivos" , "Error", JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
    }
