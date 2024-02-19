import java.util.List;

public interface Professor {
    boolean login(String userName, String senha);
    List<Edital> listarEditais();
    List<Edital> buscarEdital(String termo);
    void postarEdital();
    void removerEdital(int idEdital);
    void editarEdital(int idEdital);


}