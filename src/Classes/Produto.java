package Classes;

public class Produto
{
    private String cor;
    private int estoque_min;
    private int idFornecedor;
    private int id;
    private String marca;
    private String modelo;
    private String nome;
    private int quantidade;
    private float valor_custo;
    private float valor_venda;

    public void Produto() { }
	
    public void setCor(String _cor) {this.cor = _cor; }
	
    public String getCor() {return this.cor; }
	
    public void setEstoqueMin(int _estoque_min) {this.estoque_min = _estoque_min; }
	
    public int getEstoqueMin() {return this.estoque_min; }
	
    public void setFornecedorId(int _idFornecedor) {this.idFornecedor = _idFornecedor; }
	
    public int getFornecedorId() {return this.idFornecedor; }
	
    public void setId(int _id) {this.id = _id; }
	
    public int getId() {return this.id; }
	
    public void setMarca(String _marca) {this.marca = _marca; }
	
    public String getMarca() {return this.marca; }
	
    public void setModelo(String _modelo) {this.modelo = _modelo; }
	
    public String getModelo() {return this.modelo; }
	
    public void setNome(String _nome) {this.nome = _nome; }
	
    public String getNome() {return this.nome; }
	
    public void setQuantidade(int _quantidade) {this.quantidade = _quantidade; }
	
    public int getQuantidade() {return this.quantidade; }
	
    public void setValorCusto(float _valor_custo) {this.valor_custo = _valor_custo; }
	
    public float getValorCusto() {return this.valor_custo; }
	
    public void setValorVenda(float _valor_venda) {this.valor_venda = _valor_venda; }
	
    public float getValorVenda() {return this.valor_venda; }
}
