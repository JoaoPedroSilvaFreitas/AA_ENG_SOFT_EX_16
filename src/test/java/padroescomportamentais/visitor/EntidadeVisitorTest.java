package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntidadeVisitorTest {

    @Test
    void deveExibirCorretor() {
        Corretor corretor = new Corretor(1, "Ana", new Disciplina("Matemática"));

        EntidadeVisitor visitor = new EntidadeVisitor();
        assertEquals("Corretor{id='1', nome='Ana', disciplina='Matemática'}", visitor.exibir(corretor));
    }

    @Test
    void deveExibirAplicador() {
        Aplicador aplicador = new Aplicador(1, "Maria", "A");

        EntidadeVisitor visitor = new EntidadeVisitor();
        assertEquals("Aplicador{id='1', nome='Maria', turma='A'}", visitor.exibir(aplicador));
    }

    @Test
    void deveExibirAluno() {
        Aluno aluno = new Aluno(1, "Pedro", new Disciplina("Lingua Portuguesa"));

        EntidadeVisitor visitor = new EntidadeVisitor();
        assertEquals("Aluno{id='1', nome='Pedro', disciplina='Lingua Portuguesa'}", visitor.exibir(aluno));
    }

}