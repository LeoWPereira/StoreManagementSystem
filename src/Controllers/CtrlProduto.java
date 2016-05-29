package Controllers;

import Classes.Produto;
import DAOs.DAOProduto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CtrlProduto extends Produto
{
    DAOProduto dao = new DAOProduto();
    
    public List carregaJListProduto(Statement stm) throws SQLException
    {
        return dao.carregaJListProduto(stm);
    }
    
    public List carregaJListProdutoPorFornecedor(Statement stm, int idFornecedor) throws SQLException
    {
        return dao.carregaJListProdutoPorFornecedor(stm, idFornecedor);
    }
    
    public List carregaJListListaCompras(Statement stm) throws SQLException
    {
        return dao.carregaJListListaCompras(stm);
    }
    
    public void adicionar(Statement stm, String nome_fornecedor, String marca, String modelo, int quantidade, double valor_custo, String nome, String cor, int estoque_min, double valor_venda) throws SQLException
    {
        dao.adicionar(stm, nome_fornecedor, marca, modelo, quantidade, valor_custo, nome, cor, estoque_min, valor_venda);
    }
	
    public void alterar(Statement stm, String nome_anterior, String marca, String modelo, String nome, String cor, int idFornecedor, int quantidade, double valor_custo, double valor_venda, int estoque_minimo) throws SQLException
    {
	dao.alterar(stm, nome_anterior, marca, modelo, nome, cor, idFornecedor, quantidade, valor_custo, valor_venda, estoque_minimo);
    }
	
    public ResultSet consultar(Statement stm, String nome, int idFornecedor) throws SQLException
    {
	return dao.consultar(stm, nome, idFornecedor);
    }
    
    public ResultSet consultarPorNome(Statement stm, String nome) throws SQLException
    {
	return dao.consultarPorNome(stm, nome);
    }
	
    public void excluir(Statement stm, String nome, int idFornecedor) throws SQLException
    {
	dao.excluir(stm, nome, idFornecedor);
    }
	
    public void atualizaEstoque(Statement stm, int idProduto, int idFornecedor) throws SQLException
    {
	dao.atualizaEstoque(stm, idProduto, idFornecedor);
    }
}
