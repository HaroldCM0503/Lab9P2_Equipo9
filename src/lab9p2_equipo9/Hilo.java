/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_equipo9;

import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.plaf.basic.BasicProgressBarUI;

/**
 *
 * @author Valeria Romero
 */
public class Hilo extends Thread {
     private Color color;
    private int segundos;
    private JProgressBar p;
    
    private boolean vivir=true;

    public Hilo() {
    }

    public Hilo(JProgressBar p) {
        this.p = p;
    }
    

    public Hilo(Color color, int segundos, JProgressBar p) {
        this.color = color;
        this.segundos = segundos;
        this.p = p;
    }

   
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public boolean isVivir() {
        return vivir;
    }

    public void setVivir(boolean vivir) {
        this.vivir = vivir;
    }

    public JProgressBar getP() {
        return p;
    }

    public void setP(JProgressBar p) {
        this.p = p;
    }
    
     @Override
    public void run() {
        while (vivir) {
             p.setUI(new BasicProgressBarUI() {
                protected Color getSelectionBackground() {
                    return Color.CYAN; // Cambia el color de fondo de la barra de progreso
                }

                protected Color getSelectionForeground() {
                    return Color.WHITE; // Cambia el color del texto
                }
               
            });
             p.setValue(p.getValue()+1);
             if(p.getValue()==100000000){
                    vivir=false;
                }     
            try {
                Thread.sleep(segundos*1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
