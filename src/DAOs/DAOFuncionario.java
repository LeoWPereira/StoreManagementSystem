package DAOs;

import BancoDeDados.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOFuncionario
{
    Connection con = (Connection) Conexao.getConnection();
    
    public boolean verifica(Statement stm, String nome) throws SQLException
    {
        ResultSet resultSet = (ResultSet) stm.executeQuery("select f.nome " + "from mydb.Funcionario f " + "where f.nome = '" +nome+"'");
        
        if (resultSet.next())
            return true;
        
        else
            return false;
    }
    
    public List carregaJListFuncionario(Statement stm) throws SQLException
    {
        ResultSet rs = stm.executeQuery("select f.nome " + "from mydb.Funcionario f order by nome");  
  
        // preenche arraylist com nomes  
        List lista = new ArrayList();  
        
        while (rs.next()) { lista.add(rs.getString(1)); }
        
        return lista;
    }
    
    public void adicionar(Statement stm, String nome, String rg, String cpf, String telefone, String celular, String email, String cep, String bairro, String cidade, String logradouro, String complemento, String estado, String numero, String tipo, String ctps, String salario, String senha) throws SQLException
    {        
        if (verifica(stm, nome) == false)
            stm.execute("insert into mydb.Funcionario(nome,rg,cpf,telefone,celular,email,cep,logradouro,numero,complemento,bairro,cidade,estado,tipo,ctps,salario,senha) values"
                    + " ('"+nome+"','"+rg+"', '"+cpf+"', '"+telefone+"', '"+celular+"', '"+email+"', '"+cep+"', '"+logradouro+"', '"+numero+"', '"+complemento+"', '"+bairro+"', '"+cidade+"', '"+estado+"', '"+tipo+"', '"+ctps+"', '"+salario+"', '"+senha+"')"); 
    }
	
    public void alterar(Statement stm, String nome_anterior,String nome, String rg, String cpf, String telefone, String celular, String email, String cep, String bairro, String cidade, String logradouro, String complemento, String estado, String numero, String tipo, String ctps, double salario, String senha) throws SQLException
    {      
        stm.execute("update mydb.Funcionario set nome='"+nome+"',rg='"+rg+"',cpf='"+cpf+"',telefone='"+telefone+"',celular='"+celular+"',email='"+email+"',cep='"+cep+"',bairro='"+bairro+"',cidade='"+cidade+"',logradouro='"+logradouro+"',complemento='"+complemento+"',estado='"+estado+"',numero='"+numero+"',ctps='"+ctps+"' ,tipo='"+tipo+"' ,salario="+salario+" ,senha='"+senha+"' where nome = '"+nome_anterior+"'"); 
    }
	
    public ResultSet consultar(Statement stm, String nome) throws SQLException
    {
	ResultSet rs = stm.executeQuery("select f.* from mydb.Funcionario f where f.nome = '"+nome+"'");
        
        return rs;
    }
	
    public void excluir(Statement stm, String nome) throws SQLException
    {
	stm.execute("delete from mydb.Funcionario where nome = '"+nome+"'");
    }
}
