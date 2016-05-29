/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge
 */
public class ConnectAndFetch {
    
        private String url = "jdbc:mySQL://localhost:3306/scheduledb";
        private String user = "user";
        private String pwd = "";
        protected Connection con;
        

    public boolean connnect(){
        
        boolean isConnected = false;
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.con = DriverManager.getConnection(url, user, pwd);
            isConnected = true;
        } catch( SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e ) {
            System.out.println(e.getMessage() + "erooo");
            isConnected = false;
        }
        
        return isConnected;
    }
    
    public boolean insertData(){
        try {
            Calendar cal = Calendar.getInstance();
            Timestamp now = new Timestamp(cal.getTimeInMillis());           
            cal.add(Calendar.HOUR_OF_DAY, 5);
            Timestamp due = new Timestamp(cal.getTimeInMillis());
            String obs = "Olha ai deu certo";
            String nome = "Teste";
            String query = "insert into scheduledb values (?,?,?,?,?)";
            PreparedStatement stmnt = con.prepareStatement(query);
            stmnt.setInt(1, 0);
            stmnt.setString(2, nome);
            stmnt.setTimestamp(3, now);
            stmnt.setTimestamp(4, due);
            stmnt.setString(5, obs);
            
            
         
            
            stmnt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectAndFetch.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public ArrayList getData(){
        
        
        ArrayList<DbResult> results = new ArrayList<>();
        int i = 0;
        try {
            Statement st = con.createStatement();
            String query = "SELECT  * FROM scheduledb";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                results.add(new DbResult(rs.getInt("id"), rs.getString("NomedoCompromisso"), rs.getTimestamp("Criação"), 
                        rs.getTimestamp("Due"), rs.getString("obs")));
                System.out.println(rs.getInt("id")+ rs.getString("NomedoCompromisso")+ rs.getTimestamp("Criação") + 
                        rs.getTimestamp("Due") + rs.getString("obs"));
                
            }
            System.out.println("leu");
            return results;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectAndFetch.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    public void delete(){
        try {
            PreparedStatement st = con.prepareStatement("delete from scheduledb where id = 10");
            st.executeUpdate();
            System.out.println("deletou");
        } catch (SQLException ex) {
            System.out.println("erroooo");
            Logger.getLogger(ConnectAndFetch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String [] args){
        
        ConnectAndFetch teste = new ConnectAndFetch();
        teste.connnect();
        teste.insertData();
        teste.getData();
    }
        
        
    
}
