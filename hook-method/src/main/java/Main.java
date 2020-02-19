
public class Main {

	public static void main(String[] args) {
		Pessoa joao = new PessoaFisica("João", 1000);
		Pessoa ifsc = new PessoaJuridica("IFSC", 1000);

		System.out.println("Imposto do " + joao.getName() + " é " + joao.calcularImpostoTotal());
		System.out.println("Imposto do " + ifsc.getName() + " é " + ifsc.calcularImpostoTotal());
	}

}
