import java.util.List;

public interface Administrador {
    void criarContaAluno(String userName, String nome, String senha);
    void criarContaProfessor(String userName, String nome, String senha);
    List<String> verListaUsuarios();
    void removerConta(int idUsuario);
}