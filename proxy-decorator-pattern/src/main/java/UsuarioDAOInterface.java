
public interface UsuarioDAOInterface {

	public void addUsuario(String nome) throws UsuarioException;

	public Usuario getUsuario(String nome) throws UsuarioException;
}
