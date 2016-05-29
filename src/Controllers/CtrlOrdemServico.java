package Controllers; 

import DAOs.DAOOrdemServico;
import autopecas.OrdemServico;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

public class CtrlOrdemServico extends OrdemServico
{ 
    DAOOrdemServico dao = new DAOOrdemServico();
    
    public Calendar converteData(String data)
    {
        Calendar cal = Calendar.getInstance();
        
        //String novaData = "";
        //novaData += data.subSequence(6, 9);
        //novaData += "-";
        
        String[] novaData = new String[3]; 
        
        novaData[0] = data.subSequence(0, 2).toString();
        novaData[1] = data.subSequence(3, 5).toString();
        novaData[2]= data.subSequence(6, 10).toString();
        
        try
        {
            cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(novaData[0]));
            cal.set(Calendar.MONTH, Integer.parseInt(novaData[1]) - 1);
            cal.set(Calendar.YEAR, Integer.parseInt(novaData[2]));
        }
        catch(Exception e) { }
        
        return cal;
    }
    
    public void adicionar(Statement stm, String descricao, Calendar data, int idCliente, int idVeiculo, String placa) throws SQLException
    {
	dao.adicionar(stm, descricao, data, idCliente, idVeiculo, placa);
    }
}