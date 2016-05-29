//cara acho que tem que criar um vetor com os produtos associados a esse vendedor né. mas talvez
//não precise pq se for o caso de usar dá pra pesquisar os produtos que tem o idFornecedor que bate

package Classes;

public class Fornecedor extends Pessoa
{
    private String cnpj;
	
    public void Fornecedor() {}
	
    public void setCNPJ(String _cnpj) {this.cnpj = _cnpj; }
	
    public String getCNPJ() {return this.cnpj; }
}
