
public class Main {

	public static void main(String[] args) {
		ProdutoFisico pf1 = new ProdutoFisico(100, 1000, 111);
		ProdutoFisico pf2 = new ProdutoFisico(200, 2000, 222);
		ProdutoDigital pd1 = new ProdutoDigital(300, 5);

		Carrinho c = new Carrinho();
		c.addProduto(pf1);
		c.addProduto(pf2);
		c.addProduto(pd1);

		System.out.println("Preço: " + c.getTotal());
		System.out.println("Peso: " + c.getPeso());
	}

}
