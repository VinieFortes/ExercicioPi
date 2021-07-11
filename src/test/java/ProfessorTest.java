import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void escolaridadeProfessor(){
        Escolaridade escolaridade = new Escolaridade();
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        escolaridade.setEscolaridade("Mestre");
        assertEquals(escolaridade, professor.getEscolaridade());
    }

    @Test
    void TipoEnsinoContratado() {
        TipoEnsino tipoEnsino = new TipoEnsino().setTipoEnsino("Graduação");
        Curso curso = new Curso().setTipoEnsino(tipoEnsino);
        Professor professor = new Professor().setContratadoCurso(curso);
        assertEquals(tipoEnsino, professor.getTipoEnsinoContratado());
    }

    @Test
    void cidadeNascimentoProfessor() {
        Cidade cidade = new Cidade();
        cidade.setNomeCidade("São Paulo");
        Professor professor = new Professor();
        professor.setNaturalidade(cidade);
        assertEquals(cidade, professor.cidadeNascimento());
    }

}