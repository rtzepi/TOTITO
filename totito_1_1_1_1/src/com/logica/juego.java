
package com.logica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.totito.totito;
import static com.totito.totito.btn;
import com.totito.totito;
import static com.totito.totito.btn;

/**** @author Alex_Pablo*/

public class juego {
    
    turno turn = new turno();
    jugador jugaX = new jugador("x");
    jugador jugaO = new jugador("o");
    
    int cas[][]={
        {},
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {1,4,7},
        {2,5,8},
        {3,6,9},
        {3,5,7},
        {1,5,9}       
    };

    public juego() {
    }
    
   public  void turnoTablero(){
       if(turn.isTurno()){
            totito.tableroX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/totio/tablaTurnoX.png"))); 
            totito.tableroO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/totio/jugadorO.png")));
       }else{
            totito.tableroO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/totio/tablaTurnoO.png")));
            totito.tableroX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/totio/jugadorX.png")));            System.out.println("turno de o");
       }
   }
    
   
   public void VerificacionTurno(int n){
        if(turn.isTurno()){
            if(btn[n].getIcon() == null){
                btn[n].setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/totio/X/x"+n+".png")));
                turn.setTurno();
                btn[n].setName( jugaX.getFigura());
                Gandador();                      
                turnoTablero();
            }
        }else{
            if(btn[n].getIcon() == null){
                btn[n].setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/totio/O/o"+n+".png")));
                turn.setTurno();
                btn[n].setName( jugaO.getFigura() );
                Gandador();                    
                turnoTablero();
            }
        }
    }
   
   
   
  public void Gandador (){
       for(int i=1; i<cas.length; i++){
           if( btn[cas[i][0]].getName()=="x" && btn[cas[i][1]].getName()=="x"  && btn[cas[i][2]].getName()=="x"){
                jugaX.sumarPuntos();
                totito.puntosJugaX.setText(""+jugaX.getPuntos());
                com.totito.Dialog dialogo = new com.totito.Dialog( "Jugador 'X'", jugaX.getPuntos(), jugaX,jugaO );
                dialogo.setVisible(true);
           }if(btn[cas[i][0]].getName()=="o" && btn[cas[i][1]].getName()=="o"  && btn[cas[i][2]].getName()=="o"){
                jugaO.sumarPuntos();
                System.out.println(""+jugaO.getPuntos());
                totito.puntosJugaO.setText(""+jugaO.getPuntos());
                System.out.println( btn[i].getName() );
                com.totito.Dialog dialogo = new com.totito.Dialog( "Jugador 'O'", jugaO.getPuntos(), jugaO ,jugaX);
                dialogo.setVisible(true);
           }
           
       }if(btn[1].getName() != null &&
           btn[2].getName() != null &&
           btn[3].getName() != null &&
           btn[4].getName() != null &&
           btn[5].getName() != null &&
           btn[6].getName() != null &&
           btn[7].getName() != null && 
           btn[8].getName() != null &&
           btn[9].getName() != null   ){;
            com.totito.Dialog dialogo = new com.totito.Dialog( "EMPATE" , 0 , jugaO,jugaX);
            dialogo.setVisible(true);
           }
   }     
}
