// talvez tenha que criar um vetor com as listas de servico que estao associados a uma instancia do
//veiculo, dai isso ajuda na hora de fazer o relatorio...

package Classes;

public class Veiculo
{
    private int ano;
    private String cor;
    private int id;
    private int idCliente;
    private String marca;
    private String modelo;
    private String placa;

    public void Veiculo() { }
	
    public void setAno(int _ano) {this.ano = _ano; }
	
    public int getAno() {return this.ano; }
	
    public void setCor(String _cor) {this.cor = _cor; }
	
    public String getCor() {return this.cor; }
	
    public void setId(int _id) {this.id = _id; }
	
    public int getId() {return this.id; }
	
    public void setIdCliente(int _idCliente) {this.idCliente = _idCliente; }
	
    public int getIdCliente() {return this.idCliente; }
	
    public void setMarca(String _marca) {this.marca = _marca; }
	
    public String getMarca() {return this.marca; }
	
    public void setModelo(String _modelo) {this.modelo = _modelo; }
	
    public String getModelo() {return this.modelo; }
	
    public void setPlaca(String _placa) {this.placa = _placa; }
	
    public String getPlaca() {return this.placa; }
}
