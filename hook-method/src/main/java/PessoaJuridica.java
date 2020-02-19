
public class PessoaJuridica extends Pessoa {
	
	public PessoaJuridica(String name, double rendaMensal) {
		super(name, rendaMensal);
	}

	@Override
	protected double calcularImpostoMensal() {
		return this.getRendaMensal() * 0.2;
	}
}
