/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temas;

import Graficos.Movi;

/**
 *
 * @author JulianFO
 */
public class Bola {
    private final static int LADO_SPRITE = 32;
    
    public Bola(int[] pixeles, int compensacionY, int compensacionX, int ancho, int alto) {

        for(int y = 0; y < LADO_SPRITE; y++){
            int posicionY = y + compensacionY;
            for(int x = 0; x < LADO_SPRITE; x++){
                int posicionX = x + compensacionX;
                if (posicionX < 0 || posicionX > ancho|| posicionY < 0 ||
                        posicionY > alto) {
                    break;
                }
                pixeles[posicionX + posicionY * ancho] = Movi.BOLA
                        .pixeles[x + y * LADO_SPRITE];
            }
        }    
    }

   
}
