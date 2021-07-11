import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void escolaridadeCoordenador() {
        Professor coordenador = new Professor();
        Escolaridade escolaridade = new Escolaridade().setEscolaridade("Graduado");
        coordenador.setEscolaridade(escolaridade);
        Curso curso = new Curso().setCoordenador(coordenador);
        assertEquals(escolaridade, curso.escolaridadeCoordenador());
    }
}