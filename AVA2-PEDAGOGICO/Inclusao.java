import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<Aluno> listaAlunos;
    private List<Professor> listaProfessores;

    public Registro() {
        this.listaAlunos = new ArrayList<>();
        this.listaProfessores = new ArrayList<>();
    }

    public void adicionarAluno(Aluno novoAluno) {
        listaAlunos.add(novoAluno);
    }

    public void incluirAtividadeParaAluno(Aluno alunoSelecionado, Atividade novaAtividade) {
        alunoSelecionado.adicionarAtividade(novaAtividade);
    }

    public void adicionarProfessor(Professor novoProfessor) {
        listaProfessores.add(novoProfessor);
    }

    public void atribuirNota(Aluno aluno, String nomeAtividade, double valorNota) {
    }
}
