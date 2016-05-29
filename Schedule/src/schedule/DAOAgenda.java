/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class DAOAgenda {

    private String url = "jdbc:mySQL://localhost:3306/scheduledb";
    private String user = "user";
    private String pwd = "";
    protected Connection con;
    
    

    public boolean connnect() {

        boolean isConnected = false;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.con = DriverManager.getConnection(url, user, pwd);
            isConnected = true;
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println(e.getMessage() + "erooo");
            return isConnected;
        }

        return isConnected;
    }

    public boolean disconnect() {

        boolean disconnected = false;
        try {
            con.close();
            disconnected = true;
        } catch (SQLException e) {
            System.out.println("Erro : " + e);
            return disconnected;
        }
        return disconnected;

    }

    public boolean addNewCompromisso(DbResult r) {


        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO scheduledb values (?,?,?,?,?)");
            pstmt.setInt(1, r.id);
            pstmt.setString(2, r.nome);
            pstmt.setTimestamp(3, r.cre);
            pstmt.setTimestamp(4, r.due);
            pstmt.setString(5, r.obs);
            if (pstmt.executeUpdate() > 0) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(DAOAgenda.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean removeCompromisso(int id) {
        try {
            PreparedStatement pstmt = con.prepareStatement("delete from scheduledb where id = ?");
            pstmt.setInt(1, id);
            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Deletado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "O compromisso não existe ou já foi excluído", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOAgenda.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean updateCompromisso(DbResult r) {

        Timestamp c = new Timestamp(r.cre.getTime());
        Timestamp d = new Timestamp(r.due.getTime());
        try {
            PreparedStatement pstmt = con.prepareStatement("UPDATE scheduledb set NomedoCompromisso = ?, "
                    + "Criação = ?, Due = ?, Obs = ? where id = ?");
            pstmt.setInt(5, r.id);
            pstmt.setString(1, r.nome);
            pstmt.setTimestamp(2, c);
            pstmt.setTimestamp(3, d);
            pstmt.setString(4, r.obs);
            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Editado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "O compromisso não existe ou foi excluído", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOAgenda.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public DbResult getCompromisso(int id) {

        DbResult queryResult = null;
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * from scheduledb WHERE id = ?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            queryResult.id = rs.getInt("id");
            queryResult.nome = rs.getString("NomedoCompromisso");
            queryResult.cre = rs.getTimestamp("Criação");
            queryResult.due = rs.getTimestamp("Due");
            queryResult.obs = rs.getString("Obs");
            return queryResult;
        } catch (SQLException ex) {
            Logger.getLogger(DAOAgenda.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ArrayList getAllCompromissos() {


        String2Calendar convert = new String2Calendar();
        Calendar cal = convert.convert(ScheduleFrame.dayField.getText(), ScheduleFrame.monthField.getText(), ScheduleFrame.yearField
                .getText());
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);

        ArrayList<DbResult> results = new ArrayList<>();
        int i = 0;
        try {
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM scheduledb WHERE Due >= ? AND Due <= ?");

           
            pstm.setTimestamp(1, new Timestamp(cal.getTimeInMillis()), cal);
            cal.add(Calendar.DAY_OF_MONTH, 1);
            
            pstm.setTimestamp(2, new Timestamp(cal.getTimeInMillis()), cal);
            ResultSet rs = pstm.executeQuery();
            

            while (rs.next()) {
                
                results.add(new DbResult(rs.getInt("id"), rs.getString("NomedoCompromisso"), rs.getTimestamp("Criação"),
                        rs.getTimestamp("Due"), rs.getString("obs")));

            }
            
            return results;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectAndFetch.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }



    }

    public ArrayList getAllCompromissos(Calendar c) {


        
        Calendar cal = c;
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);

        ArrayList<DbResult> results = new ArrayList<>();
        int i = 0;
        try {
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM scheduledb WHERE Due >= ? AND Due <= ?");


            pstm.setTimestamp(1, new Timestamp(cal.getTimeInMillis()), cal);
            cal.add(Calendar.DAY_OF_MONTH, 1);
            pstm.setTimestamp(2, new Timestamp(cal.getTimeInMillis()), cal);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                results.add(new DbResult(rs.getInt("id"), rs.getString("NomedoCompromisso"), rs.getTimestamp("Criação"),
                        rs.getTimestamp("Due"), rs.getString("obs")));

            }
            return results;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectAndFetch.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
