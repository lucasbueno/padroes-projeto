import java.util.Stack;

public class ExecutorComandos {
	private Stack<Comando> feitos;
	private Stack<Comando> desfeitos;

	public ExecutorComandos() {
		super();
		this.feitos = new Stack<Comando>();
		this.desfeitos = new Stack<Comando>();
	}

	public String fazer(Comando c) {
		feitos.push(c);
		desfeitos.clear();
		return c.fazer();
	}

	public String desfazer() {
		if (feitos.isEmpty())
			return "";

		Comando c = feitos.pop();
		desfeitos.push(c);
		return c.desfazer();
	}

	public String refazer() {
		if (desfeitos.isEmpty())
			return "";

		Comando c = desfeitos.pop();
		feitos.push(c);
		return c.fazer();
	}
}
