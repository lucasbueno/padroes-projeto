
public class ProdutoDigital extends Produto {
	private double custoArmazenamento;

	public ProdutoDigital(double preco, double custoArmazenamento) {
		super(preco);
		this.custoArmazenamento = custoArmazenamento;
	}

	public void addPropriedades(Carrinho carrinho) {
		super.addPropriedades(carrinho);
		carrinho.addPropriedade(PropriedadesCarrinho.CUSTO_ARMAZENAMENTO, custoArmazenamento);
	}
}
