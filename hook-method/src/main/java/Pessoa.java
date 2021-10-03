
public abstract class Pessoa {
	private String name;
	private double rendaMensal;

	public Pessoa(String name, double rendaMensal) {
		super();
		this.name = name;
		this.rendaMensal = rendaMensal;
	}

	public double calcularImpostoAnual() {
		return calcularImpostoMensal() * 12;
	}

	protected abstract double calcularImpostoMensal();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
}
