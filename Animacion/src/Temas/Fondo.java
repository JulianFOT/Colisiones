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
public class Fondo {
    private final static int LADO_SPRITE = 32;
    private final static int MASCARA_SPRITE = LADO_SPRITE - 1;

    public Fondo(int[] pixeles, int ancho, int alto) {
        for(int y = 0; y < alto; y++) {
            for(int x = 0; x < ancho; x++){
                
                pixeles[x + y * ancho] = Movi.FONDO.pixeles[
                        (x & MASCARA_SPRITE) + (y & MASCARA_SPRITE) * 
                        LADO_SPRITE];
            }
        }
    }

    
}
