
package com.logica;
import java.util.Random;
/**
 *
 * @author Alex_Pablo
 */
public class turno {
    private boolean turno ;
    Random random = new Random();
    
    public turno() {
        this.turno = random.nextBoolean();
    } 

    public boolean isTurno() {
        return turno;
    }

    public void setTurno() {
        this.turno = !turno;
    }
    
    
    
    
}
