
public class ProdutoFisico extends Produto {
	private double peso;
	private double custoEmbalagem;

	public ProdutoFisico(double preco, double peso, double custoEmbalagem) {
		super(preco);
		this.peso = peso;
		this.custoEmbalagem = custoEmbalagem;
	}

	@Override
	public void addPropriedades(Carrinho carrinho) {
		super.addPropriedades(carrinho);
		carrinho.addPropriedade(PropriedadesCarrinho.PESO, peso);
		carrinho.addPropriedade(PropriedadesCarrinho.CUSTO_EMBALAGEM, custoEmbalagem);
	}

}
