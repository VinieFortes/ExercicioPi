import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void escolaridadeDiretor() {
        Escolaridade escolaridade = new Escolaridade().setEscolaridade("Mestre");
        Professor diretor = new Professor();
        diretor.setEscolaridade(escolaridade);
        Escola escola = new Escola().setDiretor(diretor);
        assertEquals(escolaridade, escola.escolaridadeDiretor());
    }
    @Test
    void estadoAluno(){
        Escola escola = new Escola();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();
        estado.setEstado("Rio de Janeiro");
        cidade.setEstado(estado);
        escola.setCidade(cidade);
        assertEquals("Rio de Janeiro", escola.estadoDoAluno());
    }
}