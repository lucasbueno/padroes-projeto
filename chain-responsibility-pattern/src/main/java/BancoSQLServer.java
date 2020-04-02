import java.util.HashMap;
import java.util.Map;

public class BancoSQLServer extends RecuperadorArquivo {
	private Map<String, Arquivo> bd = new HashMap<>();

	public BancoSQLServer(RecuperadorArquivo proximo) {
		super(proximo);
		bd.put("b", new Arquivo("b", "conteúdo b"));
	}

	protected Arquivo recuperaArquivo(String nome) {
		if (bd.containsKey(nome))
			return bd.get(nome);
		return null;
	}
}
