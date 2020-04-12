public abstract class RecuperadorArquivo {
	private RecuperadorArquivo proximo;

	public RecuperadorArquivo(RecuperadorArquivo proximo) {
		this.proximo = proximo;
	}

	public Arquivo recuperar(String nome) {
		Arquivo a = recuperaArquivo(nome);
		if (a == null)
			return chamarProximo(nome);
		else
			return a;
	}

	private Arquivo chamarProximo(String nome) {
		if (proximo == null)
			throw new RuntimeException("Não foi possível recuperar o arquivo " + nome);
		return proximo.recuperar(nome);
	}

	// Prestar atenção que este método é protected
	protected abstract Arquivo recuperaArquivo(String nome);
}
