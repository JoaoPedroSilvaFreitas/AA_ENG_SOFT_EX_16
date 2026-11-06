package padroescomportamentais.visitor;

public class Corretor implements Entidade {

    private int id;
    private String nome;
    private Disciplina disciplina;

    public Corretor(int id, String nome, Disciplina disciplina) {
        this.id = id;
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeDisciplina() {
        return this.disciplina.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCorretor(this);
    }

}
