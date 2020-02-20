
public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("playstation", 2000);
		
		CarrinhoAbstrato normal = new CarrinhoNormal();
		normal.addProduto(p1);
		
		CarrinhoPrime prime = new CarrinhoPrime();
		prime.addProduto(p1);
		
		System.out.println("Normal = " + normal.calcularTotal());
		System.out.println("Prime = " + prime.calcularTotal());
	}

}
