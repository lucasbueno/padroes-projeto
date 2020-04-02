import java.util.HashMap;
import java.util.Map;

public class ArquivosJSON extends RecuperadorArquivo {
	private Map<String, Arquivo> bd = new HashMap<>();

	public ArquivosJSON(RecuperadorArquivo proximo) {
		super(proximo);
		bd.put("c", new Arquivo("c", "conteúdo c"));
	}

	protected Arquivo recuperaArquivo(String nome) {
		if (bd.containsKey(nome))
			return bd.get(nome);
		return null;
	}
}
