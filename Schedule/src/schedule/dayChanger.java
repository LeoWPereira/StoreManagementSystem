/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Jorge
 */
public class dayChanger {
    
    public String nextDay(String entry) throws ParseException{
        
        SimpleDateFormat currString = new SimpleDateFormat("dd/mm/yyyy");
        Calendar current = Calendar.getInstance();
        current.setTime(currString.parse(entry));
        current.set(current.get(current.YEAR), current.get(current.MONTH), current.get(current.DAY_OF_MONTH)+1);
        Date next = current.getTime();
        return currString.format(next);
        
    }
    
}
