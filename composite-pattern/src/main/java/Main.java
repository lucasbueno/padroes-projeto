
public class Main {
	public static void main(String[] args) {
		TrechoAereo simplesA = new TrechoSimples("Curitiba", "Canoinhas", 50);
		TrechoAereo simplesB = new TrechoSimples("Canoinhas", "São Paulo", 100);
		TrechoAereo simplesC = new TrechoSimples("São Paulo", "Nova York", 500);
		TrechoAereo simplesD = new TrechoSimples("Nova York", "Três Barras", 500);

		TrechoAereo compostoA = new TrechoComposto(simplesC, simplesD, 10);
		TrechoAereo compostoB = new TrechoComposto(simplesB, compostoA, 10);
		TrechoAereo trechoFinal = new TrechoComposto(simplesA, compostoB, 10);

		System.out.println(trechoFinal);
		System.out.println("Preço do trecho: " + trechoFinal.getPreco());
	}
}
