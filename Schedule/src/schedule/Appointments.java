/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JLabel;


/**
 *
 * @author Jorge
 */
public class Appointments {
    
    private ArrayList<DbResult> appointments ;
    private ArrayList<JLabel> labels = new ArrayList<>() ;
    ConnectAndFetch connection = new ConnectAndFetch();
    

    public Appointments() {
        if(connection.connnect()){
            System.out.println("conectado com sucesso");
        }
        else{
            System.out.println("erro");
            System.exit(1);
        }
    appointments = connection.getData();
    
    for(int i= 0; i<appointments.size(); i++){
        final JLabel temp = new JLabel();
        
        DbResult tempItem = appointments.get(i);
        
        temp.setText(tempItem.nome + " " + i);
        
        temp.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(temp.getText() + "pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        });
        labels.add(temp);
    }
    }
    
    public ArrayList getApppo(){
        
        return labels;
    }
   
    
    
}
