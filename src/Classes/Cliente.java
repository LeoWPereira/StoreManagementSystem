package Classes;

public class Cliente extends Pessoa
{
    private int balanco;
    
    private String rg;
    private String cpf;
    private String cnpj;
    
    public void Cliente()
    {
	
    }
	
    public void setBalanco(int _balanco) {this.balanco = _balanco; }
	
    public int getBalanco() {return this.balanco; }
    
    public void setRG(String _rg) {this.rg = _rg; }
	
    public String getRG() {return this.rg; }
	
    public void setCPF(String _cpf) {this.cpf = _cpf; }
	
    public String getCPF() {return this.cpf; }
	
    public void validaCPF()
    {
        
    }
    
    public void setCNPJ(String _cnpj) { this.cnpj = _cnpj; }
	
    public String getCNPJ() { return cnpj; }
	
    public void validaCNPJ()
    {
        
    }
}
