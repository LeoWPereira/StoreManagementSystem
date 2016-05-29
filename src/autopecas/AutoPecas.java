package autopecas;

import BancoDeDados.Conexao;
import Controllers.CtrlCliente;
import GUI.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AutoPecas
{
    public static void main(String[] args)
    {
        Connection con = (Connection) Conexao.getConnection();//pega conexao e conecta.
        System.out.println(Conexao.status);//imprime estado da conexao
        
        JFramePrincipal jfp = new JFramePrincipal();
        jfp.show();
    }
}