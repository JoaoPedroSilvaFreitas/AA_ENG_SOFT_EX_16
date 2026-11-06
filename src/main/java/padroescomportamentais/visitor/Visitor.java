package padroescomportamentais.visitor;

public interface Visitor {

    String exibirAluno(Aluno aluno);
    String exibirAplicador(Aplicador aplicador);
    String exibirCorretor(Corretor corretor);

}
