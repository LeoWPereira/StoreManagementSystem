package DAOs;

import BancoDeDados.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOCliente
{
    Connection con = (Connection) Conexao.getConnection();
    
    public boolean verifica(Statement stm, String nome) throws SQLException
    {
        ResultSet resultSet = (ResultSet) stm.executeQuery("select c.nome " + "from mydb.Cliente c " + "where c.nome = '" +nome+"'");
        
        if (resultSet.next())
            return true;
        
        else
            return false;
    }
    
    public List carregaJListClienteFisico(Statement stm) throws SQLException
    {
        ResultSet rs = stm.executeQuery("select c.nome " + "from mydb.Cliente c " + "where c.cliente_fisico = 1 order by nome");  
  
        // preenche arraylist com nomes  
        List lista = new ArrayList();  
        
        while (rs.next()) { lista.add(rs.getString(1)); }
        
        return lista;
    }
    
    public List carregaJListClienteJuridico(Statement stm) throws SQLException
    {
        ResultSet rs = stm.executeQuery("select c.nome " + "from mydb.Cliente c " + "where c.cliente_fisico = 0 order by nome");  
  
        // preenche arraylist com nomes  
        List lista = new ArrayList();  
        
        while (rs.next()) { lista.add(rs.getString(1)); }
        
        return lista;
    }
    
    public List carregaJListClienteAPartirDeVeiculo(Statement stm, int idCliente, String placa) throws SQLException
    {
        ResultSet rs = stm.executeQuery("select c.nome from mydb.Cliente c, mydb.Veiculo v where c.idCliente="+idCliente+" and v.placa='"+placa+"' and order by nome");  
  
        // preenche arraylist com nomes  
        List lista = new ArrayList();  
        
        while (rs.next()) { lista.add(rs.getString(1)); }
        
        return lista;
    }
    
    public void adicionar(Statement stm, String nome, String rg, String cpf, double balanco, String telefone, String celular, String email, String cep, String bairro, String cidade, String logradouro, String complemento, String estado, String numero, String cnpj, int cliente_fisico) throws SQLException
    {        
        if (verifica(stm, nome) == false)
            stm.execute("insert into mydb.Cliente(nome,rg,cpf,balanco,telefone,celular,email,cep,bairro,cidade,logradouro,complemento,estado,numero,cnpj,cliente_fisico) values"
                    + " ('"+nome+"','"+rg+"', '"+cpf+"', '"+balanco+"', '"+telefone+"', '"+celular+"', '"+email+"', '"+cep+"', '"+bairro+"', '"+cidade+"', '"+logradouro+"', '"+complemento+"', '"+estado+"', '"+numero+"', '"+cnpj+"', '"+cliente_fisico+"')"); 
    }
	
    public void alterar(Statement stm, String nome_anterior,String nome, String rg, String cpf, double balanco, String telefone, String celular, String email, String cep, String bairro, String cidade, String logradouro, String complemento, String estado, String numero, String cnpj) throws SQLException
    {      
        stm.execute("update mydb.Cliente set nome='"+nome+"',rg='"+rg+"',cpf='"+cpf+"',balanco='"+balanco+"',telefone='"+telefone+"',celular='"+celular+"',email='"+email+"',cep='"+cep+"',bairro='"+bairro+"',cidade='"+cidade+"',logradouro='"+logradouro+"',complemento='"+complemento+"',estado='"+estado+"',numero='"+numero+"',cnpj='"+cnpj+"' where nome = '"+nome_anterior+"'"); 
    }
	
    public ResultSet consultar(Statement stm, String nome) throws SQLException
    {
	ResultSet rs = stm.executeQuery("select c.* from mydb.Cliente c where c.nome = '"+nome+"'");
        
        return rs;
    }
	
    public void excluir(Statement stm, String nome) throws SQLException
    {
	stm.execute("delete from mydb.Fornecedor where nome = '"+nome+"'");
    }
}
