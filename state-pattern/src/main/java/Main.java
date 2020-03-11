import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		No a = new No("A");
		No b = new No("B");
		No c = new No("C");
		No d = new No("D");
		No e = new No("E");
		No f = new No("F");
		No g = new No("G");
		No h = new No("H");
		a.addAdjacente(b);
		c.addAdjacente(d);
		a.addAdjacente(e);
		f.addAdjacente(c);
		f.addAdjacente(h);
		b.addAdjacente(c);
		d.addAdjacente(b);
		e.addAdjacente(f);
		f.addAdjacente(g);
		a.addAdjacente(h);

		List<No> visitados = new ArrayList<>();
		a.buscaProfundidade(visitados);
		for (No no : visitados)
			System.out.println(no);
	}
}
