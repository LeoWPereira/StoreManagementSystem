package Controllers;

import Classes.Pessoa;
import DAOs.DAOPessoa;

public class CtrlPessoa extends Pessoa
{
    DAOPessoa dao = new DAOPessoa();
    
    public void excluir()
    {
	dao.excluir();
    }
	
    public void consultar()
    {
	dao.consultar();
    }
	
    public void alterar()
    {
	dao.alterar();
    }
	
    public void adicionar()
    {
	dao.adicionar();
    }
}
