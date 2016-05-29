package DAOs; 

import BancoDeDados.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Calendar;

public class DAOOrdemServico
{ 
    Connection con = (Connection) Conexao.getConnection();
    
    public void adicionar(Statement stm, String descricao, Calendar data, int idCliente, int idVeiculo, String placa) throws SQLException
    {
        /*PreparedStatement ps = con.prepareStatement("insert into mydb.OrdemServico values (?,?,?,?)");
        
        ps.setString(1, descricao);
        ps.setTimestamp(2, new Timestamp(data.getTimeInMillis()), data);
        ps.setInt(3, idCliente);
        ps.setInt(4, idVeiculo);
        
        if(ps.executeUpdate() > 0){
            System.out.println("oi");
        }
        else{
            System.out.println("tchau");}
        
        System.out.println(data.getTime().toString());*/
        
        String titulo = "ODS: Carro "+placa;/*
        
        PreparedStatement pstm = con.prepareStatement("insert into scheduledb values (?,?,?,?,?)");
        pstm.setString(2, titulo);
        pstm.setTimestamp(3, new Timestamp(Calendar.getInstance().getTimeInMillis()));
        pstm.setTimestamp(4, new Timestamp(data.getTimeInMillis()));
        pstm.setString(5, descricao);
        pstm.executeUpdate();*/
        
        
        stm.execute("insert into mydb.OrdemServico(descricao,data,idCliente,idVeiculo) values"
                    + " ('"+descricao+"','"+new Timestamp(data.getTimeInMillis())+"', "+idCliente+", "+idVeiculo+")"); 
        stm.execute("insert into mydb.scheduledb values ("+0+", '"+titulo+"', '"+new Timestamp(Calendar.getInstance().getTimeInMillis())+"', '"+new Timestamp(data.getTimeInMillis())+"', '"+descricao+"')");
    }
}