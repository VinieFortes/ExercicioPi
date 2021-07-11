public class Aluno extends Pessoa{

    private Curso curso;

    public Estado estado(){
        return curso.getEscola().getCidade().getEstado();
    }

    public Professor getCoordenador(){
        return curso.getCoordenador();
    }

    public Curso getCursoMatriculado() {
        return curso;
    }

    public Aluno setCursoMatriculado(Curso curso) {
        this.curso = curso;
        return this;
    }
}