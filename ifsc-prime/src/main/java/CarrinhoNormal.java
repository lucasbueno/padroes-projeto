
public class CarrinhoNormal extends CarrinhoAbstrato {

	@Override
	protected double calcularFrete() {
		return 70;
	}

	@Override
	protected double calcularPrecoDesconto(Produto p) {
		return p.getPreco();
	}

}
