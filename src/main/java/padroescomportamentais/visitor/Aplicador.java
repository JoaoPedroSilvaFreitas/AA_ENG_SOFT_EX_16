package padroescomportamentais.visitor;

public class Aplicador implements Entidade {

    private int id;
    private String nome;
    private String turma;

    public Aplicador(int id, String nome, String turma) {
        this.id = id;
        this.nome = nome;
        this.turma = turma;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAplicador(this);
    }

}
