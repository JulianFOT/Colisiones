
package animacion.animacion;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class colisiones extends Canvas {
    
    private static JFrame ventana;
    private static final int ANCHO = 800;
    private static final int ALTO = 600;
    private static final String NOMBRE= "Colisiones";
    private colisiones(){
    setPreferredSize(new Dimension(ANCHO,ALTO));
    
    ventana= new JFrame(NOMBRE);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setResizable(false);
    }
}
