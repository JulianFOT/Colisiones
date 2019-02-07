
package Graficos;

import Temas.Toca;
import Temas.Fondo;
import Temas.Bola;

public class Screen {
    private final int ancho;
    private final int alto;
    
    public int[] pixeles;
    
    // temporal
    private final static int LADO_SPRITE = 32;
    private final static int MASCARA_SPRITE = LADO_SPRITE - 1;
    // fin temporal

    public Screen(int ancho, int alto) {
        
        this.ancho = ancho;
        this.alto = alto;
        
        pixeles = new int[ancho * alto];
    }
    
    public void Limpiar() {
        
        for(int i = 0; i < pixeles.length; i++) {
            pixeles[i] = 0;
        }
    }
    
    public void mostrar(int x, int y, int i, int j){
        
         Fondo Fondo = new Fondo(pixeles, ancho, alto);
         Bola Bola1 = new Bola(pixeles, x, y,  ancho, alto);
         Bola Bola2 = new Bola(pixeles, i, j, ancho, alto);
        if((y+32)==j){
           Toca Toca = new Toca(pixeles, 268, 386, ancho, alto);
         }
    }
    /*//fin temporal
    public void mostrarCuadro(int compensacionX, int compensacionY, Cuadro cuadro){
        for(int y = 0; y < cuadro.sprite.getLado(); y++){
            int posicionY = y + compensacionY;
            for(int x = 0; x < cuadro.sprite.getLado(); x++){
                int posicionX = x + compensacionX;
                if (posicionX < 0 || posicionX > ancho|| posicionY < 0 ||
                        posicionY > alto) {
                    break;
                }
                pixeles[posicionX + posicionY * ancho] = cuadro.sprite.
                        pixeles[x + y * cuadro.sprite.getLado()];
            }
        }        
    }*/
}
