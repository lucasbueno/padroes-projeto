
public class Main {

	public static void main(String[] args) {
				
		Produto pf1 = new ProdutoFisico(100, 1000, 111);
		Produto pf2 = new ProdutoFisico(200, 2000, 222);
		Produto pd1 = new ProdutoDigital(300, 5);
		Produto pa1 = new ProdutoAssinatura(100, 30);

		Carrinho c = new Carrinho();
		c.addProduto(pf1);
		c.addProduto(pf2);
		c.addProduto(pd1);
		c.addProduto(pa1);

		System.out.println("Preço: " + c.getTotal());
		System.out.println("Peso: " + c.getPeso());
	}

}
