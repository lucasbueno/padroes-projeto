
public class CarrinhoPrime extends CarrinhoAbstrato {

	@Override
	protected double calcularFrete() {
		return 0;
	}

	@Override
	protected double calcularPrecoDesconto(Produto p) {
		if (p.getPreco() < 50)
			return p.getPreco() - p.getPreco() * 0.02;

		if (p.getPreco() < 200)
			return p.getPreco() - p.getPreco() * 0.05;
		
		if(p.getPreco() < 2001)
			return p.getPreco() - p.getPreco() * 0.1;
		
		return p.getPreco() - p.getPreco() * 0.2;
	}

}
