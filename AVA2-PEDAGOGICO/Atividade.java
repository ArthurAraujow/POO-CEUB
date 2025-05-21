public class Tarefa {
    private String nome;
    private String detalhes;
    private double avaliacao;

    public Tarefa(String nome, String detalhes) {
        this.nome = nome;
        this.detalhes = detalhes;
        this.avaliacao = 0.0;
    }

    public void definirNota(double nota) {
        this.avaliacao = nota;
    }

    public String obterNome() {
        return nome;
    }

    public double consultarNota() {
        return avaliacao;
    }

    public String obterDetalhes() {
        return detalhes;
    }
}
