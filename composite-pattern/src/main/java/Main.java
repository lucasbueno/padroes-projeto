
public class Main {
	public static void main(String[] args) {
		TrechoSimples simplesA = new TrechoSimples("Curitiba", "Canoinhas", 50);
		TrechoSimples simplesB = new TrechoSimples("Canoinhas", "São Paulo", 100);
		TrechoSimples simplesC = new TrechoSimples("São Paulo", "Nova York", 500);
		TrechoSimples simplesD = new TrechoSimples("Nova York", "Três Barras", 500);

		TrechoComposto compostoA = new TrechoComposto(simplesC, simplesD, 10);
		TrechoComposto compostoB = new TrechoComposto(simplesB, compostoA, 10);
		TrechoComposto trechoFinal = new TrechoComposto(simplesA, compostoB, 10);

		System.out.println(trechoFinal);
		System.out.println("Preço do trecho: " + trechoFinal.getPreco());
	}
}
