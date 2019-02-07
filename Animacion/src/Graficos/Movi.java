
package Graficos;

public class Movi {
     private final int lado;
    
    private final int x;
    private final int y;
    
    public int[] pixeles;
    private final HojaSprites hoja;
    
    //coleccion hojas de sprites
    public static Movi FONDO = new Movi(32, 4, 0, HojaSprites.desierto);
    public static Movi BOLA = new Movi(32, 0, 1, HojaSprites.desierto);
    public static Movi TOCA = new Movi(32, 2, 0, HojaSprites.desierto);
    //fin coleccion

    public Movi(final int lado, final int columna, final int fila, 
            final HojaSprites hoja){
        
        this.lado = lado;
        this.hoja = hoja;
        
        pixeles = new int[lado * lado];
        
        this.x = columna * lado;
        this.y = fila * lado;
        
        for(int y = 0; y < lado; y++){
            for(int x = 0; x < lado; x++){
                pixeles[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y)
                        * hoja.getAncho()];
            }
        }
    }   
    public int getLado () {
        return lado;
    }
}
