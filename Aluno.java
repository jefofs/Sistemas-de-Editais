import java.util.List;

public interface Aluno {
    boolean login(String userName, String senha);
    List<String> listarEditais();
    void inscreverNoEdital();
}
