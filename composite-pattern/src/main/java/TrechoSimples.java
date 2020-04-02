public class TrechoSimples implements TrechoAereo {
	private String origem;
	private String destino;
	private double preco;

	public TrechoSimples(String origem, String destino, double preco) {
		this.origem = origem;
		this.destino = destino;
		this.preco = preco;
	}

	public String getOrigem() {
		return origem;
	}

	public String getDestino() {
		return destino;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "[Origem:" + origem + ", destino:" + destino + "]";
	}

}
