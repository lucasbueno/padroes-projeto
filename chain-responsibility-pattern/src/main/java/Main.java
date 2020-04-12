
public class Main {

	public static void main(String[] args) {
		try {
			RecuperadorArquivo arquivos = new BancoOracle(new BancoSQLServer(new ArquivosJSON(null)));
			Arquivo c = arquivos.recuperar("c");
			System.out.println("Conteúdo de c: " + c.getConteudo());

			Arquivo d = arquivos.recuperar("d");
			System.out.println("Conteúdo de d: " + d.getConteudo());
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
		}
	}

}
