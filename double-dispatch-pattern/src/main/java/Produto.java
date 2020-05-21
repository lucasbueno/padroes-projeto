
public abstract class Produto {
	private double preco;

	public Produto(double preco) {
		super();
		this.preco = preco;
	}

	public void addPropriedades(Carrinho carrinho) {
		carrinho.addPropriedade(PropriedadesCarrinho.PRECO, preco);
	}

}
