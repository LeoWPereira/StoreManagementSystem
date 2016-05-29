package autopecas;

import GUI.JOrdemServico;
import java.util.*;

public class OrdemServico { 
    
    private int cod_ordem;
    private int cod_cliente;
    private int cod_veiculo;
    private String descricao;
    private Date data;
    private int preco;
    private boolean confirmada;
    
    public OrdemServico()
    {
        JOrdemServico jos = new JOrdemServico();
        jos.show();
    }
    
    public int getCodOrdem(){
        return this.cod_ordem;
    }
    
    public void setCodOrdem(int c){
        this.cod_ordem = c;
    }
    
    public int getCodCliente(){
        return this.cod_cliente;
    }
    
    public void setCodCliente(int c){
        this.cod_cliente = c;
    }
    
    public int getCodVeiculo(){
        return this.cod_veiculo;
    }
    
    public void setCodVeiculo(int c){
        this.cod_veiculo = c;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String d){
        this.descricao = d;
    }
    
    public int getPreco(){
        return this.preco;
    }
    
    public void setPreco(int p){
        this.preco = p;
    }
    
} 