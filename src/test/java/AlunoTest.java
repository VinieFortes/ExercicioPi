import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
        void estadoNaturalidade() {
            Aluno aluno = new Aluno();
            Cidade cidade = new Cidade();
            Estado estado = new Estado();
            estado.setEstado("Rio de Janeiro");
            cidade.setEstado(estado);
            aluno.setNaturalidade(cidade);
            assertEquals("Rio de Janeiro", aluno.getNaturalidade().getEstado().RetornaEstado());
        }
    @Test
        void CoordenadorCurso() {
            Aluno aluno = new Aluno();
            Curso curso = new Curso();
            Professor coordenador = new Professor();
            coordenador.setNome("Marco");
            curso.setCoordenador(coordenador);
            aluno.setCursoMatriculado(curso);
            assertEquals("Marco", aluno.getCoordenador().getNome());
    }
}