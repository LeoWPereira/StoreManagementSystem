package DAOs;

import BancoDeDados.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOVeiculo
{
    Connection con = (Connection) Conexao.getConnection();
    
    public boolean verifica(Statement stm, String placa) throws SQLException
    {
        ResultSet resultSet = (ResultSet) stm.executeQuery("select v.placa " + "from mydb.Veiculo v " + "where v.placa = '" +placa+"'");
        
        if (resultSet.next())
            return true;
        
        else
            return false;
    }
 
    public List carregaJListVeiculo(Statement stm) throws SQLException
    {
        ResultSet rs = stm.executeQuery("select v.placa from mydb.Veiculo v order by placa");  
  
        // preenche arraylist com nomes  
        List lista = new ArrayList();  
        
        while (rs.next()) { lista.add(rs.getString(1)); }
        
        return lista;
    }
    
    public List carregaJListVeiculoPorCliente(Statement stm, int idCliente) throws SQLException
    {
        ResultSet rs = stm.executeQuery("select v.placa from mydb.Veiculo v where idCliente="+idCliente+" order by placa");  
  
        // preenche arraylist com nomes  
        List lista = new ArrayList();  
        
        while (rs.next()) { lista.add(rs.getString(1)); }
        
        return lista;
    }
    
    public void adicionar(Statement stm, String nome_cliente, String marca, String placa, String ano, String modelo, String cor) throws SQLException
    {
        ResultSet rs = (ResultSet) stm.executeQuery("select c.idCliente from mydb.Cliente c where c.nome = '" +nome_cliente+"'");
        
        int idCliente = 0;
        
        while(rs.next())
        {
            idCliente = rs.getInt("idCliente");
        }
        
        if ( (verifica(stm, placa) == false) && (idCliente != 0))
            stm.execute("insert into mydb.Veiculo(ano,cor,idCliente,marca,modelo,placa) values"
                    + " ('"+ano+"','"+cor+"', '"+idCliente+"', '"+marca+"', '"+modelo+"', '"+placa+"')"); 
    }
	
    public void alterar(Statement stm, String marca, String placa, int ano, String modelo, String cor, int idCliente) throws SQLException
    {      
        stm.execute("update mydb.Veiculo set marca='"+marca+"',placa='"+placa+"',ano="+ano+",modelo='"+modelo+"',cor='"+cor+"' where idCliente="+idCliente); 
    }
	
    public ResultSet consultar(Statement stm, String placa) throws SQLException
    {
	ResultSet rs = stm.executeQuery("select v.* from mydb.Veiculo v where v.placa = '"+placa+"'");
        
        return rs;
    }
	
    public void excluir(Statement stm, String placa) throws SQLException
    {
	stm.execute("delete from mydb.Veiculo where placa = '"+placa+"'");
    }
}
