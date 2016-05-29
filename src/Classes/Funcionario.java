//talvez valha a pena fazer vetor de vendas pra comissao e tal...

package Classes;

public class Funcionario extends Pessoa
{
    private float comissao; //float pq eh % entao fica 1.x
    private String cpf;
    private String ctps;
    private String rg;
    private float salario;
    private String senha;
    private int tipo_funcionario; //1-gerente 2-mecanico 3-vendedor
    private int idFuncionario;
        
    public void Funcionario() {}
	
    public void setComissao(float _comissao) {this.comissao = _comissao; }
	
    public float getComissao() {return this.comissao; }
	
    public void setCPF(String _cpf) {this.cpf = _cpf; }
	
    public String getCPF() {return this.cpf; }
	
    public void setCTPS(String _ctps) {this.ctps = _ctps; }
	
    public String getCTPS() {return this.ctps; }
	
    public void setRG(String _rg) {this.rg = _rg; }
	
    public String getRG() {return this.rg; }
	
    public void setSalario(float _salario) {this.salario = _salario; }
	
    public float getSalario() {return this.salario; }
	
    public void setSenha(String _senha) {this.senha = _senha; }
	
    public String getSenha() {return this.senha; }
	
    public void setTipo(int _tipo) {this.tipo_funcionario = _tipo; }
	
    public int getTipo() {return this.tipo_funcionario; }
}
