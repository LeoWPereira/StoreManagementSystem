package Classes; 

import java.util.Date;

public class OrdemServico
{ 
    private String descricao;
    
    private int idCliente;
    private int idOrdemServico;
    private int idVeiculo;
    private Date data;
    
    public void setDescricao(String x) { descricao = x; }
    
    public String getDescricao() { return descricao; }
    
    public void setIdCliente(int x) { idCliente =  x; }
    
    public int getIdCliente() { return idCliente; }
    
    public void setIdVeiculo(int x) { idVeiculo = x; }
    
    public int getIdVeiculo() { return idVeiculo; }
    
    public void setIdOrdemServico(int x) { idOrdemServico = x; }
    
    public int getIdOrdemServico() { return idOrdemServico; }
    
    public void setData(Date x) { data = x; }
    
    public Date getData() { return data; }
} 