package Controllers;

import Classes.Veiculo;
import DAOs.DAOVeiculo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CtrlVeiculo extends Veiculo
{
    DAOVeiculo dao = new DAOVeiculo();
    
    public List carregaJListVeiculo(Statement stm) throws SQLException
    {
        return dao.carregaJListVeiculo(stm);
    }
    
    public List carregaJListVeiculoPorCliente(Statement stm, int idCliente) throws SQLException
    {
        return dao.carregaJListVeiculoPorCliente(stm, idCliente);
    }
    
    public void adicionar(Statement stm, String nome_cliente, String marca, String placa, String ano, String modelo, String cor) throws SQLException
    {
        dao.adicionar(stm, nome_cliente, marca, placa, ano, modelo, cor);
    }
	
    public void alterar(Statement stm, String marca, String placa, int ano, String modelo, String cor, int idCliente) throws SQLException
    {
	dao.alterar(stm, marca, placa, ano, modelo, cor, idCliente);
    }
	
    public ResultSet consultar(Statement stm, String placa) throws SQLException
    {
	return dao.consultar(stm, placa);
    }
	
    public void excluir(Statement stm, String placa) throws SQLException
    {
	dao.excluir(stm, placa);
    }
}
