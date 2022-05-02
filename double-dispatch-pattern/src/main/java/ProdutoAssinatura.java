
public class ProdutoAssinatura extends Produto {
	private int validade;

	public ProdutoAssinatura(double preco, int validade) {
		super(preco);
		this.validade = validade;
	}
	
	public void addPropriedades(Carrinho carrinho) {
		super.addPropriedades(carrinho);
		carrinho.addPropriedade(PropriedadesCarrinho.VALIDADE, validade);
	}
}
