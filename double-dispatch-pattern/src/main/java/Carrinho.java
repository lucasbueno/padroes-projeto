import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrinho {
	private List<Produto> produtos;
	private Map<PropriedadesCarrinho, Double> propriedades;

	public void addProduto(Produto prod) {
		getProdutos().add(prod);
		prod.addPropriedades(this);
	}

	public void addPropriedade(PropriedadesCarrinho tipo, double valor) {
		getPropriedades().put(tipo, getPropriedades().get(tipo) + valor);
	}

	public double getTotal() {
		if (produtos.isEmpty())
			return 0.0;

		double total = 0;
		total += getPropriedades().get(PropriedadesCarrinho.PRECO);
		total += getPropriedades().get(PropriedadesCarrinho.CUSTO_ARMAZENAMENTO);
		total += getPropriedades().get(PropriedadesCarrinho.CUSTO_EMBALAGEM);

		return total;
	}
	
	public double getValidade() {
		return getPropriedades().get(PropriedadesCarrinho.VALIDADE);
	}

	public double getPeso() {
		return getPropriedades().get(PropriedadesCarrinho.PESO);
	}

	private List<Produto> getProdutos() {
		if (produtos == null)
			produtos = new ArrayList<Produto>();
		return produtos;
	}

	private Map<PropriedadesCarrinho, Double> getPropriedades() {
		if (propriedades == null) {
			propriedades = new HashMap<PropriedadesCarrinho, Double>();
			for (PropriedadesCarrinho tipo : PropriedadesCarrinho.values())
				propriedades.put(tipo, 0.0);
		}
		return propriedades;
	}

}
