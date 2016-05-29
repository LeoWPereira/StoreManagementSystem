package Controllers;

import Classes.Fornecedor;
import DAOs.DAOFornecedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CtrlFornecedor extends Fornecedor
{
    DAOFornecedor dao = new DAOFornecedor();
    
    public List carregaJListFornecedor(Statement stm) throws SQLException
    {
        return dao.carregaJListFornecedor(stm);
    }
    
    public List carregaJListFornecedorPorProduto(Statement stm, int idProduto) throws SQLException
    {
        return dao.carregaJListFornecedorPorProduto(stm, idProduto);
    }
    
    public void adicionar(Statement stm, String nome, String telefone, String celular, String email, String cep, String bairro, String cidade, String logradouro, String complemento, String estado, String numero, String cnpj) throws SQLException
    {
	dao.adicionar(stm, nome, telefone, celular, email, cep, bairro, cidade, logradouro, complemento, estado, numero, cnpj);
    }
	
    public void alterar(Statement stm, String nome_anterior,String nome, String telefone, String celular, String email, String cep, String bairro, String cidade, String logradouro, String complemento, String estado, String numero, String cnpj) throws SQLException
    {
	dao.alterar(stm, nome_anterior, nome, telefone, celular, email, cep, bairro, cidade, logradouro, complemento, estado, numero, cnpj);
    }
	
    public ResultSet consultar(Statement stm, String nome) throws SQLException
    {
	return dao.consultar(stm, nome);
    }
	
    public void excluir(Statement stm, String nome) throws SQLException
    {
	dao.excluir(stm, nome);
    }
	
    public void ValidarCNPJ()
    {
	
    }
}
