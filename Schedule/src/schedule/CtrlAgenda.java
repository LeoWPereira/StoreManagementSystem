/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class CtrlAgenda {
    
    private DAOAgenda dao = new DAOAgenda();

    public CtrlAgenda() {
        if(dao.connnect()){
            System.out.println("connectado");
        }
        else{
            JOptionPane.showMessageDialog(null, "Não conectou a Database", "No DB Connection", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    public void addNewCompromisso(DbResult r){
        
//        if(dao.connnect()){}
//        else{JOptionPane.showMessageDialog(null, "Não foi possível conectar-se com a database");}
        
        if(dao.addNewCompromisso(r)){
            JOptionPane.showMessageDialog(null, "Compromisso Adicionado");
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro: não foi possível adicionar o compromisso", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
//        if(dao.disconnect()){}
//        else{JOptionPane.showMessageDialog(null, "Erro: Não foi possível desconectar-se da DB", "erro", JOptionPane.ERROR_MESSAGE);}
             
    }
    
    public void removeCompromisso(int id){
        
//        if(dao.connnect()){}
//        else{JOptionPane.showMessageDialog(null, "Não foi possível conectar-se com a database");}
        
        if(dao.removeCompromisso(id)){}         
        else{JOptionPane.showMessageDialog(null, "SQL Exception removeCompromisso!!", "Erro", JOptionPane.ERROR_MESSAGE);}
        
//        if(dao.disconnect()){}
//        else{JOptionPane.showMessageDialog(null, "Erro: Não foi possível desconectar-se da DB", "erro", JOptionPane.ERROR_MESSAGE);}
        
    }
    
    public void updateCompromisso(DbResult r){
        
//        if(dao.connnect()){}
//        else{JOptionPane.showMessageDialog(null, "Não foi possível conectar-se com a database");}
        
        if(dao.updateCompromisso(r)){}
        else{JOptionPane.showMessageDialog(null, "SQL Exception updateCompromisso!!", "Erro", JOptionPane.ERROR_MESSAGE);}
        
//        if(dao.disconnect()){}
//        else{JOptionPane.showMessageDialog(null, "Erro: Não foi possível desconectar-se da DB", "erro", JOptionPane.ERROR_MESSAGE);}
        
    }
    
    public DbResult getCompromisso(int id){
        
        DbResult compromisso;
//        if(dao.connnect()){}
//        else{JOptionPane.showMessageDialog(null, "Não foi possível conectar-se com a database");}
        
        compromisso = dao.getCompromisso(id);
        if(compromisso == null){
//            if(dao.disconnect()){JOptionPane.showMessageDialog(null, "Getcompromisso não retornou nenhum resultado", "erro", JOptionPane.ERROR_MESSAGE);}
//        else{JOptionPane.showMessageDialog(null, "SQL exception getCompromisso: Não desconectou", "erro", JOptionPane.ERROR_MESSAGE);}
            return null;
        }
        return compromisso;
        
    }
    
    public ArrayList getAllCompromissos(Timestamp down, Timestamp top){
        
        ArrayList<DbResult> result = new ArrayList<>();
        
        
//        if(dao.connnect()){}
//        else{JOptionPane.showMessageDialog(null, "Não foi possível conectar-se com a database");}
        ArrayList<DbResult> allResults = dao.getAllCompromissos();
        if(allResults == null){
//            if(dao.disconnect()){JOptionPane.showMessageDialog(null, "GetAllCompromisso não retornou nenhum resultado", "erro", JOptionPane.ERROR_MESSAGE);}
//            else{JOptionPane.showMessageDialog(null, "SQL exception getAllCompromisso: Não desconectou", "erro", JOptionPane.ERROR_MESSAGE);}
            return null;
        }
        for (int i = 0; i < allResults.size(); i++) {
            DbResult temp = allResults.get(i);
            if(temp.due.after(down) && temp.due.before(top)){
                System.out.println(temp.id);
                result.add(temp);
                
            }
        }
        return result;
        
    }
    
    public ArrayList getWeekCompromissos(Calendar c){
        
        ArrayList<DbResult> result = new ArrayList<>();
        
        
//        if(dao.connnect()){}
//        else{JOptionPane.showMessageDialog(null, "Não foi possível conectar-se com a database");}
        ArrayList<DbResult> allResults = dao.getAllCompromissos(c);
        if(allResults == null){
//            if(dao.disconnect()){JOptionPane.showMessageDialog(null, "GetAllCompromisso não retornou nenhum resultado", "erro", JOptionPane.ERROR_MESSAGE);}
//            else{JOptionPane.showMessageDialog(null, "SQL exception getAllCompromisso: Não desconectou", "erro", JOptionPane.ERROR_MESSAGE);}
            return null;
        }
        for (int i = 0; i < allResults.size(); i++) {
            DbResult temp = allResults.get(i);
         
                result.add(temp);
                
            
        }
        return result;
        
    }
    
}
