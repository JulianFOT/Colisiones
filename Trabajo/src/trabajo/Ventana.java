/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo;

import java.awt.Graphics;

/**
 *
 * @author estudiantes
 */
public class Ventana extends javax.swing.JPanel implements Runnable {

    //Para darle animación a la pelota se utiliza el runnable.
    int x=getWidth()/2;
    Thread hilo;
    public Ventana() {
        initComponents();
        hilo=new Thread(this);
       
    }
     
    
    @Override
    public void paint(Graphics g){
        g.setColor(getBackground());//Se repinta la imagen.
        g.clearRect(0,0, getWidth(),getHeight());//Se define en que lugar se quiere la pelota.
        g.setColor(java.awt.Color.black);//El color.
        g.fillOval(x, getHeight()/2, 30, 30);//Se dibuja la pelota y se traslaza solamente horizontalmente en la mitad de la pantalla
    }
    
    public void inicio(){
        hilo.start(); 
    }
    
    public void pausa(){
        hilo.suspend();
    }
    
    public void continuar(){
        hilo.resume();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void run() {
        try{
            while(true){
                while(x<getWidth()-30){
                    Thread.sleep(50);
                    x+=10;
                    repaint();
                }
                while(x>10){
                    Thread.sleep(50);
                    x-=10;
                    repaint();
                }
            }
        }catch(Exception e){
            System.out.println("Se produjo un error amigo mio"+e.getMessage());
            
        }
        
                
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
