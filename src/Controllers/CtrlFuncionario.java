package Controllers;

import Classes.Funcionario;
import DAOs.DAOFuncionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CtrlFuncionario extends Funcionario
{
    DAOFuncionario dao = new DAOFuncionario();
    
    public List carregaJListFuncionario(Statement stm) throws SQLException
    {
        return dao.carregaJListFuncionario(stm);
    }
    
    public void adicionar(Statement stm, String nome, String rg, String cpf, String telefone, String celular, String email, String cep, String bairro, String cidade, String logradouro, String complemento, String estado, String numero, String tipo, String ctps, String salario, String senha) throws SQLException
    {
	dao.adicionar(stm, nome, rg, cpf, telefone, celular, email,  cep, bairro, cidade, logradouro, complemento, estado, numero, tipo, ctps, salario, senha);
    }
	
    public void alterar(Statement stm, String nome_anterior,String nome, String rg, String cpf, String telefone, String celular, String email, String cep, String bairro, String cidade, String logradouro, String complemento, String estado, String numero, String tipo, String ctps, double salario, String senha) throws SQLException
    {
	dao.alterar(stm, nome_anterior, nome, rg, cpf, telefone, celular, email, cep, bairro, cidade, logradouro, complemento, estado, numero, tipo, ctps, salario, senha);
    }
	
    public ResultSet consultar(Statement stm, String nome) throws SQLException
    {
	return dao.consultar(stm, nome);
    }
	
    public void excluir(Statement stm, String nome) throws SQLException
    {
	dao.excluir(stm, nome);
    }
	
    public void ValidarCPF()
    {
	
    }
}
