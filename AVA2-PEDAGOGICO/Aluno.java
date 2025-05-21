import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario {
    private String turma;
    private List<Atividade> listaAtividades;

    public Aluno(String nome, String turma) {
        super(nome);
        this.turma = turma;
        this.listaAtividades = new ArrayList<>();
    }

    public void inserirAtividade(Atividade atividade) {
        listaAtividades.add(atividade);
    }

    public List<Atividade> obterAtividades() {
        return listaAtividades;
    }

    public String consultarTurma() {
        return turma;
    }
}
