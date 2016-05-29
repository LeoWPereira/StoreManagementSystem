package DAOs;

import BancoDeDados.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOFornecedor
{
    Connection con = (Connection) Conexao.getConnection();
    
    public boolean verifica(Statement stm, String nome) throws SQLException
    {
        ResultSet resultSet = (ResultSet) stm.executeQuery("select f.nome " + "from mydb.Fornecedor f " + "where f.nome = '" +nome+"'");
        
        if (resultSet.next())
            return true;
        
        else
            return false;
    }
    
    public List carregaJListFornecedor(Statement stm) throws SQLException
    {
        ResultSet rs = stm.executeQuery("select f.nome " + "from mydb.Fornecedor f order by nome");  
  
        // preenche arraylist com nomes  
        List lista = new ArrayList();  
        
        while (rs.next()) { lista.add(rs.getString(1)); }
        
        return lista;
    }
    
    public List carregaJListFornecedorPorProduto(Statement stm, int idFornecedor) throws SQLException
    {
        ResultSet rs = stm.executeQuery("select f.nome from mydb.Fornecedor f where f.idFornecedor="+idFornecedor+" order by nome");  
  
        // preenche arraylist com nomes  
        List lista = new ArrayList();  
        
        while (rs.next()) { lista.add(rs.getString(1)); }
        
        return lista;
    }
    
    public void adicionar(Statement stm, String nome, String telefone, String celular, String email, String cep, String bairro, String cidade, String logradouro, String complemento, String estado, String numero, String cnpj) throws SQLException
    {        
        if (verifica(stm, nome) == false)
            stm.execute("insert into mydb.Fornecedor(nome,telefone,celular,email,cep,bairro,cidade,logradouro,complemento,estado,numero,cnpj) values"
                    + " ('"+nome+"','"+telefone+"', '"+celular+"', '"+email+"', '"+cep+"', '"+bairro+"', '"+cidade+"', '"+logradouro+"', '"+complemento+"', '"+estado+"', '"+numero+"', '"+cnpj+"')"); 
    }
	
    public void alterar(Statement stm, String nome_anterior,String nome, String telefone, String celular, String email, String cep, String bairro, String cidade, String logradouro, String complemento, String estado, String numero, String cnpj) throws SQLException
    {      
        stm.execute("update mydb.Fornecedor set nome='"+nome+"',telefone='"+telefone+"',celular='"+celular+"',email='"+email+"',cep='"+cep+"',bairro='"+bairro+"',cidade='"+cidade+"',logradouro='"+logradouro+"',complemento='"+complemento+"',estado='"+estado+"',numero='"+numero+"',cnpj='"+cnpj+"' where nome = '"+nome_anterior+"'"); 
    }
	
    public ResultSet consultar(Statement stm, String nome) throws SQLException
    {
	ResultSet rs = stm.executeQuery("select f.* from mydb.Fornecedor f where f.nome = '"+nome+"'");
        
        return rs;
    }
	
    public void excluir(Statement stm, String nome) throws SQLException
    {
	stm.execute("delete from mydb.Fornecedor where nome = '"+nome+"'");
    }
}
