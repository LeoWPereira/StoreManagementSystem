//acho uma boa a gente fazer vetores de ordens de servico, veiculos e vendas pra ter registrado

//tem que ver o esquema do balanco depois

package Classes;

public class Pessoa
{
    private String celular;
    private String email;
    private String telefone;
    private int id;
    private String nome;
    private int balanco;
    private Endereco endereco;

    public void Pessoa() { }
	
    public void setCelular(String _celular) {this.celular = _celular; }
	
    public String getCelular() {return this.celular; }
	
    public void setEmail(String _email) {this.email = _email; }
	
    public String getEmail() {return this.email; }
	
    public void setTelefone(String _telefone) {this.telefone = _telefone; }
	
    public String getTelefone() {return this.telefone; }
	
    public void setId(int _id) {this.id = _id; }
	
    public int getId() {return this.id; }
	
    public void setNome(String _nome) {this.nome = _nome; }
	
    public String getNome() {return this.nome; }
}
