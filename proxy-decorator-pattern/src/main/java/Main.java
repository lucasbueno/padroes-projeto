
public class Main {

	public static void main(String[] args) {
		UsuarioDAOInterface usuarioDAO = new UsuarioDAODecorator();
		
		try {
			usuarioDAO.addUsuario("");
		} catch (UsuarioException e) {
			System.err.println("Não consegui adicionar o usuário vazio.");
			System.err.println(e.getMessage());
		}
		
		try {
			usuarioDAO.addUsuario("Teste");
		} catch (UsuarioException e) {
			System.err.println("Não consegui adicionar o usuário Teste.");
			System.err.println(e.getMessage());
		}
		
		try {
			Usuario u = usuarioDAO.getUsuario("lala");
			System.out.println(u.getNome());
		} catch (UsuarioException e) {
			System.err.println("Não consegui recuperar o usuário lala.");
			System.err.println(e.getMessage());
		}
		
		try {
			Usuario u = usuarioDAO.getUsuario("Teste");
			System.out.println(u.getNome());
		} catch (UsuarioException e) {
			System.err.println("Não consegui recuperar o usuário Teste.");
			System.err.println(e.getMessage());
		}
	}

}
