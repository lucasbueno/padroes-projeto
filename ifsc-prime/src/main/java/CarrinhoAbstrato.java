import java.util.ArrayList;
import java.util.List;

public abstract class CarrinhoAbstrato {

	private List<Produto> produtos;

	public double calcularTotal() {
		double total = 0;
		for (Produto p : produtos)
			total += calcularPrecoDesconto(p);
		total += calcularFrete();
		return total;
	}

	public void addProduto(Produto p) {
		getProdutos().add(p);
	}

	protected abstract double calcularFrete();
	
	protected abstract double calcularPrecoDesconto(Produto p);

	// inicialização preguiçosa
	public List<Produto> getProdutos() {
		if (produtos == null)
			produtos = new ArrayList<Produto>();
		return produtos;
	}
}
