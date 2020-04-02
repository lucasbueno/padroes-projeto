import java.util.HashMap;
import java.util.Map;

public class BancoOracle extends RecuperadorArquivo {
	private Map<String, Arquivo> bd = new HashMap<>();

	public BancoOracle(RecuperadorArquivo proximo) {
		super(proximo);
		bd.put("a", new Arquivo("a", "conteúdo a"));
	}

	protected Arquivo recuperaArquivo(String nome) {
		if (bd.containsKey(nome))
			return bd.get(nome);
		return null;
	}
}
