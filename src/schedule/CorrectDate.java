/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.util.Calendar;
import javax.swing.JFormattedTextField;

/**
 *
 * @author Jorge
 */
public class CorrectDate {
    
    public void catchAndReturn(String day, String month, String year, String operation,
    JFormattedTextField dayField, JFormattedTextField monthField, JFormattedTextField yearField){
        
        String2Calendar convert = new String2Calendar();
        Calendar cal  = convert.convert(day, month, year);
        
        this.operationChange(cal, dayField, monthField, yearField, operation);
    
}
    
    public void operationChange(Calendar cal, JFormattedTextField dayField,
            JFormattedTextField monthField, JFormattedTextField yearField, String operation) {

        switch (operation) {
            case "nextdayPanel":
                cal.add(Calendar.DAY_OF_MONTH, 1);
                dayField.setText("" + cal.get(Calendar.DAY_OF_MONTH));
                monthField.setText(this.monthPortuguese(cal.get(Calendar.MONTH)));
                yearField.setText("" + cal.get(Calendar.YEAR));
                break;
            case "prevdayPanel":
                cal.add(Calendar.DAY_OF_MONTH, -1);
                dayField.setText("" + cal.get(Calendar.DAY_OF_MONTH));
                monthField.setText(this.monthPortuguese(cal.get(Calendar.MONTH)));
                yearField.setText("" + cal.get(Calendar.YEAR));
                break;
            case "nextweekPanel":
                cal.add(Calendar.DAY_OF_MONTH, 7);
                dayField.setText("" + cal.get(Calendar.DAY_OF_MONTH));
                monthField.setText(this.monthPortuguese(cal.get(Calendar.MONTH)));
                yearField.setText("" + cal.get(Calendar.YEAR));
                break;
            case "prevweekPanel":
                cal.add(Calendar.DAY_OF_MONTH, -7);
                dayField.setText("" + cal.get(Calendar.DAY_OF_MONTH));
                monthField.setText(this.monthPortuguese(cal.get(Calendar.MONTH)));
                yearField.setText("" + cal.get(Calendar.YEAR));
                break;
            case "nextmonthPanel":
                cal.add(Calendar.MONTH, 1);
                monthField.setText(this.monthPortuguese(cal.get(Calendar.MONTH)));
                yearField.setText("" + cal.get(Calendar.YEAR));
                break;
            case "prevmonthPanel":
                cal.add(Calendar.MONTH, -1);
                monthField.setText(this.monthPortuguese(cal.get(Calendar.MONTH)));
                yearField.setText("" + cal.get(Calendar.YEAR));
                break;
            
        }        
    }
    
   
    
    public String monthPortuguese(int month){
        
        switch (month) {
            case 0:
                return "Janeiro";
            case 1:
                return "Fevereiro";
            case 2:
                return "Março";
            case 3:
                return "Abril";
            case 4:
                return "Maio";
            case 5:
                return "Junho";
            case 6:
                return "Julho";
            case 7:
                return "Agosto";
            case 8:
                return "Setembro";
            case 9:
                return "Outubro";
            case 10:
                return "Novembro";
            case 11:
                return "Dezembro";
            default:
                return "Erro na formatação do Mês";
       }
    }
    
    public int stringMonthtoInt(String month){
        
        switch (month) {
            case "Janeiro":
                return 0;
            case "Fevereiro":
                return 1;
            case "Março":
                return 2;
            case "Abril":
                return 3;
            case "Maio":
                return 4;
            case "Junho":
                return 5;
            case "Julho":
                return 6;
            case "Agosto":
                return 7;
            case "Setembro":
                return 8;
            case "Outubro":
                return 9;
            case "Novembro":
                return 10;
            case "Dezembro":
                return 11;
            default:
                return -1;
       }
    }
    
   

  
    
}
