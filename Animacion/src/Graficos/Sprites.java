
package Graficos;

public class Sprites {
    
    private final int ancho;
    private final int alto;
    public final int[] pixeles;

    public Sprites(final String ruta,final int ancho,final int alto){
        this.ancho=ancho;
        this.alto=alto;
        
        pixeles = new int[ancho * alto]
    }
}
