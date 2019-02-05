
package Pantalla;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class colisiones extends Canvas implements Runnable {
    
    private static JFrame ventana;
    private static Thread thread;
    
    private static final int ANCHO = 800;
    private static final int ALTO = 600;
    
    private static volatile boolean enFuncionamiento=false;
    
    private static final String NOMBRE= "Colisiones";
    
    private static int aps=0;
    private static int fps=0;
    
    
    
    private colisiones(){
        this.enFuncionamiento = false;
    setPreferredSize(new Dimension(ANCHO,ALTO));
    
    ventana= new JFrame(NOMBRE);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setResizable(false);
    ventana.setLayout(new BorderLayout());
    ventana.add(this,BorderLayout.CENTER);
    ventana.pack();
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);
    
    }
    
    
    public static void main(String[] args){
        colisiones colisiones = new colisiones();
        colisiones.iniciar();
    }
    
    private void iniciar(){
        enFuncionamiento=true;
        thread=new Thread(this,"Graficos");
        thread.start();
    }
    private synchronized void detener() throws InterruptedException{
        enFuncionamiento=false;
        thread.join();
    }
    
    
    private void actualizar(){
        aps++;
    }
    private void mostrar(){
        fps++;
    }
            
    @Override
    public void run() {
        final int NS_POR_SEGUNDO=1000000000;
        final byte APS_OBJETIVO=60;
        final double NS_POR_ACTUALIZACION=NS_POR_SEGUNDO/APS_OBJETIVO;
        
        long referenciaActualizacion=System.nanoTime();
        long referenciaContador = System.nanoTime();
        
        double tiempoTranscurrido;
        double delta=0;
        
        while(enFuncionamiento){
            final long inicioBucle = System.nanoTime();
            
            tiempoTranscurrido = inicioBucle-referenciaActualizacion;
            referenciaActualizacion = inicioBucle;
            delta += tiempoTranscurrido/NS_POR_ACTUALIZACION;
            while(delta >= 1){
                actualizar();
                delta--;
            }
             mostrar();
           
            if(System.nanoTime()- referenciaContador>NS_POR_ACTUALIZACION){
                ventana.setTitle(NOMBRE + "-- APS: " + aps + "-- FPS: " + fps );
                aps=0;
                fps=0;
                referenciaContador = System.nanoTime();
            }
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
