/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JFormattedTextField;

/**
 *
 * @author Jorge
 */
public class RetrieveCompromissos {
    
    JFormattedTextField dia;
    JFormattedTextField mes;
    JFormattedTextField ano;
    
    String2Calendar get = new String2Calendar();
    Calendar cal;
    
    public RetrieveCompromissos(JFormattedTextField d, JFormattedTextField m, JFormattedTextField a){
        
        dia = d;
        mes = m;
        ano = a;
    }
    
    public Calendar getCurrDate(){
        
       cal = get.convert(dia.getText(), mes.getText(), ano.getText());
        System.out.println(dia.getText() + mes.getText() + ano.getText());
       
       return cal;
    
    }
    
   
}
