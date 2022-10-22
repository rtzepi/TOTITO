
package com.logica;

/**
 *
 * @author Alex_Pablo
 */
public class jugador {
    private String figura;
    private int puntos = 0;

    public jugador(String figura) {
        this.figura = figura;
    }

    public String getFigura() {
        return figura;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }
    
    public void sumarPuntos(){
        this.puntos = this.puntos + 1;
    }
    
    
    public void resetPuntos(){
        this.puntos = 0;
    }
    
    
    
    
    
    






}
