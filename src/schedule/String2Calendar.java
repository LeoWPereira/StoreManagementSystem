/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge
 */
public class String2Calendar {
    
    CorrectDate correct = new CorrectDate();
    
    public Calendar convert(String day, String month, String year){
        
        
        Calendar result = Calendar.getInstance();
        int[] fields = new int[3];
        Number temp;
        try {
            temp = NumberFormat.getNumberInstance().parse(day);
            fields[0] = temp.intValue();
        } catch (ParseException ex) {
            Logger.getLogger(String2Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        fields[1] = correct.stringMonthtoInt(month);
        
        try {
            temp = NumberFormat.getNumberInstance().parse(year);
            fields[2] = temp.intValue();
        } catch (ParseException ex) {
            Logger.getLogger(String2Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        result.set(Calendar.DAY_OF_MONTH, fields[0]);
        result.set(Calendar.MONTH, fields[1]);
        result.set(Calendar.YEAR, fields[2]);
        return result;
        
        
        
    }
    
}
