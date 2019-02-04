
package animacion.animacion;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class colisiones extends Canvas implements Runnable {
    
    private static JFrame ventana;
    private static Thread thread;
    
    private static final int ANCHO = 800;
    private static final int ALTO = 600;
    private static final String NOMBRE= "Colisiones";
    
    
    private colisiones(){
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
        thread=new Thread(this,"Graficos");
        thread.start();
    }
    private void detener(){
        
    }
    @Override
    public void run() {
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
