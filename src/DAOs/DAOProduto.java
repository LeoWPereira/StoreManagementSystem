package DAOs;

import BancoDeDados.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOProduto
{
    Connection con = (Connection) Conexao.getConnection();
    
    public boolean verifica(Statement stm, String nome, int idFornecedor) throws SQLException
    {
        ResultSet resultSet = (ResultSet) stm.executeQuery("select p.nome " + "from mydb.Produto p " + "where p.nome = '" +nome+"' and p.idFornecedor="+idFornecedor+"");
        
        if (resultSet.next())
            return true;
        
        else
            return false;
    }
    
    public List carregaJListProduto(Statement stm) throws SQLException
    {
        ResultSet rs = stm.executeQuery("select p.nome from mydb.Produto p order by nome");  
  
        // preenche arraylist com nomes  
        List lista = new ArrayList();  
        
        while (rs.next()) { lista.add(rs.getString(1)); }
        
        return lista;
    }
    
    public List carregaJListListaCompras(Statement stm) throws SQLException
    {
        ResultSet rs = stm.executeQuery("select p.nome from mydb.Produto p where quantidade<estoque_min");  
  
        // preenche arraylist com nomes  
        List lista = new ArrayList();  
        
        while (rs.next()) { lista.add(rs.getString(1)); }
        
        return lista;
    }
    
    public List carregaJListProdutoPorFornecedor(Statement stm, int idFornecedor) throws SQLException
    {
        ResultSet rs = stm.executeQuery("select p.nome from mydb.Produto p where idFornecedor="+idFornecedor+" order by nome");  
  
        // preenche arraylist com nomes  
        List lista = new ArrayList();  
        
        while (rs.next()) { lista.add(rs.getString(1)); }
        
        return lista;
    }
  
    public void adicionar(Statement stm, String nome_fornecedor, String marca, String modelo, int quantidade, double valor_custo, String nome, String cor, int estoque_min, double valor_venda) throws SQLException
    {
        ResultSet rs = (ResultSet) stm.executeQuery("select f.idFornecedor from mydb.Fornecedor f where f.nome = '" +nome_fornecedor+"'");
        
        int idFornecedor = 0;
        
        while(rs.next())
        {
            idFornecedor = rs.getInt("idFornecedor");
        }
        
        if ( (verifica(stm, nome, idFornecedor) == false) && (idFornecedor != 0))
            stm.execute("insert into mydb.Produto(cor,estoque_min,idFornecedor,marca,modelo,nome, quantidade, valor_custo, valor_venda) values"
                    + " ('"+cor+"','"+estoque_min+"', '"+idFornecedor+"', '"+marca+"', '"+modelo+"', '"+nome+"', '"+quantidade+"', '"+valor_custo+"', '"+valor_venda+"')"); 
    }
	
    public void alterar(Statement stm, String nome_anterior, String marca, String modelo, String nome, String cor, int idFornecedor, int quantidade, double valor_custo, double valor_venda, int estoque_minimo) throws SQLException
    {      
        stm.execute("update mydb.Produto set marca='"+marca+"',nome='"+nome+"',quantidade="+quantidade+" ,estoque_min="+estoque_minimo+" ,valor_custo="+valor_custo+" ,valor_venda="+valor_venda+" ,modelo='"+modelo+"',cor='"+cor+"' where idFornecedor="+idFornecedor+" and nome='"+nome_anterior+"'"); 
    }
	
    public ResultSet consultar(Statement stm, String nome, int idFornecedor) throws SQLException
    {
	ResultSet rs = stm.executeQuery("select p.* from mydb.Produto p where p.nome = '"+nome+"' and p.idFornecedor= "+idFornecedor);
        
        return rs;
    }
    
    public ResultSet consultarPorNome(Statement stm, String nome) throws SQLException
    {
	ResultSet rs = stm.executeQuery("select p.* from mydb.Produto p where p.nome = '"+nome+"'");
        
        return rs;
    }
	
    public void excluir(Statement stm, String nome, int idFornecedor) throws SQLException
    {
	stm.execute("delete from mydb.Produto where nome= '"+nome+"' and idFornecedor= "+idFornecedor);
    }
    
    public void atualizaEstoque(Statement stm, int idProduto, int idFornecedor) throws SQLException
    {      
        stm.execute("update mydb.Produto set quantidade=(quantidade-1) where idProduto="+idProduto+" and idFornecedor='"+idFornecedor+"'"); 
    }
}
