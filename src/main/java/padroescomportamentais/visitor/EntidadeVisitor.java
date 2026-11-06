package padroescomportamentais.visitor;

public class EntidadeVisitor implements Visitor {

    public String exibir(Entidade pessoa) {
        return pessoa.aceitar(this);
    }


    @Override
    public String exibirAluno(Aluno aluno) {
        return "Aluno{" +
                "id='" + aluno.getId() + '\'' +
                ", nome='" + aluno.getNome() + '\'' +
                ", disciplina='" + aluno.getNomeDisciplina() + '\'' +
                '}';
    }

    @Override
    public String exibirAplicador(Aplicador aplicador) {
        return "Aplicador{" +
                "id='" + aplicador.getId() + '\'' +
                ", nome='" + aplicador.getNome() + '\'' +
                ", turma='" + aplicador.getTurma() + '\'' +
                '}';
    }

    @Override
    public String exibirCorretor(Corretor corretor) {
        return "Corretor{" +
                "id='" + corretor.getId() + '\'' +
                ", nome='" + corretor.getNome() + '\'' +
                ", disciplina='" + corretor.getNomeDisciplina() + '\'' +
                '}';
    }
}
