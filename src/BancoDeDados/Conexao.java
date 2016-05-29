package BancoDeDados;

import java.sql.*;

public class Conexao
{
	public static String status = "";

	public static Connection getConnection()
	{
		Connection con = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");//pega a classe Driver
			String url = "jdbc:mysql://localhost/mydb?user=root&password=280793";
			
			con = DriverManager.getConnection(url);//conecta ao banco.
			status = "Conexao Aberta";//muda o status para conex�o aberta.
		}
		catch (ClassNotFoundException e)
		{
			status = e.getMessage();
		}
		catch (SQLException e)
		{
			status = e.getMessage();
		}
		catch (Exception e)
		{
			status = e.getMessage();
		}
		
		return con;//retorna a conexao.
	}	
}