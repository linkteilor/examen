
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorio 7
 */
public class practicas {
    public static void main(String[] args){
        int mayor=0;
        int menor=99;
        int promedio=0;
        int suma=0;
        for (int i = 1; i <= 5; i++) {
        int nota=Integer.parseInt(JOptionPane.showInputDialog("ingrese una nota"+i));
           if(nota>mayor){
                 mayor=nota;               
           }
            if(nota<menor){
                   menor=nota;
               }
          suma=suma+nota; 
        }               
        promedio=suma/5;
        JOptionPane.showMessageDialog(null,"la nota mayor es: "+mayor);
        JOptionPane.showMessageDialog(null,"la nota menor es: "+menor);
        JOptionPane.showMessageDialog(null,"el promedio es: "+promedio);
    }
  public static void practica2(){
  
  }
}
