

package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pagamento
{
    private Date data;
    private SimpleDateFormat sdf;
    private float valor;
    private String descricao;

    public void Pagamento() { }
	
    public void setValor(float _valor) { }
	
    public float getValor() { return valor; }
	
    public void setDescricao(String _descricao) { }
	
    public String getDescricao() { return descricao; }
	
    public void setData(int dia, int mes, int ano) { }
	
    public Date getData() { return data; }
}
